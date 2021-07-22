package object.student;

public class StudentEqualsTest {

	public static void main(String[] args) {
		Student std1 = new Student("이상원", 100);
		Student std2 = std1;
		Student std3 = new Student("이상원", 100);
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		if(std1 == std2) {
			System.out.println("동일 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		if(std1.equals(std2)) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		System.out.println("====================");
		
		if(std1 == std3) {
			System.out.println("동일 주소");
			System.out.println(std1);
			System.out.println(std3);
		} else {
			System.out.println("다른 주소");
			System.out.println(std1);
			System.out.println(std3);
		}
		
		if(std1.equals(std3)) {
			System.out.println("동일 객체");
			System.out.println(std1);
			System.out.println(std3);
		} else {
			System.out.println("다른 객체");
			System.out.println(std1);
			System.out.println(std3);
		}
	}

}
