package aop2_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[사전작업]"+methodName);
		Object obj = point.proceed();
		System.out.println("[사후작업]"+methodName);
		return obj;
		
	}
	public void before(JoinPoint point) throws Throwable{
		System.out.println("[************ 중요한 사전작업]"+point.getSignature().getName());
	}
}
