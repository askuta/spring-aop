package com.epam.aopdemo.orderingaspects.dao;

import org.springframework.stereotype.Component;

@Component
public class OrderingAspectsDAO {

	public void addAccount() {
		System.out.println(getClass() + ": OrderingAspectsDAO IS ADDING AN ACCOUNT");
	}
}
