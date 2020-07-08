package com.epam.aopdemo.around.aspect;

import java.util.ArrayList;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundFindAccountsAspect {

	@Around("execution (* com.epam.aopdemo.around.dao.AroundDAO.findAccounts(..))")
	public Object aroundFindAccounts(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("=====>>> Executing @Around advice on '* com.epam.aopdemo.around.dao.AroundDAO.findAccounts(..)'");

		long begin = System.currentTimeMillis();

		Object result = null;
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			System.out.println("=====>>> Executing @Around advice cought an Exception");
			result = new ArrayList<>();
		}

		long duration = System.currentTimeMillis() - begin;
		System.out.println("=====>>> duration: " + duration + " milliseconds");

		String method = proceedingJoinPoint.getSignature().toShortString();
		System.out.println("=====>>> method: " + method);

		return result;
	}
}
