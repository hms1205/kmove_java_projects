package ArrayList;

import java.util.ArrayList;

import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book("�ڹ�1", "�������б�");
		Book book2 = new Book("�ڹ�2", "�������б�");
		Book book3 = new Book("�ڹ�3", "�������б�");
		Book book4 = new Book("�ڹ�4", "�������б�");
		Book book5 = new Book("�ڹ�5", "�������б�");
		
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
