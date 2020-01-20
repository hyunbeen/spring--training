package sample1scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//按眉 积己阑 内爹栏肺 流立 备泅
//		MessageBean bean1 = new MessageBeanKo();
//		bean1.sayHello("全辨悼");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:sample1scope/applicationContext.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("sample1scope/applicationContext.xml");
		MessageBean bean = context.getBean("ko",MessageBean.class);
		bean.sayHello("全辨悼");
		MessageBean bean2 = context.getBean("ko",MessageBean.class);
		bean2.sayHello("全辨磊");
		MessageBean bean3 = context.getBean("en",MessageBean.class);
		bean3.sayHello("全辨鉴");
		MessageBean bean4 = context.getBean("en",MessageBean.class);
		bean4.sayHello("全辨巢");
	}

}
