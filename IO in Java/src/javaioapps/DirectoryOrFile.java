package javaioapps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class DirectoryOrFile {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter path where you want to write your data : ");
		String path = br1.readLine();
		File f = new File(path);
		if(f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				System.out.println(file);
			}
		} 
		else if(f.isFile()) {
			BufferedReader br2 = new BufferedReader(new FileReader(path));
			System.out.println(f.length());
			if(f.length() > 25) {
				String line;
				int count = 0;
				while((line=br2.readLine()) != null) {
					count++;
					System.out.println(count+". "+line);
				}
			} 
			else {
				FileInputStream fis = new FileInputStream(path);
				BufferedReader br;
				br = new BufferedReader(new InputStreamReader(fis));
				String line;
				int count = 0;
				while((line=br.readLine()) != null) {
					count++;
					System.out.println(count+". "+line);
				}
				br.close();
			}
			br2.close();
		}
		br1.close();
	}

}
