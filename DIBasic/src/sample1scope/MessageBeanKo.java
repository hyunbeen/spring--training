package sample1scope;

public class MessageBeanKo implements MessageBean {
	public MessageBeanKo() {
		System.out.println("MessageBeanKo 后 积己");
	}
	@Override
	public void sayHello(String name) {
		System.out.println(name + "丛 规啊");
	}

}
