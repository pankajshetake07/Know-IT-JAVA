package threadSynchronization;

public class PrinterMain {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		PrintingJob pj1 = new PrintingJob(p, "Krishn", "Arjun", "karn");
		PrintingJob pj2 = new PrintingJob(p, "Bheem", "Bhishm", "Nakul");
		PrintingJob pj3 = new PrintingJob(p, "Sahdev", "Ram", "Lakshman");
		
		pj1.getThread().start();
		pj2.getThread().start();
		pj3.getThread().start();
		
		try {
			pj1.getThread().join();
			pj2.getThread().join();
			pj3.getThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Printing ends....");		
	}

}
