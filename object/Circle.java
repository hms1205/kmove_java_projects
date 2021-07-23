package object;

public class Circle implements Cloneable {
	Point point; //�� ��, �߽���
	int radius; //������
	
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
		//clone() �޼��带 ȣ���� �� �߻��� ���ɼ��� �ִ� ���� ó��
		return super.clone();
	}
	
}
