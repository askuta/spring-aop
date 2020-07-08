package com.epam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.orderingaspects.OrderingAspectsConfig;
import com.epam.aopdemo.orderingaspects.dao.OrderingAspectsDAO;

public class AOP05_OrderingAspects {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderingAspectsConfig.class);

		OrderingAspectsDAO orderingAspectsDAO = context.getBean("orderingAspectsDAO", OrderingAspectsDAO.class);
		orderingAspectsDAO.addAccount();

		context.close();
	}
}
