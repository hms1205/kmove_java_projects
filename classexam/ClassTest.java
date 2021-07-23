package classexam;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		System.out.println(person.getClass());
		
		//���� �ε�
		Class personClass = person.getClass();
		System.out.println(personClass.getName());
		
		Class personClass2 = Person.class;
		System.out.println(personClass2.getName());
		
		//���� �ε�
		Class personClass3 = Class.forName("classexam.Person");
		System.out.println(personClass3.getName());
	}

}
