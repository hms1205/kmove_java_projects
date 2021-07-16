package array.dog;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("가", "시고르자브종"));
		list.add(new Dog("나", "진돗개"));
		list.add(new Dog("다", "말티즈"));
		list.add(new Dog("라", "요크셔"));
		list.add(new Dog("마", "삽살개"));
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
	}

}
