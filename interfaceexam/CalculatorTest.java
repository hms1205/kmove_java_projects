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
		
		Calc calc = comcalc; // upcasting, Ÿ�� ĳ����(����ȯ), ������ �� ��ȯ
//		calc.showInfo(); // ���� : ���ǵǾ� ���� ����, Calc Ÿ���� �������� �ʴ� �޼���
		
		calc.describe(); // ����Ʈ �޼��� ȣ��. �����ǰ� �� ����� ����Ʈ ȣ��
		
		System.out.println(comcalc.add(num1, num2));
		System.out.println(comcalc.subtract(num1, num2));
		System.out.println(comcalc.multiply(num1, num2));
		System.out.println(comcalc.devide(num1, num2));
		System.out.println(comcalc.mod(num1, num2));
		System.out.println(comcalc.square(num1));
	}

}
