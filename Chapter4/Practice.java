package Chapter4;

import java.io.IOException;

public class Practice {

	public static void main(String[] args) throws IOException {
		int num1 = 10;
		int num2 = 2;
		System.out.println("연산자 입력: ");
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
			System.out.println("잘못된 연산자입니다.");
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
			System.out.println("잘못된 연산자입니다.");
			break;
		}
	}

}
