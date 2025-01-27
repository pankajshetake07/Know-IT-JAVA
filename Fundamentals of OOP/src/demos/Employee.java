package demos;
import java.util.Scanner;
public class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id : ");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of Employee : ");
		empName = sc.nextLine();
		System.out.println("Enter Employee salary : ");
		salary = sc.nextInt();
	}
	
	public void display(){
		System.out.println("Id of Employee : "+empId);
		System.out.println("Name of Employee : "+empName);
		System.out.println("Salary of Employee : "+salary);
	}
	
	
	public static void main(String a[]){
		Employee [] emp = new Employee[3];
		for(int i=0; i<3; i++){
			emp[i] = new Employee();
			emp[i].accept();
		}
		for(int i=0; i<3; i++){
			emp[i].display();
		}
	}
}