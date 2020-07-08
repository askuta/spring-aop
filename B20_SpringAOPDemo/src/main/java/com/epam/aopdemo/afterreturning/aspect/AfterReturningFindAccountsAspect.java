package com.epam.aopdemo.afterreturning.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Aspect
@Component
public class AfterReturningFindAccountsAspect {

	@AfterReturning(
			pointcut = "execution(* com.epam.aopdemo.afterreturning.dao.AfterReturningDAO.findAccounts(..))",
			returning = "result")
	public void afterReturningFindAccounts(JoinPoint joinPoint, List<Account> result) {
		System.out.println("=====>>> Executing @AfterReturning advice on '* com.epam.aopdemo.afterreturning.dao.AfterReturningDAO.findAccounts(..)'");

		String method = joinPoint.getSignature().toShortString();
		System.out.println("=====>>> method sighature: " + method);
		System.out.println("=====>>> result is: " + result);

		if (!result.isEmpty()) {
			for (Account account : result) {
				String nameUpperCase = account.getName().toUpperCase();
				account.setName(nameUpperCase);
			}
		}
	}
}
