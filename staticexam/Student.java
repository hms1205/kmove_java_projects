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
		int a = 100;//���� ����
		a += 100;
		System.out.println("a : " + a);
//		studentName = "�̸� ����";//��� ����, �ν��Ͻ� ����, �Ӽ�, property, attribute ���� ���� �޼��� ���� ��� �Ұ�
		return serialNum;//Ŭ���� ����
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
