package polymorphism;

import polymorphism.typecheck.Animal;
import polymorphism.typecheck.Eagle;
import polymorphism.typecheck.Human;
import polymorphism.typecheck.Tiger;

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
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest animalTest = new AnimalTest();
		
		animalTest.moveAnimal(new Human());
		animalTest.moveAnimal(new Tiger());
		animalTest.moveAnimal(new Eagle());
		
	}
	
	void moveAnimal(Animal animal) { // �Ű� ������ Ÿ���� ���� Ŭ���� Ÿ������ ���
		animal.move(); // ���� �޼��� : �ν���Ʈ�� �޼��� ȣ��, �������̵� �޼��带 ȣ��
	}

}
