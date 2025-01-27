package entities;

public class ArrayOperations {
	static <T> boolean search(T[]arr, T ele) {
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(ele)) {
				flag = true;
			}
		}
		return flag;
	}
	
	public static <T> void rotate(T[] arr, int positions) {
		  T temp;
		  for(int i=0;i<positions;i++) {
			  temp = arr[arr.length-1];
			  for(int j=arr.length-1;j>0;j--) {
				  arr[j] = arr[j-1];
			  }
			  arr[0] = temp;
		  }
	  }
}
