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

import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;


/**
 * A JTree that can be sorted by any Comparator.
 * The default implementation of the JTree does not support any sorting
 * capability at all. This class makes it possible to sort a JTree
 * with any Comparator.
 * <p>
 * This class enhances the @link org.frappucino.swing.SortedTreeModelDecorator class
 * so the JTree will not lose which tree node are selected and the unwanted collapsing
 * of tree nodes that has been re-arranged due to the sorting.
 * <p>
 * The class sorts by default the tree nodes alphabetically.
 * <p>
 * @author redsolo
 * @see org.frapuccino.swing.SortedTreeModelDecorator use this if the TreeModel is read-only.
 */
public class SortedJTree extends JTree {

    /** Flag showing if the model should be sorted or not. */
    private boolean modelIsSorted = false;

    /** Flag showing if the tree nodes is being rearranged caused by a change in the sort order.*/
    private boolean rearrangingNodes = false;

    /** The original tree model that is sorted. */
    private TreeModel originalTreeModel;

    /** The sorted tree model. */
    private SortedTreeModelDecorator sortedTreeModel;

    /** Selected tree paths when the <code>restoreTreeState()</code> method was called.*/
    private TreePath[] storedSelectedPaths;

    /** Tree paths that were expanded when the <code>restoreTreeState()</code> method was called.*/
    private Collection storedExpandedPaths;

    /**
     * Creates a JTree that is sorted by default.
     */
    public SortedJTree() {
        super();
        updateModel(getModel(), new SortedTreeModelDecorator.LowerCaseObjectStringComparator(), true);
    }

    /**
     * Creates a JTree that is sorted by default.
     * @param newModel the model that is used by the JTree.
     */
    public SortedJTree(TreeModel newModel) {
        super();
        updateModel(newModel, new SortedTreeModelDecorator.LowerCaseObjectStringComparator(), true);
    }

    /**
     * Creates a JTree that is sorted by default.
     * @param newModel the model that is used by the JTree.
     * @param comparator the comparator to use when sorting.
     */
    public SortedJTree(TreeModel newModel, Comparator comparator) {
        super();
        updateModel(newModel, comparator, true);
    }

    /**
     * Inits this JTree instance.
     * @param model the original model.
     * @param comparator the comparator to use while sorting the model.
     * @param isSorted if the JTree should be sorted or not.
     */
    private void updateModel(TreeModel model, Comparator comparator, boolean isSorted) {
        originalTreeModel = model;
        modelIsSorted = isSorted;

        sortedTreeModel = new TreeModelSorted(originalTreeModel, comparator);
        if (modelIsSorted) {
            super.setModel(sortedTreeModel);
        } else {
            super.setModel(originalTreeModel);
        }
    }

    /**
     * Enables or disables the sorting of the tree.
     * The method will keep the expanded status of all the trees nodes.
     * @param enabled true if the tree should be sorted; false otherwise.
     */
    public void setSortingEnabled(boolean enabled) {

        if (enabled != modelIsSorted) {
            storeTreeState();

            if (enabled) {
                super.setModel(sortedTreeModel);
            } else {
                super.setModel(originalTreeModel);
            }

            restoreTreeState();
        }
        modelIsSorted = enabled;
    }

    /**
     * Sets the comparator for the tree.
     * @param comparator the new comparator to use while sorting.
     */
    public void setSortingComparator(Comparator comparator) {
        storeTreeState();

        sortedTreeModel.setSortingComparator(comparator);

        restoreTreeState();
    }

    /** {@inheritDoc} */
    public void setModel(TreeModel newModel) {
        if (sortedTreeModel != null) {
            updateModel(newModel, sortedTreeModel.getSortingComparator(), modelIsSorted);
        } else {
            updateModel(newModel, new SortedTreeModelDecorator.LowerCaseObjectStringComparator(), modelIsSorted);
            //super.setModel(newModel);
        }
    }

    /**
     * Method called when tree nodes has been removed, and needs to be removed from the selection.
     * This method is overloaded because in order to update a tree node's childs completely
     * the tree nodes must be removed and the re-inserted into their new locations. This method
     * will not remove any tree nodes from the selection if the nodes has been re-arranged due
     * to the sorting order.
     * <p>
     * {@inheritDoc}
     */
    protected boolean removeDescendantSelectedPaths(TreePath path, boolean includePath) {
        boolean wasRemoved;

        if (!rearrangingNodes) {
            wasRemoved = super.removeDescendantSelectedPaths(path, includePath);
        } else {
            wasRemoved = false;
        }

        return wasRemoved;
    }

