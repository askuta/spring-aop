package com.epam.aopdemo.methodsandreturntype.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeMethodsAndReturnTypeDAOAddAccountAspect {

	@Before("execution(public void com.epam.aopdemo.methodsandreturntype.dao.MethodsAndReturnTypeDAO.addAccount())")
	public void beforeAddAccount() {
		System.out.println("=====>>> Executing @Before advice on 'public void com.zoroga.aopdemo.methodsandreturntype.dao.MethodsAndReturnTypeDAO.addAccount()'");
	}
}
