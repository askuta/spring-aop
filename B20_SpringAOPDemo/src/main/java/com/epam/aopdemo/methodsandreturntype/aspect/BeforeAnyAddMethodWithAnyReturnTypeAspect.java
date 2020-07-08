package com.epam.aopdemo.methodsandreturntype.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAnyAddMethodWithAnyReturnTypeAspect {

	@Before("execution(* add*())")
	public void beforeAddAccount() {
		System.out.println("=====>>> Executing @Before advice on '* add*()'");
	}
}
