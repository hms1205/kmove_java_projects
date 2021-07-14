package array.studentsubject;

public class StudentSubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.showStudentInfo();
		
		System.out.println();
		
		Student studentKim = new Student("Lee");
		studentKim.addSubject("자바", 90);
		studentKim.addSubject("일본어", 100);
		studentKim.addSubject("영어", 80);
		studentKim.showStudentInfo();
	}

}
