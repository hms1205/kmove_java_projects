package staticexam;

public class StaticTest {

	public static void main(String[] args) {
		//인스턴스 생성 전의 serialNum 확인
		System.out.println(Student.getSerialNum());//인스턴스 생성과 무관하게 사용 가능한 공유 변수
		
		Student std1 = new Student();
		std1.setStudentName("김연아");
		System.out.println(std1.getStudentName() + "학생 학번 : " + std1.getStudentID());
		
		Student std2 = new Student();
		std2.setStudentName("한민수");
		System.out.println(std2.getStudentName() + "학생 학번 : " + std2.getStudentID());
//		System.out.println(std1.serialNum);
//		System.out.println(std2.serialNum);
		System.out.println(Student.getSerialNum());
		//인스턴스(참조) 변수로 접근하는 것이 아니라 클래스 이름으로 정적 변수에 접근해서 사용해야만 한다.
	}

}
