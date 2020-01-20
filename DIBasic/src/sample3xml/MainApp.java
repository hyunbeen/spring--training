package sample3xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample3xml/applicationContext.xml");
		
		
		
//		Member m = (Member)context.getBean("m",Member.class);
//		System.out.println(m.getName()+":"+m.getAge()+">"+m.getMessage());
//		
//		Member m2 = (Member)context.getBean("m2",Member.class);
//		System.out.println(m2.getName()+":"+m2.getAge()+">"+m2.getMessage());
		
		MemberDao dao1 = context.getBean("dao",MemberDao.class);
		dao1.insert();
	}

}
