package array;

public class DeepCopy {

	public static void main(String[] args) {
		Book bookArray1[] = new Book[3];
		Book bookArray2[] = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0; i < bookArray1.length; i++) {
		bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("어린왕자");
		bookArray1[0].setAuthor("생텍쥐페리");
		System.out.println("==============================");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
//		for(int i = 0; i < bookArray1.length; i++) {
//			bookArray2[i].showBookInfo();
//		}
		
		for (Book book : bookArray2) {
			book.showBookInfo();
		}
		
		
	}

}
