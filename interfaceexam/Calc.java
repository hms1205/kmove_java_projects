package interfaceexam;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	default void describe() { //����Ʈ �޼��� : ���� ������ ����
		method();
		//staticMethod();
		System.out.println("���� ���⸦ �����߽��ϴ�.");
	}
	
	
	static int total(int[] array) {
		staticMethod();
		int total = 0;
		for(int i : array) {
			total += i;
		}
		return total;
	}
	
	private void method() {
		System.out.println("Calc private void method()");
	}
	
	private static void staticMethod() {
		System.out.println("Calc private static void staticMethod()");
	}
	
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int devide(int num1, int num2);
	int mod(int num1, int num2);
	int square(int num1);
}
