package generic.method;

public class GenericMethod {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		int left = (int) p1.getX();
		int right = (int) p2.getX();
		double top = (double) p1.getY();
		double bottom = (double) p2.getY();
		
		int width = right - left;
		
		double height = top - bottom;
		
		return width * height;
		
	}
}
