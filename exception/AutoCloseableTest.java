package exception;

public class AutoCloseableTest {

	public static void main(String[] args) {
		AutoCloseObject obj3 = new AutoCloseObject();
		
		
		try(/*AutoCloseObject obj1 = new AutoCloseObject(); AutoCloseObject obj2 = new AutoCloseObject(); */obj3) {
			System.out.println("리소스가 하나 생성");
//			System.out.println("리소스가 하나 더 생성");
//			System.out.println("리소스가 하나 더 생성");
			
			throw new Exception("내가 만든 강제 예외");
		} catch(Exception e) {
			System.out.println("Exception Handling");
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}

}
