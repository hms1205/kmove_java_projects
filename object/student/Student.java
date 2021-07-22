package object.student;

public class Student {
	String name;
	int num;
	
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student objStudent = (Student)obj; //downcasting
			if (this.num == objStudent.num)
				return true;
		}
		return false;
	}
	
//	@Override
//	public String toString() {
//		return "학생의 이름은 " + name + "이고, 학번은 " + num + "입니다.";
//	}
	
	
	
	

}
