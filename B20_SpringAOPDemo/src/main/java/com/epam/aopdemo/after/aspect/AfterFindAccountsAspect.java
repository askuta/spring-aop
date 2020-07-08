package com.epam.aopdemo.after.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterFindAccountsAspect {

	@After("execution (* com.epam.aopdemo.after.dao.AfterDAO.findAccounts(..))")
	public void afterFindAccount(JoinPoint joinPoint) {
		System.out.println("=====>>> Executing @After advice on '* com.epam.aopdemo.after.dao.AfterDAO.findAccounts(..)'");

		String method = joinPoint.getSignature().toShortString();
		System.out.println("=====>>> method: " + method);
	}
}
