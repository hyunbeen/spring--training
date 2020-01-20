package aop3_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
@Aspect
@Order(1)
public class SampleAdvice {
	@Before("execution(public * aop3_annotation.*.*Hello(..))")
	public void before(JoinPoint point) throws Throwable{
		System.out.println("[sampleadvice 중요한 사전작업]"+point.getSignature().getName());
		
	}
	@After("execution(public * aop3_annotation.*.*Hello(..))")
	public void after(JoinPoint point) throws Throwable{
		System.out.println("[sampleadvice 중요한 사후작업]"+point.getSignature().getName());
		
	}
}
