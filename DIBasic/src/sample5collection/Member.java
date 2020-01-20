package sample5collection;

public class Member {
	private String name;
	private int age;
	private String message;
	
	public Member(String name, int age, String message) {
		super();
		System.out.println("생성자 호출");
		this.name = name;
		this.age = age;
		this.message = message;
	}
	
	public Member() {
		
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMessage() {
		return message;
	}
	//setter
	public void setName(String name) {
		System.out.println("setter 호출");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setter 호출");
		this.age = age;
	}
	public void setMessage(String message) {
		System.out.println("setter 호출");
		this.message = message;
	}
	
}
