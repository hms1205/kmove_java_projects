package Chapter4;

public class ConticueTest {

	public static void main(String[] args) {
		int num;
		int total = 0;
		
//		for(num=1; num<=100; num++) {
//			if(num%3 == 0) {
//				total += num;
//			} else {
//				continue;
//			}
//		}
//		System.out.println("1~100������ 3�� ����� ��: " + total);
		
		for(num=1; num<=101; num++) {
			if(num%3 != 0) {
				continue;
			}
		}

	}
}
