package aop1_interface;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		System.out.println("[LOG]"+methodName+" 호출되기 전 관심사항(공통로직)");
		Object obj = invocation.proceed();
		System.out.println("<LOG>"+methodName+" 호출되기 후 관심사항(공통로직)");
		return null;
	}
	
}
