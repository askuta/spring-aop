package com.epam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.before.BeforeAdviceConfig;
import com.epam.aopdemo.before.dao.BeforeDAO;

public class AOP01_BeforeAdviceType {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeforeAdviceConfig.class);

		BeforeDAO beforeDAO = context.getBean("beforeDAO", BeforeDAO.class);
		beforeDAO.addAccount();

		System.out.println("\nLet's call it again.\n");

		beforeDAO.addAccount();

		context.close();
	}
}
