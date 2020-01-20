package exercise.member.model;

public class MemberVO {
	private String id;
	private String pass;
	private String name;
	private int age;
	private Address address;
	public MemberVO(String id, String pass, String name, int age, Address address) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public MemberVO() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
