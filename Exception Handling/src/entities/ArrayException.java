package entities;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array elements are : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		try {
			System.out.println("\nWhich index element you want to access : ");
			int index = sc.nextInt();
			System.out.println("Index element is : "+arr[index]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
