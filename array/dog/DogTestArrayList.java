package array.dog;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
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
