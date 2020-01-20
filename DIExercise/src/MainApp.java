import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBeanImpl messagebean = context.getBean("messagebean",MessageBeanImpl.class);
		OutputerImpl outputer  = context.getBean("outputer",OutputerImpl.class);
		messagebean.sayHello();
		//bean.sayHello();
		//[결과] 지정한 name 과 message 값이 콘솔에 출력하고 save.txt저장
	}

}
