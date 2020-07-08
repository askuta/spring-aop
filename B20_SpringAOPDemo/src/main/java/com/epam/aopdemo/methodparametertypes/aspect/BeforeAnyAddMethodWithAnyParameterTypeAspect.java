package com.epam.aopdemo.methodparametertypes.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAnyAddMethodWithAnyParameterTypeAspect {

	@Before("execution(* add*(..))")
	public void beforeAddAccount() {
		System.out.println("=====>>> Executing @Before advice on '* add*(..)'");
	}
}
