package javaioapps;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIO {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			fout = new FileOutputStream("E:/KNOW-IT/MyData/userData.txt",true);
			System.out.println("Enter Name : ");
			String name = br.readLine();
			System.out.println("Enter city : ");
			String city = br.readLine();
			System.out.println("Enter state : ");
			String state = br.readLine();
			fout.write("\nName : ".getBytes());
			fout.write(name.getBytes());
			fout.write("\nCity : ".getBytes());
			fout.write(city.getBytes());
			fout.write("\nState : ".getBytes());
			fout.write(state.getBytes());
			System.out.println("data written successfuly");
			
		} catch (IOException f) {
			f.printStackTrace();
		}
		finally {
			try {
				fout.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
