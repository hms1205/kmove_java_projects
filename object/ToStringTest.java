package object;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("test");
		System.out.println(str);
		
		Integer int1 = new Integer(1);
		System.out.println(int1);
		
		Book book = new Book("����", "�������� ��������");
		System.out.println(book.toString());
		
	}
	
}

