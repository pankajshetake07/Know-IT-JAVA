package entities;
public class BookDemo{
	public static void main(String a[]){
		Book b1 = new Book("abc", 500);
		b1.display();
		Book b2 = new Book("xyz", 1500);
		b2.display();
		Book b3 = new Book();
		b3.display();
	}
}