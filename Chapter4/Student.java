package Chapter4;

public class Student {

	int studentId;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.studentName = "홍길동";
		std.address = "서울특별시 관악구";
		std.showStudentInfo();
	}
}
