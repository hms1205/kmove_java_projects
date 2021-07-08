package thisexam;

public class Person {
	String name;
	int age;
	
	public Person() {
//		name = "무명";
//		age = 1;
		this("무명", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}
