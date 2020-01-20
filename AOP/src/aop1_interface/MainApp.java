package aop1_interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop1_interface/applicationContext.xml");
		MessageBean bean = context.getBean("proxy",MessageBean.class);
		//MessageBean bean = context.getBean("targetBean",MessageBean.class);
		bean.sayHello();
		bean.korSayHello();
		bean.test();
		//bean.enSayHello();
		
				

	}

}
