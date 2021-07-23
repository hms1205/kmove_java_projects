package object;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(5, 7, 3);
		System.out.println(System.identityHashCode(circle));
		
		Circle newCircle = (Circle)circle.clone();
		System.out.println(System.identityHashCode(newCircle));
		
		System.out.println(circle);
		System.out.println(newCircle);
	
	
	}

}
