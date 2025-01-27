package threadSynchronization;

public class Printer {
	public void print(String header, String body, String footer) {
		try {
			System.out.println(header);
			Thread.sleep(2000);
			System.out.println(body);
			Thread.sleep(2000);
			System.out.println(footer);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void syncPrint(String header, String body, String footer) {
		synchronized(this) {
			try {
				System.out.println(header);
				Thread.sleep(2000);
				System.out.println(body);
				Thread.sleep(2000);
				System.out.println(footer);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void syncPrint1(String header, String body, String footer) {
		try {
			System.out.println(header);
			Thread.sleep(2000);
			System.out.println(body);
			Thread.sleep(2000);
			System.out.println(footer);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
