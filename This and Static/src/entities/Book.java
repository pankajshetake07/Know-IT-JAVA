package entities;
class Book{
	private int bookId;
	private String bookTitle;
	private double bookPrice;
	static int count=0;
	
	Book(){
		bookId = ++count;
		bookTitle = "NA";
		bookPrice = 0.0;
	}
	
	Book(String bookTitle, double bookPrice){
		bookId = ++count;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	
	void setPrice(double price){
		bookPrice = price;
	}
	
	void display(){
		System.out.println("Book Id is : "+bookId);
		System.out.println("Book title is : "+bookTitle);
		System.out.println("Book Price is : "+bookPrice);
	}
}