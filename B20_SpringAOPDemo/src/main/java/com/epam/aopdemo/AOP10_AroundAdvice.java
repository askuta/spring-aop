package com.epam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.around.AroundAdviceConfig;
import com.epam.aopdemo.around.dao.AroundDAO;

public class AOP10_AroundAdvice {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AroundAdviceConfig.class);

		AroundDAO aroundDAO = context.getBean("aroundDAO", AroundDAO.class);

		boolean tripWire = false;
		System.out.println("Main Program - AOP10_AroundAdvice:");
		List<Account> accounts = aroundDAO.findAccounts(tripWire);
		System.out.println(accounts);

		try {
			tripWire = true;
			System.out.println("\n\nMain Program - AOP10_AroundAdvice:");
			accounts = aroundDAO.findAccounts(tripWire);
			System.out.println(accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}

		context.close();
	}
}
