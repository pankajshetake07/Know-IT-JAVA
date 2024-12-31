package demos;

import entities.Box;

public class BoxDemo{
	public static void main(String a[]){
		Box [] b = new Box[3];
		b[0] = new Box(2,3,4);
		System.out.println(b[0].calculateVolume());
		
		b[1] = new Box(4,3,4);
		System.out.println(b[1].calculateVolume());
		
		b[2] = new Box(9,3,4);
		System.out.println(b[2].calculateVolume());
	}
}

 