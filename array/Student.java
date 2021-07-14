package array;

import java.util.ArrayList;

public class Student {
	private static int serialNo = 1000;
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		this.studentID = ++serialNo;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int sum = 0;
		for (Subject subject : subjectList) {
			System.out.println(studentID + "�л� (" + studentName + ")�� " + subject.getSubjectName() + "������ ������ " + subject.getSubjectScore() + "���Դϴ�.");			
			sum += subject.getSubjectScore();
		}
		System.out.println(studentID + "�л� (" + studentName + ")�� ������ " + sum + "���Դϴ�.");			
		
	}
}
