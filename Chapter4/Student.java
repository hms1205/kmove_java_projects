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
		std.studentName = "ȫ�浿";
		std.address = "����Ư���� ���Ǳ�";
		std.showStudentInfo();
	}
}
