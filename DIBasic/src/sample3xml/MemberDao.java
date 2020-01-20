package sample3xml;

public class MemberDao {
	private Member member;
	//member filed = attrubute = property
	public MemberDao() {
		
	}
	
	public MemberDao(Member member) {
		super();
		this.member = member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

	public void insert() {
		System.out.println(member.getName()+"의 메세지"+member.getMessage()+"를 입력합니다");
	}
}
