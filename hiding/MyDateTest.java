package hiding;

public class MyDateTest {
	
	public static void main(String[] args) {
//
//		MyDate date = new MyDate();
//		date.year = 2021;
//		date.setMonth(2);
//		date.setDay(31);
//		date.printDate();
//		
//		

		MyDate date1 = new MyDate(28, 2, 2000);
		System.out.println(date1.isValid());
		
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
	}
	
}
