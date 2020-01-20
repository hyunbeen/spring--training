package sample5collection;

import java.util.List;

public final class ListBean {
	private List<Integer> intList;
	private List<Member> memberList;
	public ListBean(List<Integer> intList, List<Member> memberList) {
		super();
		this.intList = intList;
		this.memberList = memberList;
	}
	public ListBean() {
		
	}
	
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	
	public List<Member> getMemberList() {
		return memberList;
	}
	public List<Integer> getIntList() {
		return intList;
	}
	
	
}
