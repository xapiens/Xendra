package org.columba.core.context;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.SwingUtilities;
import javax.swing.event.EventListenerList;

import org.columba.api.command.ICommandReference;
import org.columba.api.command.IWorkerStatusController;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.command.Command;
import org.columba.core.command.CommandProcessor;
import org.columba.core.command.DefaultCommandReference;
import org.columba.core.context.api.IContextProvider;
import org.columba.core.context.api.IContextResultEvent;
import org.columba.core.context.api.IContextResultListener;
import org.columba.core.context.api.IContextSearchManager;

public class ContextSearchManager implements IContextSearchManager {

	private static final int RESULT_COUNT = 10;

	private final Map<String, IContextProvider> map = new Hashtable<String, IContextProvider>();

	IFrameMediator frameMediator;

	protected EventListenerList listenerList = new EventListenerList();

	public ContextSearchManager(final IFrameMediator theFrameMediator) {
		this.frameMediator = theFrameMediator;
	}

	public void register(final IContextProvider provider) {
		map.put(provider.getTechnicalName(), provider);
	}

	public void unregister(final IContextProvider provider) {
		map.remove(provider.getTechnicalName());
	}

	public IContextProvider getProvider(final String technicalName) {
		return map.get(technicalName);
	}

	public Collection<IContextProvider> getAllProviders() {
		return map.values();
	}

	public void addResultListener(final IContextResultListener listener) {
		listenerList.add(IContextResultListener.class, listener);
	}

	public void removeResultListener(final IContextResultListener listener) {
		listenerList.remove(IContextResultListener.class, listener);
	}

	public void search() {
		final SearchCommand command = new SearchCommand(
				new DefaultCommandReference());
		CommandProcessor.getInstance().addOp(command);
	}

	void fireFinished() {
		final IContextResultEvent e = new ContextResultEvent(this);
		// Guaranteed to return a non-null array
		final Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IContextResultListener.class) {
				((IContextResultListener) listeners[i + 1]).finished(e);
			}
		}

	}

	void fireResultArrived(final String providerName) {
		final IContextResultEvent e = new ContextResultEvent(this, providerName);
		// Guaranteed to return a non-null array
		final Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IContextResultListener.class) {
				((IContextResultListener) listeners[i + 1]).resultArrived(e);
			}
		}

	}

	class SearchCommand extends Command {

		public SearchCommand(final ICommandReference reference) {
			super(reference);
		}

		@Override
		public void execute(final IWorkerStatusController worker)
				throws Exception {
			for (final IContextProvider p : getAllProviders()) {
				p.clear();
				p.search(frameMediator.getSemanticContext(), 0,
						ContextSearchManager.RESULT_COUNT);

				// notify all listeners that have a new search result
				// ensure this is called in the EDT
				final Runnable run = new Runnable() {
					public void run() {
						fireResultArrived(p.getTechnicalName());
					}
				};
				SwingUtilities.invokeLater(run);

			}

			// notify all listeners that search is finished

			Runnable run = new Runnable() {
				public void run() {
					fireFinished();
				}
			};
			SwingUtilities.invokeLater(run);
		}

		@Override
		public void updateGUI() throws Exception {
		}

	}

}
