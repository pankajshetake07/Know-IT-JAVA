package demos;

import java.util.Arrays;

import entities.ArrayOperations;

public class ArrayOperationsDemo {

	public static void main(String[] args) {
		//String [] arr = {"java","is","object","final","super","this"};
		Integer [] arr = {1,2,3,4,5,6,7};
		
		ArrayOperations.rotate(arr,3);
		System.out.println(Arrays.asList(arr));

	}

}
