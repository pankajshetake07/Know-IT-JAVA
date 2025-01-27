package entities;

public class PrimeNumber implements Runnable{
	
	private Thread thread;
	private int start;
	private int end;
	
	public PrimeNumber(int start, int end) {
		thread = new Thread(this);
		this.start = start;
		this.end = end;
	}
	
	public boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void run() {
		int count=0;
		for(int i=start; i<=end; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Prime Number : "+i);
			}
		}
		System.out.println(count);
	}
	
	public Thread getThread() {
		return thread;
	}

}
