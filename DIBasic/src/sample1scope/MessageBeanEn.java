package sample1scope;

public class MessageBeanEn implements MessageBean {
	public MessageBeanEn() {
		System.out.println("MessageBeanEn �� ����");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("Hello~~~,"+name);

	}

}
