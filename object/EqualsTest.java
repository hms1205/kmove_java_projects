package object;

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("hi");
		String str2 = new String("hi");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		Double d1 = new Double(3.14);
		Double d2 = new Double(3.14);
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}

}
