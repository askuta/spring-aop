package com.epam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.afterthrowing.AfterThrowingAdviceConfig;
import com.epam.aopdemo.afterthrowing.dao.AfterThrowingDAO;

public class AOP08_AfterThrowing {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AfterThrowingAdviceConfig.class);

		AfterThrowingDAO afterThrowingDAO = context.getBean("afterThrowingDAO", AfterThrowingDAO.class);

		try {
			boolean tripWire = true;
			List<Account> accounts = afterThrowingDAO.findAccounts(tripWire);
			System.out.println("\n\nMain Program - AOP08_AfterThrowing:");
			System.out.println(accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}

		context.close();
	}
}
