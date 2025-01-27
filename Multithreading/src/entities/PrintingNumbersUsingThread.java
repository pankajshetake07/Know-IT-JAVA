package entities;

public class PrintingNumbersUsingThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("child thread : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
//	public void run() {
//		for(int i=1; i<6; i++) {
//			System.out.println("child thread : "+i);
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				e.getMessage();
//			}
//		}
//	}
}
