package demos;

import entities.CountingDownThread;

public class CountingDownDemo {

	public static void main(String[] args) {
		
		CountingDownThread c1 = new CountingDownThread(5, "first");
		CountingDownThread c2 = new CountingDownThread(10, "second");
		CountingDownThread c3 = new CountingDownThread(15, "third");
		System.out.println("main begins");
		
		c1.getThread().start();
		c2.getThread().start();
		c3.getThread().start();
		
		System.out.println(c1.getThread().isAlive());
		System.out.println(c2.getThread().isAlive());
		System.out.println(c3.getThread().isAlive());
		
		try {
			c1.getThread().join();
			c2.getThread().join();
			c3.getThread().join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(c1.getThread().isAlive());
		System.out.println(c2.getThread().isAlive());
		System.out.println(c3.getThread().isAlive());
		System.out.println("main ends");
	}

}
