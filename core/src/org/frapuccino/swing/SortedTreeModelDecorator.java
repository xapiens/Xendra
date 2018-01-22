//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.frapuccino.swing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * This is an tree model decorator that sorts the underlying tree model.
 * This decorator is to be used between the JTree view and the original tree model if the
 * original tree model can or should not be sorted. Note, that this tree model should only
 * be used when the underlying TreeModel is readonly. Changing a tree nodes object (and place
 * in the sorted tree list) will have the side-effect such as resetting the JTree's current
 * selection and all children of the tree nodes will be collapsed. If the tree model is not
 * read-only, or if the selection should not be reset, then use the
 * @link org.frappucino.swing.SortedJTree. But for simple displays of a JTree that can
 * be sorted in different ways, this class will be enough.
 * <p>
 * This decorator listens on the original tree model in order to get all events that
 * has changed the original tree model. The events gets transformed to correlate
 * to the sorted tree model and sent onwards to the real listeners. Due to the design of the
 * tree event handling, there is no way to notify the listeners that some tree nodes has
 * swapped places in the tree. This decorator will notify all listeners that the tree node
 * has been removed and then re-inserted. This is the only way to be sure that all listeners
 * (including the JTree itself) are notified according to the contract of the TreeModel.
 * <p>
 * The class caches the original models tree structure. Each parent that has one or more
 * children stores a list of the childrens indicies in a map for future references. This map
 * and list is then used for the incoming events (from the original model) that notifies
 * that some children has been removed or changed. The indexes from the original event
 * is then mapped to the indexes stored in the list for that parent.
 * <p>
 * @author redsolo
 * @see org.frapuccino.swing.SortedJTree Use SortedJTree if you have a model that is writable.
 */
public class SortedTreeModelDecorator implements TreeModel {

    /** The original tree model that has all the actual data that this decorator uses. */
    private TreeModel originalModel;

    /** All listeners of this tree model. */
    private List listeners;

    /** The comparator to use when sorting the tree. */
    private Comparator sortingComparator;

    /** A list of children of the latest query. It is stored for better performance. */
    private List   latestChildList;
    /** The children in the above list has this object as its parent. */
    private Object latestChildListsParent;

    /** A hashtable of all known parents that has childs. The value is a list of each childs
     * index in the original tree model. */
    private Map cachedOriginalIndicies;

    /** The Listener added to the original model. */
    private OriginalModelListener originalModelListener = new OriginalModelListener();

    /**
     * Creates a sorted TreeModel that retrieves the data from the original tree model.
     * The tree model is sorted alphabetically based by each nodes toString() method.
     * @param original the mode that is to be displayed as sorted.
     */
    public SortedTreeModelDecorator(TreeModel original) {
        this(original, new LowerCaseObjectStringComparator());
    }

    /**
     * Creates a sorted TreeModel that retrieves the data from the original tree model.
     * @param original the mode that is to be displayed as sorted.
     * @param comparator the comparator object to use when sorting the tree model.
     */
    public SortedTreeModelDecorator(TreeModel original, Comparator comparator) {
        originalModel = original;
        listeners = new LinkedList();
        cachedOriginalIndicies = new HashMap();
        //original.addTreeModelListener(new OriginalModelListener());
        sortingComparator = comparator;
        populateTreeCache(original.getRoot());
    }

    /**
     * Resets the current latest child list, so it is retrieved from the original model next time.
     */
    private void resetLatestChildList() {
        latestChildListsParent = null;
        latestChildList = null;
    }

    /**
     * Populates the cache of the original tree models cache.
     * This goes through all parents and store their childs internal index into
     * a list which is used by mapping incoming events to their index in the sorted
     * list.
     * @param parent the parent to cache.
     */
    private void populateTreeCache(Object parent) {

        int childCount = getChildCount(parent);
        for (int i = 0; i < childCount; i++) {
            if (getChildCount(parent) > 0) {

                Object child = getChild(parent, i);
                populateTreeCache(child);
            }
        }
    }

