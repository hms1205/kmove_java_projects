package Chapter4;

public class BreakTest {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		for(num=1; ; num++) {
			sum += num;
			if (sum >= 500) {
				break;
			}
			
//			if(num > 100) {
//				break;
//			}
		}
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}

}
