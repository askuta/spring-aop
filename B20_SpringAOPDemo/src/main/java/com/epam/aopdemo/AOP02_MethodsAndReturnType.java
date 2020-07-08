package com.epam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.methodsandreturntype.MethodsAndReturnTypeConfig;
import com.epam.aopdemo.methodsandreturntype.dao.MembershipDAO;
import com.epam.aopdemo.methodsandreturntype.dao.MethodsAndReturnTypeDAO;

public class AOP02_MethodsAndReturnType {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MethodsAndReturnTypeConfig.class);

		MethodsAndReturnTypeDAO methodsAndReturnTypeDAO = context.getBean("methodsAndReturnTypeDAO", MethodsAndReturnTypeDAO.class);
		methodsAndReturnTypeDAO.addAccount();

		System.out.println("\n\n");

		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		membershipDAO.addAccount();

		System.out.println();
		membershipDAO.addSilly();

		System.out.println();
		membershipDAO.addSillyReturnBoolean();

		context.close();
	}
}
