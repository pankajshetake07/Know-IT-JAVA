package threadSynchronization;

public class PrintingJob implements Runnable{
	
	Thread thread;
	Printer p;
	String header, body, footer;
	
	public PrintingJob(Printer p, String header, String body, String footer) {
		thread = new Thread(this);
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
	}

	@Override
	public void run() {
		p.syncPrint(header, body, footer);
	}
	
	public Thread getThread() {
		return thread;
	}
	
}
