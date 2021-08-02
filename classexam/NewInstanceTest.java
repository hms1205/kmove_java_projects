package classexam;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person = new Person();
		System.out.println(person);
		
		Class pClass = Class.forName("classexam.Person");
		
		@SuppressWarnings("deprecation")
		Person person2 = (Person) pClass.newInstance();//강제 형변환
		System.out.println(person2);
	}

}
