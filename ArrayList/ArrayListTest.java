package ArrayList;

import java.util.ArrayList;

import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book("자바1", "동서대학교");
		Book book2 = new Book("자바2", "동서대학교");
		Book book3 = new Book("자바3", "동서대학교");
		Book book4 = new Book("자바4", "동서대학교");
		Book book5 = new Book("자바5", "동서대학교");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		
		for(int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			book.showBookInfo();
			
		}
		
//		bookList.add("abc");
//		bookList.add("def");
//		bookList.add("ghi");
//		
//		for (int idx = 0; idx < stringList.size(); idx++) {
//			String str = stringList.get(idx);
//			System.out.println(str);
//		}
	}

}
