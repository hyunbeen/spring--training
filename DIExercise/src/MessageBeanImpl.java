import java.io.IOException;

public class MessageBeanImpl implements MessageBean {
	String name;
    String message;
    Outputer out;
	@Override
	public void sayHello() {
		  
	        System.out.print("name : "+name);
	        try {
				out.writeMessage(message);
			} catch (IOException e) {
				
				e.printStackTrace();
			}

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Outputer getOut() {
		return out;
	}
	public void setOut(Outputer out) {
		this.out = out;
	}
	

}
