package object;

public class Book {
	String bookname;
	String author;
	
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
		
		
	}

	@Override
	public String toString() {
		return bookname + ", " + author;
	}
}
