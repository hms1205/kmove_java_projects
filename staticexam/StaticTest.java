package staticexam;

public class StaticTest {

	public static void main(String[] args) {
		//�ν��Ͻ� ���� ���� serialNum Ȯ��
		System.out.println(Student.getSerialNum());//�ν��Ͻ� ������ �����ϰ� ��� ������ ���� ����
		
		Student std1 = new Student();
		std1.setStudentName("�迬��");
		System.out.println(std1.getStudentName() + "�л� �й� : " + std1.getStudentID());
		
		Student std2 = new Student();
		std2.setStudentName("�ѹμ�");
		System.out.println(std2.getStudentName() + "�л� �й� : " + std2.getStudentID());
//		System.out.println(std1.serialNum);
//		System.out.println(std2.serialNum);
		System.out.println(Student.getSerialNum());
		//�ν��Ͻ�(����) ������ �����ϴ� ���� �ƴ϶� Ŭ���� �̸����� ���� ������ �����ؼ� ����ؾ߸� �Ѵ�.
	}

}
