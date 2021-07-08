package staticexam;

public class Student {
	private static int serialNum = 1000;
	private int studentID;
	private String studentName;
	
	public Student() {
		serialNum++;
		this.studentID = serialNum;
	}
	
	public static int getSerialNum() {
		int a = 100;//지역 변수
		a += 100;
		System.out.println("a : " + a);
//		studentName = "이름 없음";//멤버 변수, 인스턴스 변수, 속성, property, attribute 값은 정적 메서드 내에 사용 불가
		return serialNum;//클래스 변수
	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
