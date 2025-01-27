package library;
import office.utility.*;
public class PaperBook extends Book {
	private int numberOfPages;
	Date dateOfPublication;
	
	public PaperBook(){
		numberOfPages = 1;
		this.dateOfPublication = new Date();
	}
	
	public PaperBook(int book_id, String book_title, double book_price,int numberOfPages, int day, int month, int year) {
		super(book_id, book_title, book_price);
		this.dateOfPublication = new Date(day, month, year);
		this.numberOfPages = numberOfPages;
	}
	
	public void display() {
		dateOfPublication.display();
		super.display();
		System.out.println("Number of pages : "+numberOfPages);
	}
}
