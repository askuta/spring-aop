package com.epam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.joinpoints.JoinPointsConfig;
import com.epam.aopdemo.joinpoints.dao.JoinPointsDAO;

public class AOP06_JoinPoints {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JoinPointsConfig.class);

		Account account = new Account("my name", "my level");

		JoinPointsDAO joinPointsDAO = context.getBean("joinPointsDAO", JoinPointsDAO.class);
		joinPointsDAO.addAccount(account, true);

		context.close();
	}
}
