package array.studentsubject;

import java.util.ArrayList;

public class Student {
	
	public static int serialNo = 1000;
	private String studentName;
	private int studentID;
	ArrayList<Subject> subject;

	public Student(String studentName) {
		this.studentID = ++serialNo;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	public void addSubject(String name, int score) {
		
	}

	public void showStudentInfo() {
		
	}

}
