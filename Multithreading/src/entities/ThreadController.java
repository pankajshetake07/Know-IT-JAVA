package entities;

public class ThreadController implements Runnable {
	
	private Thread thread;
	
	public ThreadController() {
		thread = new Thread(this);
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("child thread : "+i);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Thread getThread() {
		return thread;
	}

}
