package javaioapps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferWriting {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter path where you want to write your data : ");
		String path = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("Enter \"quit\" to stop");
		String line;
		
		while(!(line = br.readLine()).equals("quit")) {
			bw.write(line);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}

}
