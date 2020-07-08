package com.epam.aopdemo.joinpoints.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAopExpressions {

	@Pointcut("execution(* com.epam.aopdemo.joinpoints.dao.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut("execution(* com.epam.aopdemo.joinpoints.dao.*.get*(..))")
	public void forDaoGetters() {
	}

	@Pointcut("execution(* com.epam.aopdemo.joinpoints.dao.*.set*(..))")
	public void forDaoSetters() {
	}

	@Pointcut("forDaoPackage() && !(forDaoGetters() || forDaoSetters())")
	public void forDaoPackageNoGettersSetters() {
	}
}
