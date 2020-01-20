package sample1scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//��ü ������ �ڵ����� ���� ����
//		MessageBean bean1 = new MessageBeanKo();
//		bean1.sayHello("ȫ�浿");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:sample1scope/applicationContext.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("sample1scope/applicationContext.xml");
		MessageBean bean = context.getBean("ko",MessageBean.class);
		bean.sayHello("ȫ�浿");
		MessageBean bean2 = context.getBean("ko",MessageBean.class);
		bean2.sayHello("ȫ����");
		MessageBean bean3 = context.getBean("en",MessageBean.class);
		bean3.sayHello("ȫ���");
		MessageBean bean4 = context.getBean("en",MessageBean.class);
		bean4.sayHello("ȫ�泲");
	}

}
