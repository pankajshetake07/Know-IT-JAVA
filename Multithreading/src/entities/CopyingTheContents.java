package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyingTheContents implements Runnable {
	
	private Thread thread;
	private String source;
	private String destination;
	
	public CopyingTheContents(String source, String destination) {
		thread = new Thread(this);
		this.source = source;
		this.destination = destination;
	}
	
	@Override
	public void run() {
		BufferedReader read = null;
		BufferedWriter write = null;
		try {
			read = new BufferedReader(new FileReader(source));
			write = new BufferedWriter(new FileWriter(destination));
			String line;
			while((line = read.readLine()) != null) {
				write.write(line);
				write.newLine();
			}
			
		} catch (Exception e) {
			e.getMessage();
		}	
		finally {
			try {
				read.close();
				write.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public Thread getThread() {
		return thread;
	}

}
