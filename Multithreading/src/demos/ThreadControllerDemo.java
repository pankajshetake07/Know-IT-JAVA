package demos;

import entities.ThreadController;

public class ThreadControllerDemo {

	public static void main(String[] args) {
		ThreadController t = new ThreadController();
//		Thread thread = new Thread(t);
		t.getThread().start();
		for(int i=100; i<106; i++) {
			System.out.println("main thread : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
