package execise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import execise.order.domain.Customer;
import execise.order.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("execise/beans.xml");  
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/execise/beans.xml");
		
		CustomerService customerService = (CustomerService)ctx.getBean("customerService");
		
		Customer customer = (Customer)ctx.getBean("customer");
		
		customerService.saveCustomer(customer);
		customer.setName("홍길자");
		customerService.updateCustomer(customer);
		customerService.deleteCustomer(1);		
		
	}

}
