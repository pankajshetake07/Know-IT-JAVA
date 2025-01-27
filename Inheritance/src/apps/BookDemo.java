package apps;
import library.EBook;
import library.PaperBook;
import library.Book;
public class BookDemo {

	public static void main(String[] args) {
		//Assignment no 4
		Book p = new PaperBook(1, "ABC", 200.34,200,1,1,3333);
		//PaperBook p = new PaperBook(1, "ABC", 200.34,200,1,1,3333);
		p.display();
		System.out.println("*************************");
		EBook e = new EBook("ebook.com", 10.2);
		e.display();


	}
}
