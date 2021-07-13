package array.alone;

public class Student {
	private int studentID;
	private String name;
	private static int serial = 1000;
	
	public Student() {}
	
	public Student(String name) {
		this.studentID = ++serial;
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
}
