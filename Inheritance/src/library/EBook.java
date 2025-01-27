package library;
public class EBook extends Book{
	private String url;
	private double size;
	
	public EBook(){
		url ="lasjdf";
		size = 1.0;
	}
	
	public EBook(String url, double size){
		
		this.url = url;
		this.size = size;
	}
	
	public void display() {
		System.out.println("URl : "+url);
		System.out.println("Size : "+size);
	}
}
