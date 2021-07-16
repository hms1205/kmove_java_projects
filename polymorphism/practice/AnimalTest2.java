package polymorphism.practice;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");	
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void fiying() {
		System.out.println("�������� �������ϸ� �ϴ��� ���ƴٴմϴ�.");
	}
}

public class AnimalTest2 {
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	public static void main(String[] args) {
		AnimalTest2 aniTest = new AnimalTest2();
		aniTest.addAnimal();
		System.out.println("====");
		aniTest.updownCasting();
		
	}
	
	void addAnimal() {
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		animalList.add(new Human());
		
	}
	
	void updownCasting() {
//		for(Animal animal : animalList) {
		for(int i = 0 ; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.move();
			eagle.fiying();
			System.out.println();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.move();
				tiger.hunting();
				System.out.println();
			} else if (animal instanceof Human) {
				Human human = (Human) animal;
				human.move();
				human.readBook();
			} else {
				System.out.println("������ �� ���� Ÿ��");
			}
		}
		System.out.println("====");
	}
	
	void moveAnimal(Animal animal) { 
		animal.move(); 
	}

}
