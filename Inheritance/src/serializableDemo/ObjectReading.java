package serializableDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import office.staff.Emp;

public class ObjectReading {

	public static void main(String[] args){
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\KNOW-IT\\JAVA\\MyData\\Employee.txt"))) {
            Object obj = ois.readObject();
            if (obj instanceof Emp) {
                System.out.println((Emp) obj);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
	}
}
