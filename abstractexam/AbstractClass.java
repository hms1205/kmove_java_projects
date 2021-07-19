package abstractexam;

abstract class Test {
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	abstract int sum(int x, int y);
}

public class AbstractClass {

	public static void main(String[] args) {
		Test test = new Test();
	}

}
