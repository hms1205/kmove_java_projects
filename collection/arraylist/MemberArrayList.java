package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	ArrayList<Member> memberArrayList;

	public MemberArrayList() {
		memberArrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		memberArrayList.add(member);
	}
	
	public boolean removeMember (int memberID) {
//		for(int i = 0; i < memberArrayList.size(); i++) {
//			Member member = memberArrayList.get(i);
//			int tempID = member.getMemberID();
//			if (tempID == memberID) {
//				memberArrayList.remove(i);
//				System.out.println(memberID + "회원이 삭제되었습니다.");
//				return true;
//			}
//		}
		
		for(Member member : memberArrayList) {
			int tempID = member.getMemberID();
			if (tempID == memberID) {
				memberArrayList.remove(member);
				System.out.println(memberID + "회원이 삭제되었습니다.");
				return true;
			}
		}
		
		System.out.println(memberID + "아이디는 회원리스트에 존재하지 않습니다.");
		return false;
	}
	
	public void showMember() {
		for (Member member : memberArrayList) {
			System.out.println(member);
		}
	}
	
	public void insertMember(Member member, int index) {
		if (index < memberArrayList.size()) {
			memberArrayList.add(index, member);			
		} else if (index < 0 || index >= memberArrayList.size()) {
			System.out.println("잘못된 index 값입니다.");
		}
	}
	
	public void memberPush(Member member) {
		memberArrayList.add(member);
		System.out.println("(push OK) " + member);
	}
	
	public Member memberPop() {
		int len = memberArrayList.size();
		
		if(len == 0) {
			System.out.println("Stack is empty");
		}
		
		return memberArrayList.remove(len-1);
	}
	
	public Member memberPeek() {
		int len = memberArrayList.size();
		
		if(len != 0) {
			return memberArrayList.get(len-1);
		}
		
		System.out.println("Stack is empty");
		return null;
	}
	
	
}
