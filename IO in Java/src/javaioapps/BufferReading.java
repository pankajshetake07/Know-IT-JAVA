package javaioapps;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReading {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("E:/KNOW-IT/MyData/test.txt"));
		String line;
		int count = 0;
		String maxLine="";
		int max = 0;
		while((line=br.readLine()) != null) {
			count++;
			System.out.println(count+". "+line);
			if(max < line.length()) {
				maxLine = line;
				max = line.length();
			}
		}
		System.out.println(maxLine+" : "+max);
		br.close();

	}

}
