package com.epam.aopdemo.orderingaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-11)
public class MyDemoLoggingAspect {

	@Before("com.epam.aopdemo.orderingaspects.aspect.MyAopExpressions.forDaoPackageNoGettersSetters()")
	public void beforeMethodsInDAOPackage() {
		System.out.println("=====>>> MyDemoLoggingAspect is executing @Before advice on '@Pointcut --> forDaoPackageNoGettersSetters()'");
	}
}
