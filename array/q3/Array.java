package array.q3;

public class Array {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= 9; j++) {
					arr[j] = i;
				}
				System.out.println(arr[j]);
			}
		}
		
	}

}
