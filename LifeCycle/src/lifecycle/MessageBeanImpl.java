package lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.BeansException;

public class MessageBeanImpl implements MessageBean,DisposableBean,BeanNameAware,BeanFactoryAware,InitializingBean {
	private String greeting;
	public MessageBeanImpl() {
		System.out.println("1. 인스턴스(메모리에 로딩) 될때");
	}
	public void setGreeting(String g) {
		greeting = g; 
		System.out.println("2.프라퍼티 지정될 때");
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("3. 빈의 이름을 설정할 때 : "+arg0);
	}
	
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("4. 빈 팩토리를 설정할때 : "+arg0);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6.InitializingBean 설정시");
		
	}
	
	public void init(){
		System.out.println("7. 초기화를 하고싶을 때 - 사용자");
		
	}
	
	@Override
	public void sayHello() {
		System.out.println("인사말 : "+greeting);
		System.out.println("9. 빈의 메소드 호출");

	}
	@Override
	public void destroy() throws Exception {
		System.out.println("10. 메모리 해제 될때");
		
	}
	
	
	

}
