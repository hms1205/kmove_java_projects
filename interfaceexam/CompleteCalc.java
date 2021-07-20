package interfaceexam;

public class CompleteCalc extends Calculator {

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int devide(int num1, int num2) {
		if(num2 == 0) {
			return Calc.ERROR;
		} else {
			return num1 / num2;
		}
	}

	@Override
	public int mod(int num1, int num2) {
		// TODO Auto-generated method stub
		return (int)num1 % num2;
	}

	@Override
	public int square(int num1) {
		return num1 * num1;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현한 클래스입니다.");
	}

}
