package annotation1.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation1/required/applicationContext.xml");
		MessageBean bean = context.getBean("bean",MessageBean.class);
		bean.sayHello();

	}

}
