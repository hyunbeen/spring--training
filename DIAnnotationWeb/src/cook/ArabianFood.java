package cook;

public class ArabianFood implements Food {

	@Override
	public String order(String name) {
		return name+"는 맛있는 아라비안 요리를 주문하셨습니다.";
	}

}
