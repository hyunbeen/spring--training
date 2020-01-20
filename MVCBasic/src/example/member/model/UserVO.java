package example.member.model;

public class UserVO {
	private String id;
	private String name;
	private int age;
	private boolean state;
	public UserVO(){
		
	}
	public UserVO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public UserVO(String id, String name, int age,boolean state) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.state =state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
