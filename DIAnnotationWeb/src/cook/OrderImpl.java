package cook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class OrderImpl implements Order {
	private String name;
	
	 @Autowired
	 @Qualifier("Arabian")
	private Food  food;
	
	@Override
	public String menu(){
		return food.order(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	
}
