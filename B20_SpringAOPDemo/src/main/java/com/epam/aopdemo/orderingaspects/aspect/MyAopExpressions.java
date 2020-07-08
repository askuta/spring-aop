package com.epam.aopdemo.orderingaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAopExpressions {

	@Pointcut("execution(* com.epam.aopdemo.orderingaspects.dao.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut("execution(* com.epam.aopdemo.orderingaspects.dao.*.get*(..))")
	public void forDaoGetters() {
	}

	@Pointcut("execution(* com.epam.aopdemo.orderingaspects.dao.*.set*(..))")
	public void forDaoSetters() {
	}

	@Pointcut("forDaoPackage() && !(forDaoGetters() || forDaoSetters())")
	public void forDaoPackageNoGettersSetters() {
	}
}
