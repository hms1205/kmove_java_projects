package Chapter4;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner in = new Scanner(System.in);
//		System.out.println("���� �������� ũ��: ");
//		int size = in.nextInt();
//		
//		if (size <= 0) {
//			System.out.println("ũ��� 0���� �۰ų� ���� �� �����ϴ�.");
//		} else if (size > 20) {
//			System.out.println("ũ�Ⱑ �ʹ� Ů�ϴ�.");
//		} else {
//			for (int i = 0; i < size + 1 ; i++) {
//				for (int j = 0; j < size - i ; j++) {
//					System.out.println(" ");
//				}
//				for (int j = 0; j < i * 2 + 1 ; j++) {
//					System.out.println("*");
//				}
//				System.out.println();
//			}
//			for (int i = size + 1; i < size * 2 + 1; i++) {
//				for(int j = 0; j < i-size; j++) {
//					System.out.println(" ");
//				}
//				for(int j = 0; j < (size * 2 - i)*2+1; j++) {
//					System.out.println("*");
//				}
//				System.out.println();
//			}
//		}
//
//		
//		
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
		System.out.println("Ȧ���� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		     if (i<=num/2)// ���� ����
		     {
		        if (i+j<=num/2-1)// ���� �� �������
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // ������ �� �������
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *���
		     }
		     else if (i>num/2) //�Ʒ��� ����
		     {
		        if (i-j>=num/2+1) //���� �� ����
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//������ �� ����
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *���
		     }
		  }
		  System.out.println();//�ٹٲ�
		}
		
		
		int line = 4;
		int space = line / 2 + 1;
		int star = 1;
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int k=0; k < star; k++) {
				System.out.print("*");
			}
			space -= 1;
			star += 2;
			System.out.println();
		}
		for (int i = 0; i < line; i++) {
			for (int j = -1; j < space +1; j++) {
				System.out.print(" ");
			}
			for(int k=2; k < star-2; k++) {
				System.out.print("*");
			}
			space += 1;
			star -= 2;
			System.out.println();
		}
	}

}
