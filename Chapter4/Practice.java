package Chapter4;

import java.io.IOException;

public class Practice {

	public static void main(String[] args) throws IOException {
		int num1 = 10;
		int num2 = 2;
		System.out.println("������ �Է�: ");
		char operator = (char)(System.in.read());
		
		
		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("�߸��� �������Դϴ�.");
		}
		
		switch(operator) {
		case'+':
			System.out.println(num1 + num2);
			break;
		case'-':
			System.out.println(num1 - num2);
			break;
		case'*':
			System.out.println(num1 * num2);
			break;
		case'/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("�߸��� �������Դϴ�.");
			break;
		}
	}

}
