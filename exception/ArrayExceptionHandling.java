package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		
		try {
			for(int i =0; i <= array.length; i++) {
				array[i] = i+1;
				System.out.println(array[i]);
			}
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외가 발생하든 하지 않든 항상 수행되는 블록");
		}
		
		System.out.println("END");
	}

}
