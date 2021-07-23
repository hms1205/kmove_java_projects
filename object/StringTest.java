package object;

public class StringTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		String androidStr = new String("Android");
		
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(javaStr);
		
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(javaStr);
		
		
		
		
		
		/*		String str0 = new String("test");
		String str1 = new String("test");
		String str2 = "test";
		String str3 = "test";
		
		System.out.println(str0 == str1);
		System.out.println(str0.equals(str1));
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3)); */
	}

}
