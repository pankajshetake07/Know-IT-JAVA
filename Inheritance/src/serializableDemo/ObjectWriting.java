package serializableDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import office.staff.Emp;

public class ObjectWriting {

	public static void main(String[] args) throws Exception{
		
		Emp e2 = new Emp("krishn", 2, 2, 1000, 101, 120000.0);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/KNOW-IT/JAVA/MyData/Employee.txt"));
		oos.writeObject(e2);
		System.out.println("Data written successfully");
		oos.close();
	}

}
