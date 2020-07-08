package com.epam.aopdemo.orderingaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(42)
public class MyCloudLogAsyncAspect {

	@Before("com.epam.aopdemo.orderingaspects.aspect.MyAopExpressions.forDaoPackageNoGettersSetters()")
	public void beforeMethodsInDAOPackage3() {
		System.out.println("=====>>> MyCloudLogAsyncAspect is executing @Before advice on '@Pointcut --> forDaoPackageNoGettersSetters()'");
	}
}
