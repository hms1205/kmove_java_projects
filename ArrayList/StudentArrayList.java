package ArrayList;

import java.util.ArrayList;

import array.alone.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student("James"));
		student.add(new Student("Tomas"));
		student.add(new Student("Edward"));
		
		for (int i = 0; i < student.size(); i++) {
			Student std = student.get(i);
			std.showStudentInfo();
		}
		
		System.out.println("=============================");
		
		for (Student std : student) {
			std.showStudentInfo();
		}
	}

}
