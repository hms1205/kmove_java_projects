package reference.test;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score) {
		korea.setSubjectScore(score);
	}
	
	public void setMath(int score) {
		math.setSubjectScore(score);
	}
	
	public void printStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "Student " + korea.subjectName + "Subject Score" + korea.getSubjectScore() + math.subjectName + "Subject Score" + math.getSubjectScore() + "total " + total);
	}

}
