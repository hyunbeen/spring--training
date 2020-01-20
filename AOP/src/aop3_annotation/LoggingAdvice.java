package aop3_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
@Aspect
@Order(2)
public class LoggingAdvice {
	@Around("execution(public * aop3_annotation.*.*Hello(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[사전작업]"+methodName);
		Object obj = point.proceed();
		System.out.println("[사후작업]"+methodName);
		return obj;
		
	}
//	public void before(JoinPoint point) throws Throwable{
//		System.out.println("[************ 중요한 사전작업]"+point.getSignature().getName());
//	}
}