    /**
     * Stores the state of the Tree.
     * Stores the paths that are selected and those that are expanded. This method should be
     * called before the sorting order has changed. A call to <code>restoreTreeState()</code>
     * restores the state of the tree.
     * @see SortedJTree#restoreTreeState()
     */
    private void storeTreeState() {
        storedSelectedPaths = getSelectionModel().getSelectionPaths();
        storedExpandedPaths = getAllExpandedTreePaths();
    }

    /**
     * Restores the state of the Tree as it was when <code>storeTreeState()</code> was called.
     * Restores the paths that were selected and those that were expanded when the
     * <code>storeTreeState()</code> method was called. This method should be called when
     * only the sorting order has changed.
     * @see SortedJTree#storeTreeState()
     */
    private void restoreTreeState() {
        if (storedExpandedPaths != null) {
            expandTreePaths(storedExpandedPaths);
            storedExpandedPaths = null;
        }
        if (storedSelectedPaths != null) {
            getSelectionModel().setSelectionPaths(storedSelectedPaths);
            storedSelectedPaths = null;
        }
    }

    /**
     * Returns all expanded tree paths in the tree.
     * //TODO This method should only return the last TreePath that is expanded in each "limb"
     * Now it returns all tree paths that are expanded, for performance reasons it should
     * only be the paths that are expanded and farthest from the root.
     * @return all expanded tree paths.
     */
    private Collection getAllExpandedTreePaths() {
        Collection expandedTreePaths = new LinkedList();
        addExpandedNodesToList(new TreePath(originalTreeModel.getRoot()), expandedTreePaths);
        return expandedTreePaths;
    }

    /**
     * Adds the tree paths that are expanded in the tree to the collection.
     * A recursive method to add all tree paths that are expanded to the collection.
     * @param treePath tree path to get expanded nodes for.
     * @param collection collection to add tree paths to.
     */
    private void addExpandedNodesToList(TreePath treePath, Collection collection) {
        Enumeration paths = getExpandedDescendants(treePath);
        if (paths != null) {
            while (paths.hasMoreElements()) {
                TreePath element = (TreePath) paths.nextElement();
                collection.add(element);
                addExpandedNodesToList(element, collection);
            }
        }
    }

    /**
     * Expand all tree paths in the collection.
     * @param treePaths collection of TreePaths that should be expanded in the tree.
     */
    private void expandTreePaths(Collection treePaths) {
        for (Iterator treePathIterator = treePaths.iterator(); treePathIterator.hasNext();) {
            TreePath element = (TreePath) treePathIterator.next();
            expandPath(element);
        }
    }

    /**
     * Internal class that is used when the tree model is re-arranging children.
     * @author redsolo
     */
    private class TreeModelSorted extends SortedTreeModelDecorator {

        /**
         * @param original the original tree model.
         */
        public TreeModelSorted(TreeModel original) {
            super(original);
        }

        /**
         * @param original the original tree model.
         * @param comparator the comparator to use when sorting.
         */
        public TreeModelSorted(TreeModel original, Comparator comparator) {
            super(original, comparator);
        }

        /**
         * Fires events that nodes has been re-arranged in the sorting order.
         * This method raises the flag that tree node has just been re-arranged, and
         * they are to be removed and then re-inserted.
         * @param event an event depicting that one or more events has changed.
         * @see SortedJTree#removeDescendantSelectedPaths(TreePath, boolean) using the mentioned flag.
         * @see SortedTreeModelDecorator#fireNodesRearrangedEvent(TreeModelEvent)
         */
        protected void fireNodesRearrangedEvent(TreeModelEvent event) {

            // save the expand state for the childs of the parent of the event.
            Enumeration expandedNodes = getExpandedDescendants(event.getTreePath());
            if(expandedNodes == null ) return;
            
            rearrangingNodes = true;
            super.fireNodesRearrangedEvent(event);
            rearrangingNodes = false;

            // reset the expand state for the childs.
            while (expandedNodes.hasMoreElements()) {
                setExpandedState((TreePath) expandedNodes.nextElement(), true);
            }
        }
    }
}
