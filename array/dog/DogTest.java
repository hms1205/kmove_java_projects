package array.dog;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		
// Q4.
//		Dog dog[] = new Dog[5];
//		
//		dog[0] = new Dog("��", "�ð��ں���");
//		dog[1] = new Dog("��", "������");
//		dog[2] = new Dog("��", "��Ƽ��");
//		dog[3] = new Dog("��", "��ũ��");
//		dog[4] = new Dog("��", "��찳");
//		
//		for (int i = 0 ; i < dog.length; i++) {
//			System.out.println(dog[i].showDogInfo());
//		}
		
		
// Q5.		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("��", "�ð��ں���"));
		list.add(new Dog("��", "������"));
		list.add(new Dog("��", "��Ƽ��"));
		list.add(new Dog("��", "��ũ��"));
		list.add(new Dog("��", "��찳"));
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
	}
}
