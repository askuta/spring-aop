package com.epam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.afterreturning.AfterReturningAdviceConfig;
import com.epam.aopdemo.afterreturning.dao.AfterReturningDAO;

public class AOP07_AfterReturning {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AfterReturningAdviceConfig.class);

		AfterReturningDAO afterReturningDAO = context.getBean("afterReturningDAO", AfterReturningDAO.class);
		List<Account> accounts = afterReturningDAO.findAccounts();
		System.out.println("\n\nMain Program - AOP07_AfterReturning:");
		System.out.println("-----");
		System.out.println(accounts);
		System.out.println("-----\n");

		context.close();
	}
}
