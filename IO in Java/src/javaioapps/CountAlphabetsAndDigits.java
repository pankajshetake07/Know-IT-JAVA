package javaioapps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountAlphabetsAndDigits {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter 'q' to quit : ");
			int n;
			int countDigits = 0;
			int countAlphabets = 0;
			while((n=br.read()) != 'q'){
				if(Character.isDigit(n)) {
					countDigits++;
				}
				if(Character.isAlphabetic(n)) {
					countAlphabets++;
				}
				//System.out.print((char)n);
			}
			System.out.println(countDigits);
			System.out.println(countAlphabets);
		} 
		catch (IOException e) {
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
