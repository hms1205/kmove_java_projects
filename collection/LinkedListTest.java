package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Member> memberLinkedList = new LinkedList<>();
		
		memberLinkedList.add(new Member(1005, "한가인"));
		memberLinkedList.add(new Member(1006, "천송이"));
		memberLinkedList.add(new Member(1007, "이나영"));
		
		for(Member member : memberLinkedList) {
			System.out.println(member);
		}
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("A"); 
		linkedList.add("B"); 
		linkedList.add("C");
		
		System.out.println(linkedList);
		
		linkedList.add(1, "D");
		System.out.println(linkedList);
		
		linkedList.addFirst("0");
		System.out.println(linkedList);
		
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList);
	}

}
