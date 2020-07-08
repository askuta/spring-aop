package com.epam.aopdemo.orderingaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {

	@Before("com.epam.aopdemo.orderingaspects.aspect.MyAopExpressions.forDaoPackageNoGettersSetters()")
	public void beforeMethodsInDAOPackage2() {
		System.out.println("=====>>> MyApiAnalyticsAspect is executing @Before advice on '@Pointcut --> forDaoPackageNoGettersSetters()'");
	}
}
