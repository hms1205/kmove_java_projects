package staticexam;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentName("ȫ�浿");
		System.out.println(student1.getStudentName());
		System.out.println(student1.serialNum);
		student1.serialNum++;
		
		Student student2 = new Student();
		student2.setStudentName("�迬��");
		System.out.println(student2.getStudentName());
		System.out.println(student2.serialNum);
		
		System.out.println(student1.serialNum);
	}

}
