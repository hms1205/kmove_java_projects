package polymorphism;

import polymorphism.typecheck.Animal;
import polymorphism.typecheck.Eagle;
import polymorphism.typecheck.Human;
import polymorphism.typecheck.Tiger;

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
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest animalTest = new AnimalTest();
		
		animalTest.moveAnimal(new Human());
		animalTest.moveAnimal(new Tiger());
		animalTest.moveAnimal(new Eagle());
		
	}
	
	void moveAnimal(Animal animal) { // 매개 변수의 타입이 상위 클래스 타입으로 사용
		animal.move(); // 가상 메서드 : 인스턴트의 메서드 호출, 오버라이딩 메서드를 호출
	}

}
