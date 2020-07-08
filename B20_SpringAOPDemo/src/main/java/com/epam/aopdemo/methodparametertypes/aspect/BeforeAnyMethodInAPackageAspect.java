package com.epam.aopdemo.methodparametertypes.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAnyMethodInAPackageAspect {

	@Before("execution(* com.epam.aopdemo.methodparametertypes.dao.*.*(..))")
	public void beforeAddAccount() {
		System.out.println("=====>>> Executing @Before advice on '* com.epam.aopdemo.methodparametertypes.*.*(..)'");
	}
}
