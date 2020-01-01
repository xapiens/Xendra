package org.xendra.modeleditor.gui.modeleditor;

import java.awt.event.MouseEvent;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import com.mxgraph.swing.mxGraphComponent;
//import com.intel.stl.ui.common.IBackgroundService;
import com.mxgraph.swing.handler.mxSelectionCellsHandler;
import com.mxgraph.view.mxGraphView;

/**
 * Wrapper of mxSelectionCellsHandler that executes with a specified
 * ExecutorService
 */
public class SelectionCellsHandler extends mxSelectionCellsHandler {
    public SelectionCellsHandler(mxGraphComponent mxGraphView) {
		super(mxGraphView);
		// TODO Auto-generated constructor stub
	}

	//private IBackgroundService updateService;

    private final AtomicInteger taskId = new AtomicInteger();
//
//    /**
//     * Description:
//     * 
//     * @param graphComponent
//     * @param updateService
//     */
//    public SelectionCellsHandler(TopGraphComponent graphComponent) {
//        super(graphComponent);
//    }

//    /**
//     * @param updateService
//     *            the updateService to set
//     */
//    public void setUpdateService(IBackgroundService updateService) {
//        this.updateService = updateService;
//    }

    protected void runInServeice(final Runnable runner,
            final boolean replaceable) {
//        final int id = taskId.incrementAndGet();
//        updateService.submit(new Runnable() {
//            @Override
//            public void run() {
//                if (replaceable && id != taskId.get()) {
//                    return;
//                }
//
//                runner.run();
//            }
//        });
    }

    protected <E> E runAndWait(final Callable<E> caller,
            final boolean replaceable) {
//        final int id = taskId.incrementAndGet();
//        Future<E> task = updateService.submit(new Callable<E>() {
//            @Override
//            public E call() throws Exception {
//                if (replaceable && id != taskId.get()) {
//                    return null;
//                }
//
//                return caller.call();
//            }
//        });
        E res = null;
//        try {
//            //res = task.get();
//        } catch (InterruptedException e) {
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        return res;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mxgraph.swing.handler.mxSelectionCellsHandler#mousePressed(java.awt
     * .event.MouseEvent)
     */
    @Override
    public void mousePressed(final MouseEvent e) {
        runInServeice(new Runnable() {
            @Override
            public void run() {
                SelectionCellsHandler.super.mousePressed(e);
            }
        }, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mxgraph.swing.handler.mxSelectionCellsHandler#mouseMoved(java.awt
     * .event.MouseEvent)
     */
    @Override
    public void mouseMoved(final MouseEvent e) {
        runInServeice(new Runnable() {
            @Override
            public void run() {
                SelectionCellsHandler.super.mouseMoved(e);
            }
        }, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mxgraph.swing.handler.mxSelectionCellsHandler#mouseDragged(java.awt
     * .event.MouseEvent)
     */
    @Override
    public void mouseDragged(final MouseEvent e) {
        runInServeice(new Runnable() {
            @Override
            public void run() {
                SelectionCellsHandler.super.mouseDragged(e);
            }
        }, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mxgraph.swing.handler.mxSelectionCellsHandler#mouseReleased(java.
     * awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(final MouseEvent e) {
        runInServeice(new Runnable() {
            @Override
            public void run() {
                SelectionCellsHandler.super.mouseReleased(e);
            }
        }, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.mxgraph.swing.handler.mxSelectionCellsHandler#getToolTipText(java
     * .awt.event.MouseEvent)
     */
    @Override
    public String getToolTipText(final MouseEvent e) {
        return runAndWait(new Callable<String>() {
            @Override
            public String call() {
                return SelectionCellsHandler.super.getToolTipText(e);
            }
        }, true);
    }

    // /*
    // * (non-Javadoc)
    // *
    // * @see
    // * com.mxgraph.swing.handler.mxSelectionCellsHandler#paintHandles(java.awt
    // * .Graphics)
    // */
    // @Override
    // public void paintHandles(final Graphics g) {
    // super.paintHandles(g);
    // }

    /*
     * (non-Javadoc)
     * 
     * @see com.mxgraph.swing.handler.mxSelectionCellsHandler#reset()
     */
    @Override
    public void reset() {
        runInServeice(new Runnable() {
            @Override
            public void run() {
                SelectionCellsHandler.super.reset();
            }
        }, false);
    }

    // /*
    // * (non-Javadoc)
    // *
    // * @see com.mxgraph.swing.handler.mxSelectionCellsHandler#refresh()
    // */
    // @Override
    // public void refresh() {
    // runAndWait(new Runnable() {
    // @Override
    // public void run() {
    // SelectionCellsHandler.super.refresh();
    // }
    // }, false);
    // }

}