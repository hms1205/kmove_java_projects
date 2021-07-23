package classexam;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		System.out.println(person.getClass());
		
		//정적 로딩
		Class personClass = person.getClass();
		System.out.println(personClass.getName());
		
		Class personClass2 = Person.class;
		System.out.println(personClass2.getName());
		
		//동적 로딩
		Class personClass3 = Class.forName("classexam.Person");
		System.out.println(personClass3.getName());
	}

}
