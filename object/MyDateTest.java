package object;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		return day*11 + month*101 + year*1001;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate object = (MyDate) obj;
			if(this.day == object.day && this.month == object.month && this.year == object.year) {
				return true;
			}
		}
		return false;
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));
	}
}