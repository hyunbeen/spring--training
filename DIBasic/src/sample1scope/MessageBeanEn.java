package sample1scope;

public class MessageBeanEn implements MessageBean {
	public MessageBeanEn() {
		System.out.println("MessageBeanEn ºó »ý¼º");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("Hello~~~,"+name);

	}

}
