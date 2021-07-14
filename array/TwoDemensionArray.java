package array;

public class TwoDemensionArray {

	public static void main(String[] args) {
		String array[][] = {{"a", "b"}, {"c", "d"}, {"e", "f"}, 
							{"g", "h"}, {"i", "j"}, {"k", "l"}, 
							{"m", "n"}, {"o", "p"}, {"q", "r"}, 
							{"s", "t"}, {"u", "v"}, {"w", "x"}, 
							{"y", "z"}};
		
//		System.out.println(array.length);
//		
//		System.out.println(array[0].length);
//		System.out.println(array[1].length);
//		
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		for (String[] arr1 : array) {
			System.out.println();
			for (String i : arr1) {
				System.out.print(i);
			}
		}
	}

}
