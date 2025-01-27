package threadSynchronization;

import java.io.BufferedWriter;

public class Divisors {
	BufferedWriter write;
	public void write(BufferedWriter write, int no) {
		
		try {
			for(int i=1; i<no/2; i++) {
				if(no % i == 0) {
					write.write(i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void syncWrite(BufferedWriter write, int no) {
		synchronized(this) {
			try {
				for(int i=1; i<no/2; i++) {
					if(no % i == 0) {
						write.write(i);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void syncWrite1(BufferedWriter write, int no) {
		try {
			for(int i=1; i<no/2; i++) {
				if(no % i == 0) {
					write.write(i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
