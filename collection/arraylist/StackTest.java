package collection.arraylist;

import java.util.ArrayList;


class MyStack {
	private ArrayList<Integer> arrayStack = new ArrayList<>();
	
	public void push(int data) {
		arrayStack.add(data);
		System.out.println("push OK " + data);
	}
	
	public int pop() {
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("Stack is empty");
			return -999999999;
		}
		
		return arrayStack.remove(len-1);
	}
	
	public int peek() {
		int len = arrayStack.size();
		
		if(len != 0) {
			return arrayStack.get(len-1);
		}
		
		System.out.println("Stack is empty");
		return -999999999;
	}
	
}


public class StackTest {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		myStack.push(100);
		myStack.push(200);		
		myStack.push(300);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		System.out.println(myStack.peek());
		System.out.println(myStack.peek());
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
