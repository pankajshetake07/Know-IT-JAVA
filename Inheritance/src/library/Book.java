package library;
public class Book {
	private int book_id;
	private String book_title;
	private double book_price;
	
	public Book(){
		book_id = 1;
		book_title = "NA";
		book_price = 0.0;
	}
	
	public Book(int book_id, String book_title, double book_price){
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_price = book_price;
	}
	
	public void display() {
		System.out.println("Book Id : "+book_id);
		System.out.println("Book Title : "+book_title);
		System.out.println("Book Price : "+book_price);
	}
}
