package annotation1.required;

import org.springframework.beans.factory.annotation.Required;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String message;
	
	public void sayHello() {
		System.out.println(name+"님께 "+message+" 보냄" );
		
	}

	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
