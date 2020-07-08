package com.epam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epam.aopdemo.pointcutdeclarations.PointcutDeclarationsConfig;
import com.epam.aopdemo.pointcutdeclarations.dao.PointcutDeclarationsDAO;

public class AOP04_PointcutDeclarations {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PointcutDeclarationsConfig.class);

		PointcutDeclarationsDAO pointcutDeclarationsDAO = context.getBean("pointcutDeclarationsDAO", PointcutDeclarationsDAO.class);
		pointcutDeclarationsDAO.addAccount();

		System.out.println("\n\n");

		pointcutDeclarationsDAO.goToSleep();

		System.out.println("\n\n");

		pointcutDeclarationsDAO.setName("foobar");
		pointcutDeclarationsDAO.setServiceCode("silver");

		System.out.println("\n\n");

		pointcutDeclarationsDAO.getName();
		pointcutDeclarationsDAO.getServiceCode();

		context.close();
	}
}
