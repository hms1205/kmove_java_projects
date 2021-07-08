package hiding;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	void setDay(int d) {
		if(month != 2) {
			day = d;
			printDate();
			}
			else {
				if(d < 1 || d > 28) {
					System.out.println("날짜 오류!");
			}
		}
	}
	
	public MyDate(int day, int month, int year) {
		if((year%400) == 0 && year%4 == 0 && year%100 != 0) {
			if(month != 2) {
				if(day < 1 || day > 31) {
					System.out.println("유효하지 않은 날짜입니다.");
				} else {
					System.out.println("유효한 날짜입니다.");
				}
			} else {
				if(day < 1 || day > 29) {
					System.out.println("유효하지 않은 날짜입니다.");
				} else {
					System.out.println("유효한 날짜입니다.");
				}
			}
		} else {
			if(day < 1 || day > 31) {
				System.out.println("유효하지 않은 날짜입니다.");
			} else {
				System.out.println("유효한 날짜입니다.");
			}
			if(day < 1 || day > 28) {
				System.out.println("유효하지 않은 날짜입니다.");
			} else {
				System.out.println("유효한 날짜입니다.");
			}
		}
	}

	
	void printDate() {
		System.out.println(year + "." + month + "." + day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public char[] isValid() {
		return null;
	}
}
