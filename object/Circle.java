package object;

public class Circle implements Cloneable {
	Point point; //한 점, 중심점
	int radius; //반지름
	
	Circle(int x, int y, int radius) {
		point = new Point(x, y); //has-a
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//clone() 메서드를 호출할 때 발생할 가능성이 있는 예외 처리
		return super.clone();
	}
	
}
