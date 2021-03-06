package example.member.model;
//옛날 : Record 클래스
//최근 : VO (value of) 클래스
//DTO(data transfer object)클래스
public class Member {
	private String name;
	private int age;
	private String message;
	public Member() {}
	
	public Member(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	};
	
	
	
}
