package com.qa.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Pointcut("within(com.qa.aop..*) && execution(public * *(..))")
	private void anyPublicOperation() {
	}

	@Before("anyPublicOperation()")
	private void bloop() {
		System.out.println("bloop");
	}

}
