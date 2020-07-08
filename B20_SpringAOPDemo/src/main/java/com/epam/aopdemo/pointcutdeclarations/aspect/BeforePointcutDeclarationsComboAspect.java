package com.epam.aopdemo.pointcutdeclarations.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforePointcutDeclarationsComboAspect {

	@Pointcut("execution(* com.epam.aopdemo.pointcutdeclarations.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Pointcut("execution(* com.epam.aopdemo.pointcutdeclarations.dao.*.get*(..))")
	private void forDaoGetters() {
	}

	@Pointcut("execution(* com.epam.aopdemo.pointcutdeclarations.dao.*.set*(..))")
	private void forDaoSetters() {
	}

	@Before("forDaoPackage()")
	public void beforeMethodsInDAOPackage() {
		System.out.println("=====>>> Executing @Before advice on '@Pointcut --> forDaoPackage()'");
	}

	@Before("forDaoPackage() && !(forDaoGetters() || forDaoSetters())")
	public void reuseThePointcutDeclaration() {
		System.out.println("=====>>> Executing @Before advice on '@Pointcut --> forDaoPackage() && !(forDaoGetters() || forDaoSetters())'");
	}
}
