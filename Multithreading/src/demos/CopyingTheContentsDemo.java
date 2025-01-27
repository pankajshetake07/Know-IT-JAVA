package demos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import entities.CopyingTheContents;

public class CopyingTheContentsDemo {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter source : ");
			String source = br.readLine();
			System.out.println("Enter destination : ");
			String destination = br.readLine();
			CopyingTheContents c = new CopyingTheContents(source, destination);
			c.getThread().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("Data written from source to destination is successfully");
	}

}
