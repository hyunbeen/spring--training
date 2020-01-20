package aop2_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class SampleAdvice {
	public void before(JoinPoint point) throws Throwable{
		System.out.println("[sampleadvice 중요한 사전작업]"+point.getSignature().getName());
		
	}
	
	public void after(JoinPoint point) throws Throwable{
		System.out.println("[sampleadvice 중요한 사후작업]"+point.getSignature().getName());
		
	}
}
