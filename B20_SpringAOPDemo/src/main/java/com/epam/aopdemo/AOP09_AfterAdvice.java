package com.epam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.after.AfterAdviceConfig;
import com.epam.aopdemo.after.dao.AfterDAO;

public class AOP09_AfterAdvice {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AfterAdviceConfig.class);

		AfterDAO afterDAO = context.getBean("afterDAO", AfterDAO.class);

		try {
			boolean tripWire = true;
			List<Account> accounts = afterDAO.findAccounts(tripWire);
			System.out.println("\n\nMain Program - AOP09_AfterAdvice:");
			System.out.println(accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}

		context.close();
	}
}
