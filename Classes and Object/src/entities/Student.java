package entities;
public class Student{
	private int rollno;
	private String name;
	private int[] marks;
	
	public Student(){
		rollno = 1;
		name = "NA";
		marks = new int[3];
	}
	
	public Student(int rollno, String name, int[]marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(Student s){
		this.rollno = s.rollno;
		//this.name = s.name;  //Shallow copy
		this.name = new String(s.name);  //Deep copy
		//this.marks = s.marks; //Shallow copy
		this.marks = new int[s.marks.length];  //Deep copy
		for(int i=0; i<marks.length; i++){
			this.marks[i] = s.marks[i];
		}
	}
	
	
	public String calGrade(){
		String grade = "";
		int sum = 0;
		float avg;
		for(int i=0; i<marks.length; i++){
			sum += marks[i];
		}
		avg = sum/marks.length;
		if(avg >= 90){
			grade = "Excellent";
		} else if(avg >= 80 && avg < 90){
			grade = "Very good";
		} else if(avg >= 70 && avg < 80){
			grade = "Good";
		} else if(avg >= 60 && avg < 70){
			grade = "Avarage";
		} else if(avg >= 50 && avg < 60){
			grade = "Below avarage";
		} else {
			grade = "Fail...";
		}
		return grade;
	}
	
	public void display(){
		System.out.println("Name of the student : "+name);
		System.out.println("Roll number of the student : "+rollno);
		System.out.println("Marks of student is : ");
		for(int i=0; i<marks.length; i++){
			System.out.print(marks[i]+"  ");
		}
		//System.out.println("Grade : "+calGrade());
		System.out.println("\n-----------------------------------");
	}
}