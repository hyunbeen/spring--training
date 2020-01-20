package cook;

public class IndianFood implements Food {

	@Override
	public String order(String name) {
		
		return name+"님이 인도음식을 주문하였습니다";
	}

}
