package stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {
		List<String> sList = Arrays.asList(
				"This is a java book", 
				"Lamda Expression", 
				"Java8 supports lamda expressions"
				);
		
		sList.stream().filter(str -> str.toLowerCase().contains("java")).forEach(str -> System.out.println(str));
		
		
		
	}

}
