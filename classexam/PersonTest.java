package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		
		Class pClass = Class.forName("classexam.Person");
		
		
		//모든 public 생성자 얻어오기
		Constructor[] cons = pClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		// 모든 public 멤버 필드 얻어오기
		Field[] fields = pClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
			System.out.println(f.getName());
		}
		
		Method[] methods = pClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
