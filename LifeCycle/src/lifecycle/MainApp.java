package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/applicationContext.xml");
		MessageBean message = context.getBean("messagebean",MessageBean.class);
		message.sayHello();
		
		context.destroy();

	}

}
