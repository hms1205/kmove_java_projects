package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMemberTest {

	public static void main(String[] args) {
		List<Member> memberList = Arrays.asList(
				new Member("채송화", 30),
				new Member("장윤복", 27),
				new Member("이익순", 33)
		);
		
		double avgAge = memberList.stream().mapToInt(m -> m.getAge()).average().getAsDouble();
		
		System.out.println("회원의 평균 나 : " + (int)avgAge);
	}

}
