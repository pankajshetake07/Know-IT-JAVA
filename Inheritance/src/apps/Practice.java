package apps;
public class Practice {
	
	public static void findElement(int arr[], int key) {
		int flag = -1;
		int index = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == key) {
				flag = 1;
				index = i+1;
				continue;
			}
		}
		if(flag==1) {
			System.out.println("elemet is found at index : "+index);
		} else {
			System.out.println("-1");
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[args.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int key = arr[arr.length-1];
		findElement(arr, key);
	}

}
