package object.student;

public class StudentEqualsTest {

	public static void main(String[] args) {
		Student std1 = new Student("�̻��", 100);
		Student std2 = std1;
		Student std3 = new Student("�̻��", 100);
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		if(std1 == std2) {
			System.out.println("���� �ּ�");
		} else {
			System.out.println("�ٸ� �ּ�");
		}
		
		if(std1.equals(std2)) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println("====================");
		
		if(std1 == std3) {
			System.out.println("���� �ּ�");
			System.out.println(std1);
			System.out.println(std3);
		} else {
			System.out.println("�ٸ� �ּ�");
			System.out.println(std1);
			System.out.println(std3);
		}
		
		if(std1.equals(std3)) {
			System.out.println("���� ��ü");
			System.out.println(std1);
			System.out.println(std3);
		} else {
			System.out.println("�ٸ� ��ü");
			System.out.println(std1);
			System.out.println(std3);
		}
	}

}
