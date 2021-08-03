package generic.method;

public class GenericMethodTest {

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 10.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 0.0);
		
		double rectangle = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두 점 p1(" + p1.getX() + ", " + p1.getY() + "), p2(" + p2.getX() + ", " + p2.getY() + ")로 만들어진 사형의 넓이는 " + rectangle + "입니다.");
	}

}
