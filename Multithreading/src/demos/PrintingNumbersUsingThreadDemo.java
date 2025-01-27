package demos;

import entities.PrintingNumbersUsingThread;

public class PrintingNumbersUsingThreadDemo {

	public static void main(String[] args) {
//		Thread t = new PrintingNumbersUsingThread();
//		t.start();
//		for(int i=1; i<6; i++) {
//			System.out.println("Main thread : "+i);
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		PrintingNumbersUsingThread p = new PrintingNumbersUsingThread();
		Thread t = new Thread(p);
		t.start();
		
		for(int i=6; i<=10; i++) {
			System.out.println("main thread : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
