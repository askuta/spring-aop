package com.epam.aopdemo.before.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAddAccountAspect {

	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("=====>>> Executing @Before advice on 'public void addAccount()'");
	}
}
