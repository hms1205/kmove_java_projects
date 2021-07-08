package Chapter4;

public class Gugudan {

	public static void main(String[] args) {
		int dan, times;
		
//		for (dan = 2; dan <= 9; dan++) {
//			for (times = 1; times <= 9; times++) {
//				System.out.println(dan + "x" + times + " = " + dan*times);
//			}
//			
//			System.out.println("==============================");
//		}
		
		dan = 2;
		
		while (dan < 10) {
			times = 1;
//			for (times = 1; times <= 9; times++) {
//			System.out.println(dan + "x" + times + " = " + dan*times);
//		}
			while (times < 10) {
				System.out.println(dan + "x" + times + " = " + dan * times);
				times++;
			}
			dan++;
			System.out.println("==============================");
		}
	}

}
