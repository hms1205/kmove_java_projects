package interfaceexam;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {2, 4, 6, 8, 10};
		
		int sum = Calc.total(intArray);
		System.out.println(sum);
				
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc comcalc = new CompleteCalc();
		comcalc.showInfo();
		
		comcalc.describe();
		
		Calc calc = comcalc; // upcasting, 타입 캐스팅(형변환), 묵시적 형 변환
//		calc.showInfo(); // 오류 : 정의되어 있지 않음, Calc 타입이 지원하지 않는 메서드
		
		calc.describe(); // 디폴트 메서드 호출. 재정의가 된 경우라면 디폴트 호출
		
		System.out.println(comcalc.add(num1, num2));
		System.out.println(comcalc.subtract(num1, num2));
		System.out.println(comcalc.multiply(num1, num2));
		System.out.println(comcalc.devide(num1, num2));
		System.out.println(comcalc.mod(num1, num2));
		System.out.println(comcalc.square(num1));
	}

}
