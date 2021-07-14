package array;

public class EnhancedFor {

	public static void main(String[] args) {
		String strArray[] = {"C", "Python", "Android", "JAVA", "JavaScript"};
		
		for(int i = 0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for(String str : strArray) {
			System.out.println(str);
		}
	}

}
