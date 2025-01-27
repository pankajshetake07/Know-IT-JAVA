package threadSynchronization;

import java.io.BufferedWriter;

public class WriteDivisorsInFile implements Runnable {

	BufferedWriter write;
	Thread thread;
	int no;

	public WriteDivisorsInFile(BufferedWriter write, int no) {
		thread = new Thread(this);
		this.write = write;
		this.no = no;
	}

	@Override
	public void run() {
		synchronized (write) {
			try {
				for (int i = 1; i <= no / 2; i++) {
					if (no % i == 0) {
						write.write("divisors of"+no+" is : "+i+"\n");
						write.newLine();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public Thread getThread() {
		return thread;
	}
}
