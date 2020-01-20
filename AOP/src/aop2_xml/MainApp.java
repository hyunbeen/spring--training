package aop2_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2_xml/applicationContext.xml");
		MessageBean bean = context.getBean("targetBean",MessageBean.class);
		//MessageBean bean = context.getBean("targetBean",MessageBean.class);
		bean.sayHello();
		System.out.println("-------------------------");
		bean.korSayHello();
		System.out.println("-------------------------");
		bean.test();
		System.out.println("-------------------------");
		//bean.enSayHello();
		
				

	}

}
