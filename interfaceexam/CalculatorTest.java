package interfaceexam;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc comcalc = new CompleteCalc();
		comcalc.showInfo();
		
		Calc calc = comcalc; // upcasting, Ÿ�� ĳ����(����ȯ), ������ �� ��ȯ
//		calc.showInfo(); // ���� : ���ǵǾ� ���� ����, Calc Ÿ���� �������� �ʴ� �޼���
		
		
		System.out.println(comcalc.add(num1, num2));
		System.out.println(comcalc.subtract(num1, num2));
		System.out.println(comcalc.multiply(num1, num2));
		System.out.println(comcalc.devide(num1, num2));
		System.out.println(comcalc.mod(num1, num2));
		System.out.println(comcalc.square(num1));
	}

}
