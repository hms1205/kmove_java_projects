package array.studentsubject;

public class StudentSubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		studentLee.showStudentInfo();
		
		System.out.println();
		
		Student studentKim = new Student("Lee");
		studentKim.addSubject("�ڹ�", 90);
		studentKim.addSubject("�Ϻ���", 100);
		studentKim.addSubject("����", 80);
		studentKim.showStudentInfo();
	}

}
