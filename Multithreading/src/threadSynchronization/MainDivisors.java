package threadSynchronization;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainDivisors {

	public static void main(String[] args) {

		BufferedWriter write = null;
		try {
			String fileName = "E:/KNOW-IT/MyData/divisor.txt";
			write = new BufferedWriter(new FileWriter(fileName));
			WriteDivisorsInFile w1 = new WriteDivisorsInFile(write, 986);
			WriteDivisorsInFile w2 = new WriteDivisorsInFile(write, 300);
			WriteDivisorsInFile w3 = new WriteDivisorsInFile(write, 888);

			System.out.println("Wrinting in file begins..");

			w1.getThread().start();
			w2.getThread().start();
			w3.getThread().start();

			try {
				w1.getThread().join();
				Thread.sleep(2000);
				w2.getThread().join();
				Thread.sleep(2000);
				w3.getThread().join();
				Thread.sleep(2000);

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Wrinting in file ends..");

	}

}
