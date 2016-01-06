package net.sf.jxls;

import java.io.Serializable;

public class SimpleTaskLinkImpl implements Serializable, net.sf.jxls.transformer.TaskLink {
	
	private boolean cancelled = false;
	
	public SimpleTaskLinkImpl() {
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public void poll() throws InterruptedException {
		if( cancelled ) throw new InterruptedException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaskLink [cancelled=");
		builder.append(cancelled);
		builder.append("]");
		return builder.toString();
	}
	
}
