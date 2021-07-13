package array.dog;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		
// Q4.
//		Dog dog[] = new Dog[5];
//		
//		dog[0] = new Dog("가", "시고르자브종");
//		dog[1] = new Dog("나", "진돗개");
//		dog[2] = new Dog("다", "말티즈");
//		dog[3] = new Dog("라", "요크셔");
//		dog[4] = new Dog("마", "삽살개");
//		
//		for (int i = 0 ; i < dog.length; i++) {
//			System.out.println(dog[i].showDogInfo());
//		}
		
		
// Q5.		
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
