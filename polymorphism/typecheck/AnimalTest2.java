package polymorphism.typecheck;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");	
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void fiying() {
		System.out.println("독수리는 날개짓하며 하늘을 날아다닙니다.");
	}
}

public class AnimalTest2 {
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	public static void main(String[] args) {
		AnimalTest2 aniTest = new AnimalTest2();
		aniTest.addAnimal();
		System.out.println("====");
		aniTest.downCasting();
		
	}
	
	void addAnimal() {
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		animalList.add(new Human());
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	void downCasting() {
//		for(Animal animal : animalList) {
		for(int i = 0 ; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.fiying();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			} else {
				System.out.println("변경할 수 없는 타입");
			}
		}
	}
	
	void moveAnimal(Animal animal) { // 매개 변수의 타입이 상위 클래스 타입으로 사용
		animal.move(); // 가상 메서드 : 인스턴트의 메서드 호출, 오버라이딩 메서드를 호출
	}

}
