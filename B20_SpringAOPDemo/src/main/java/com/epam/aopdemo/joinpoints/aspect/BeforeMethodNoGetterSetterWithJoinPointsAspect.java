package com.epam.aopdemo.joinpoints.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Aspect
@Component
public class BeforeMethodNoGetterSetterWithJoinPointsAspect {

	@Before("com.epam.aopdemo.joinpoints.aspect.MyAopExpressions.forDaoPackageNoGettersSetters()")
	public void beforeAddAccount(JoinPoint joinPoint) {
		System.out.println("=====>>> BeforeMethodNoGetterSetterWithJoinPointsAspect is executing @Before advice on '@Pointcut --> forDaoPackageNoGettersSetters()'");

		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("   ----->>> Method: " + methodSignature);

		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			System.out.println("   ----->>> arg: " + arg);
			if (arg instanceof Account) {
				Account account = (Account) arg;
				System.out.println("   ----->>> account name: " + account.getName());
				System.out.println("   ----->>> account level: " + account.getLevel());
			}
		}
	}
}
