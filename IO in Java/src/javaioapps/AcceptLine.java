package javaioapps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptLine {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String maxLine="";
		int max=0;
		System.out.println("Enter \"quit\" to exit");
		try {
			while(!(line=br.readLine()).equals("quit")) {
				if(max < line.length()) {
					max = line.length();
					maxLine = line;
				}
			}
			System.out.println(max);
			System.out.println(maxLine);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