    /**
     * Returns the children for the treenode as a sorted list.
     * @param parent the parent tree node to get all children for.
     * @return a sorted List containing all children for the parent.
     */
    private List getChildList(Object parent) {
        List childList;
        if (parent == latestChildListsParent) {
            childList = latestChildList;
        } else {

            childList = new ArrayList();
            int childCount = originalModel.getChildCount(parent);
            for (int i = 0; i < childCount; i++) {
                Object child = originalModel.getChild(parent, i);
                childList.add(child);
            }
            Collections.sort(childList, sortingComparator);

            latestChildList = childList;
            latestChildListsParent = parent;

            List childNameList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                childNameList.add(i, new Integer(originalModel.getIndexOfChild(parent, latestChildList.get(i))));
            }
            cachedOriginalIndicies.put(parent, childNameList);
        }
        return childList;
    }

    /**
     * Set a new comparator to use when sorting the tree model.
     * @param comparator the new comparator to use.
     */
    public final void setSortingComparator(Comparator comparator) {
        resetLatestChildList();
        sortingComparator = comparator;
        fireTreeStructureChanged(new TreeModelEvent(this, new TreePath(getRoot())));
    }

    /**
     * @return Returns the sortingComparator.
     */
    public final Comparator getSortingComparator() {
        return sortingComparator;
    }

    //
    // TreeModel methods
    //

    /** {@inheritDoc} */
    public Object getChild(Object parent, int index) {
        return getChildList(parent).get(index);
    }

    /** {@inheritDoc} */
    public int getIndexOfChild(Object parent, Object child) {
        int index = -1;
        List childs = getChildList(parent);
        int childCount = childs.size();
        for (int i = 0; (i < childCount) && (index == -1); i++) {
            if (childs.get(i).equals(child)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Current implementation invokes this method on the original tree model without any changes.
     */
    public Object getRoot() {
        return originalModel.getRoot();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Current implementation invokes this method on the original tree model without any changes.
     */
    public int getChildCount(Object parent) {
        return originalModel.getChildCount(parent);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Current implementation invokes this method on the original tree model without any changes.
     */
    public boolean isLeaf(Object node) {
        return originalModel.isLeaf(node);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Current implementation invokes this method on the original tree model without any changes.
     */
    public void valueForPathChanged(TreePath path, Object newValue) {
        originalModel.valueForPathChanged(path, newValue);
    }

    /** {@inheritDoc} */
    public void addTreeModelListener(TreeModelListener l) {
        if (listeners.size() == 0) {
            originalModel.addTreeModelListener(originalModelListener);
        }
        listeners.add(l);
    }

    /** {@inheritDoc} */
    public void removeTreeModelListener(TreeModelListener l) {
        listeners.remove(l);
        if (listeners.size() == 0) {
            originalModel.removeTreeModelListener(originalModelListener);
        }
    }

    //
    // Notification methods
    //

    /**
     * Notify all tree model listeners that some nodes/childs has been inserted.
     * @param event the tree model event.
     */
    protected void fireNodesInsertedEvent(TreeModelEvent event) {
        for (Iterator iter = listeners.iterator(); iter.hasNext();) {
            ((TreeModelListener) iter.next()).treeNodesInserted(event);
        }
    }

    /**
     * Notify all tree model listeners that some nodes/childs has been changed.
     *
     * @param event the tree model event.
     */
    protected void fireNodesChangedEvent(TreeModelEvent event) {
        if (event.getChildIndices().length == 1) {
            for (Iterator iter = listeners.iterator(); iter.hasNext();) {
                ((TreeModelListener) iter.next()).treeNodesChanged(event);
            }
        } else {
            fireNodesRearrangedEvent(event);
        }
    }

    /**
     * Notify all tree model listeners that some nodes has been re-arranged.
     * This will fire two event, one event depicting the removal of the tree nodes
     * and the second for the the insertion of them again. This has to be done
     * due to the fact the the @link TreeModelListener#treeNodesChanged(javax.swing.event.TreeModelEvent)
     * will only reflect changes of their representation and not their place in the
     * child list. Removing the tree nodes and then re-inserting them will make sure
     * that all tree model listeners are notified in the correct way.
     * @param event event containing which tree nodes that has been rearranged.
     */
    protected void fireNodesRearrangedEvent(TreeModelEvent event) {
        fireNodesRemovedEvent(event);
        fireNodesInsertedEvent(event);
    }

    /**
     * Notify all tree model listeners that some nodes/childs has been removed.
     * @param event the tree model event.
     */
    protected void fireNodesRemovedEvent(TreeModelEvent event) {
        for (Iterator iter = listeners.iterator(); iter.hasNext();) {
            ((TreeModelListener) iter.next()).treeNodesRemoved(event);
        }
    }

    /**
     * Notify all tree model listeners that the tree structure has changed.
     * @param event the tree model event.
     */
    protected void fireTreeStructureChanged(TreeModelEvent event) {
        for (Iterator iter = listeners.iterator(); iter.hasNext();) {
            ((TreeModelListener) iter.next()).treeStructureChanged(event);
        }
    }

    /**
     * A tree model listener that listens for changes on the original tree model.
     * This handles the actual notifying of listeners on this tree model. The class
     * is notified of changes in the original tree model, and then converts the incoming
     * events to an event that correspond to the list it has presented.
     *
     * @author redsolo
     */
    private class OriginalModelListener implements TreeModelListener {

        /**
         * Returns the parent node for the event.
         * @param event the event.
         * @return the parent node for the event.
         */
        private Object getParentNodeFromEvent(TreeModelEvent event) {
            Object[] paths = event.getPath();
            return paths[paths.length - 1];
        }

        /**
         * Returns a new TreeEvent that has the correct changed children indexes and objects.
         * This method takes the indicies array from the old event, changes the indexing so it
         * corresponds to the sorted model list, and then sorts the indicies in ascending order.
         * @param oldEvent the event from the original model.
         * @return a new TreeEvent for this sorted tree model.
         */
        private TreeModelEvent getSortedTreeEvent(TreeModelEvent oldEvent) {
        	
            int numberOfChilds = oldEvent.getChildIndices().length;
            Object parentNode = getParentNodeFromEvent(oldEvent);

            int[] oldEventIndicies = oldEvent.getChildIndices();
            Object[] oldEventChilds = oldEvent.getChildren();
            int[] newEventIndicies = new int[oldEventIndicies.length];
            Object[] newEventChilds = new Object[numberOfChilds];

            for (int i = 0; i < oldEventIndicies.length; i++) {
                int newIndex = getIndexOfChild(parentNode, oldEventChilds[i]);
                newEventIndicies[i] = newIndex;
            }

            Arrays.sort(newEventIndicies);
            for (int i = 0; i < numberOfChilds; i++) {
                newEventChilds[i] = getChild(parentNode, newEventIndicies[i]);
            }
            return new TreeModelEvent(this, oldEvent.getPath(), newEventIndicies, newEventChilds);
        }

        /** {@inheritDoc} */
        public void treeNodesInserted(TreeModelEvent e) {
            //the new event needs the new indicies
            resetLatestChildList();
            fireNodesInsertedEvent(getSortedTreeEvent(e));
        }

        /** {@inheritDoc} */
        public void treeNodesChanged(TreeModelEvent e) {
            Object parent = getParentNodeFromEvent(e);
            
            List orgNameList = (List) cachedOriginalIndicies.get(parent);
            
            resetLatestChildList();

            if (orgNameList != null) {    
            	fireNodesChangedEvent(getSortedTreeEvent(e));
            } else {
                //We could not find out what the old indicies were, and therefore we are
                //forced to do a tree node structure change.
                fireTreeStructureChanged(new TreeModelEvent(this, e.getPath()));
            }
        }

        /** {@inheritDoc}
         * <p>
         * This implementation converts the original tree models child indexes to
         * indexes in the sorted list and notifies the listeners. */
        public void treeNodesRemoved(TreeModelEvent e) {
            Object parent = getParentNodeFromEvent(e);
            List oldIndexList = (List) cachedOriginalIndicies.get(parent);
            resetLatestChildList();

            if (oldIndexList != null) {

                int[] oldChildIndexes = e.getChildIndices();
                Object[] oldChildObject = e.getChildren();
                int[] newChildIndexes = new int[oldChildIndexes.length];

                for (int i = 0; i < oldChildIndexes.length; i++) {

                    int oldIndex = oldIndexList.indexOf(new Integer(oldChildIndexes[i]));
                    if (oldIndex != -1) {
                        newChildIndexes[i] = oldIndex;
                    }
                }

                fireNodesRemovedEvent(new TreeModelEvent(this, e.getPath(), newChildIndexes, oldChildObject));
            } else {
                //We could not find out what the old indicies were, and therefore we are
                //forced to do a tree node structure change.
                fireTreeStructureChanged(new TreeModelEvent(this, e.getPath()));
            }
        }

        /**
         * {@inheritDoc}
         * <p>
         * Current implementation invokes this method on the original tree model without any changes.
         */
        public void treeStructureChanged(TreeModelEvent e) {
            resetLatestChildList();
            // This event is only on affected nodes and downward, so we dont need to create a new event.
            fireTreeStructureChanged(e);
        }
    }

    /**
     * Comparator to use when sorting the tree model list.
     * This uses the String.compareTo() method to do the actual work, note that
     * it is done using lowercase.
     * @author redsolo
     */
    static class LowerCaseObjectStringComparator implements Comparator {

        /** {@inheritDoc} */
        public int compare(Object o1, Object o2) {
        	if ( (o1 == null) || (o2 == null) ) return 0;
        	
        	if ( o1.toString() == null || o2.toString() == null) return 0;
        	
            return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
        }
    }
}
