package exercise.member.model;

public class Address {
	public String sido;
	public String gu;
	public String dong;
	public Address(String sido, String gu, String dong) {
	
		this.sido = sido;
		this.gu = gu;
		this.dong = dong;
	}
	public Address() {
		
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGu() {
		return gu;
	}
	public void setGu(String gu) {
		this.gu = gu;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	
}
