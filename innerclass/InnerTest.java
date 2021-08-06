package innerclass;

import java.util.ArrayList;

class OutClass {
	private int outNum = 100;
	private static int sNum = 200;
	private ArrayList<String> sList;
	/*private*/ InClass inClass;
	
	public OutClass() {
		sList = new ArrayList<>();
		inClass = new InClass();
	}
	
	/*private*/ class InClass {
		int inNum = 10;
//		static int sInNum = 20;
		
		void inTest() {
			System.out.println("OutClass outNum : " + outNum);
			System.out.println("OutClass sNum : " + sNum);
		}
		
		static void sTest() {
			
		}
	}
	
	static class staticInClass {
		int iNum = 1;
		static int siNum = 2;
		
		void inTest() {
//			System.out.println("OutClass outNum : " + outNum);
			System.out.println("OutClass sNum : " + sNum);
			System.out.println("staticInClass iNum : " + iNum);
			System.out.println("staticInClass siNum : " + siNum);
		}
		
		static void sTest() {
//			System.out.println("OutClass outNum : " + outNum);
//			System.out.println("staticInClass iNum : " + iNum);
			System.out.println("OutClass sNum : " + sNum);
			System.out.println("staticInClass siNum : " + siNum);
			
		}
	}
	
	
	public void usingTest() {
		inClass.inTest();
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingTest();
		
		System.out.println("먼저 외부 클래스를 만들고, 생성한 참조 변수를 사용해 클래스를 생성");
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		
		
	}

}
