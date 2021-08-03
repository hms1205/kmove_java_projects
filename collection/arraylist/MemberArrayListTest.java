package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(1001, "홍길동");
		Member member2 = new Member(1002, "김길순");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		
		memberArrayList.showMember();
		
		memberArrayList.removeMember(1001);
		
		Member member3 = new Member(1003, "한민수");
		memberArrayList.addMember(member3);
		
		Member member4 = new Member(1004, "정상욱");
		
		memberArrayList.insertMember(member4, 0);
		memberArrayList.showMember();
		
		Member member5 = new Member(1005, "사람5");
		
		memberArrayList.memberPush(member5);
		
		memberArrayList.showMember();
		
		System.out.println(memberArrayList.memberPop());
		System.out.println(memberArrayList.memberPop());
		System.out.println(memberArrayList.memberPeek());
		System.out.println(memberArrayList.memberPeek());
		
	}

}
