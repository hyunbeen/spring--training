package sample2value;

public class MemberDao {
	private Member member;
	
	public void setMember(Member member) {
		this.member = member;
	}
	public MemberDao() {
		
	}
	
	public MemberDao(Member member) {
		super();
		this.member = member;
	}
	public void insert() {
		System.out.println(member.getName()+"�� �޼���"+member.getMessage()+"�� �Է��մϴ�");
	}
}
