package sample1scope;

public class MessageBeanKo implements MessageBean {
	public MessageBeanKo() {
		System.out.println("MessageBeanKo �� ����");
	}
	@Override
	public void sayHello(String name) {
		System.out.println(name + "�� �氡");
	}

}
