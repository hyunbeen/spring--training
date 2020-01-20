package aop1_interface;

public class MessageBeanImpl implements MessageBean {

	@Override
	public void sayHello() {
		//공통부분에 메소드를 호출 (기존개념)
		System.out.println("sayHello() 호출");

	}

	@Override 
	public void korSayHello() {
		System.out.println("korsayHello() 호출");

	}

	@Override
	public void test() {
		System.out.println("test() 호출");

	}
	
	public void enSayHello() {
		System.out.println("ensayHello() 호출");

	}

}
