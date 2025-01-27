package entities;

public class CountingDownThread implements Runnable{
	
	private Thread thread;
	private int n;
	private String name;
	
	public CountingDownThread() {
		thread = new Thread(this);
	}
	
	public CountingDownThread(int n, String name) {
		thread = new Thread(this);
		this.n = n;
		this.name = name;
	}

	@Override
	public void run() {
		while(n>0) {
			System.out.println(name+"count downs : "+n);
			n--;
		}
	}
	
	public Thread getThread() {
		return thread;
	}
}
