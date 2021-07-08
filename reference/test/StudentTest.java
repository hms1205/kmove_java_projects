package reference.test;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.studentName = "ȫ�浿";
		std1.setKorea(100);
		std1.setMath(95);
		std1.printStudentInfo();
		
		Student std2 = new Student(20211111, "asdfs");
		std2.setKorea(80);
		std2.setMath(90);
		std2.printStudentInfo();
	}

}
