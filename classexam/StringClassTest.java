package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");
		
		Constructor[] cons = stringClass.getConstructors();
		
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		Method[] methods = stringClass.getMethod();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		Field[] fields = stringClass.getField();
		for(Field f : fields) {
			System.out.println(f);
		}
	}

}
