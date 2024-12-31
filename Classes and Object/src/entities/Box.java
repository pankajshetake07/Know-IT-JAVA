package entities;
public class Box{
	private int height;
	private int width;
	private int depth;
	
	public Box(){
		height = 1;
		width = 2;
		depth = 3;
	}
	
	public Box(int height, int width, int depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public void display(){
		System.out.println("Height : "+height);
		System.out.println("Width : "+width);
		System.out.println("Depth : "+depth);
	}
	
	public int calculateVolume(){
		return height * width * depth;
	}
}