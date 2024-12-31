package javaioapps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Assignement9 {

	public static void main(String[] args) throws Exception{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter path : ");
		String path = br1.readLine();
		BufferedReader bf2 = new BufferedReader(new FileReader(path));
		String line = null;
		int max = 0;
		String maxLine="";
		while((line = bf2.readLine()) != null){
			if(max < line.length()) {
				max = line.length();
				maxLine = line;
			}
		}
		System.out.println(maxLine);
		
		BufferedReader bf3 = new BufferedReader(new FileReader(path));
		while((line = bf3.readLine()) != null) {
			for(int i=line.length(); i<max; i++) {
				System.out.print("-");
			}
			System.out.println(line);
		}
		bf3.close();
		bf2.close();
	}
}
