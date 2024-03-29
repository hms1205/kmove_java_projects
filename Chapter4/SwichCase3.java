package Chapter4;

public class SwichCase3 {

	public static void main(String[] args) {
		int month = 16;
		int day = 1;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			System.out.println("존재하지 않는 월입니다.");
			return;
		}
		
		System.out.println(month + "월의 마지막 날은 " + day + "일 입니다.");
	}

}
