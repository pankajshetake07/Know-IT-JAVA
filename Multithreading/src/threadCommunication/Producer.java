package threadCommunication;

public class Producer implements Runnable {
	
	private Stock s;
	private Thread thread;
	private boolean bRun;
	
	public Producer(Stock s) {
		thread = new Thread(this);
		this.s = s;
		bRun = true;
	}

	@Override
	public void run() {
		while(bRun) {
			s.produce();
		}
	}
	
	public void stopNow() {
		bRun = false;
	}
	
	public Thread getThread() {
		return thread;
	}
}
