package com.epam.aopdemo.afterthrowing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingFindAccountsAspect {

	@AfterThrowing(
			pointcut = "execution(* com.epam.aopdemo.afterthrowing.dao.AfterThrowingDAO.findAccounts(..))",
			throwing = "exception")
	public void afterThrowingFindAccounts(JoinPoint joinPoint, Throwable exception) {
		System.out.println("=====>>> Executing @AfterThrowing advice on '* com.epam.aopdemo.afterthrowing.dao.AfterThrowingDAO.findAccounts(..)'");
		System.out.println("=====>>> The Exception is: " + exception);
	}
}
