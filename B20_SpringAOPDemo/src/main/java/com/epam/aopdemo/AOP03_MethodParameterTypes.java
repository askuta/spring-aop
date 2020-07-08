package com.epam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.methodparametertypes.MethodParameterTypesConfig;
import com.epam.aopdemo.methodparametertypes.dao.MethodParameterTypesDAO;

public class AOP03_MethodParameterTypes {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MethodParameterTypesConfig.class);

		Account account = new Account("name", "level");

		MethodParameterTypesDAO methodParameterTypesDAO = context.getBean("methodParameterTypesDAO", MethodParameterTypesDAO.class);
		methodParameterTypesDAO.addAccount();

		System.out.println("\n\n");

		methodParameterTypesDAO.addAccount(account);

		System.out.println("\n\n");

		methodParameterTypesDAO.addAccount(account, true);

		System.out.println("\n\n");

		methodParameterTypesDAO.doWork();

		context.close();
	}
}
