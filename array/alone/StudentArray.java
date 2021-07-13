package array.alone;

public class StudentArray {

	public static void main(String[] args) {
		Student student[] = new Student[3];
		
		student[0] = new Student("James");
		student[1] = new Student("Tomas");
		student[2] = new Student("Edward");
		
		for (int i = 0; i < student.length; i++) {
			student[i].showStudentInfo();
		}
		
		
	}

}
