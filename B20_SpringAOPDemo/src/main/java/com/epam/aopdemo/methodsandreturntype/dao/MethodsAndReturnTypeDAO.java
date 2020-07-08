package com.epam.aopdemo.methodsandreturntype.dao;

import org.springframework.stereotype.Component;

@Component
public class MethodsAndReturnTypeDAO {

	public void addAccount() {
		System.out.println(getClass() + ": MethodsAndReturnTypeDAO IS ADDING AN ACCOUNT");
	}
}
