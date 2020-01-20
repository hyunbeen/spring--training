package sample5collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample5collection/applicationContext.xml");
		ListBean bean = context.getBean("bean",ListBean.class);
		for(Integer i : bean.getIntList()) {
			System.out.println(i);
		}
		for(Member m : bean.getMemberList()) {
			System.out.println(m.getName()+">"+m.getMessage());
		}
	}

}
