package annotation2.autowired;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageBeanImpl implements MessageBean {
	private String name;
    private String message;
    @Autowired
    @Qualifier("outputer2")
    //@Resource(name="outputer")
    private Outputer out;
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
//	public void setOut(Outputer out) {
//		this.out = out;
//	}
	

}
