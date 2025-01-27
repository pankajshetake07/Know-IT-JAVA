package threadCommunication;

public class Consumer implements Runnable {
	
	private Stock s;
	private Thread thread;
	boolean bRun;
	
	public Consumer(Stock s) {
		thread = new Thread();
		this.s = s;
		bRun = true;
	}
	
	@Override
	public void run() {		
		while(bRun) {
			s.consume();
		}
	}
	
	public void stopNow() {
		bRun = false;
	}
	
	public Thread getThread() {
		return thread;
	}

}
