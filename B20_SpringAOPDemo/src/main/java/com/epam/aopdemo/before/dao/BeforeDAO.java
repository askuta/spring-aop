package com.epam.aopdemo.before.dao;

import org.springframework.stereotype.Component;

@Component
public class BeforeDAO {

	public void addAccount() {
		System.out.println(getClass() + ": BeforeDAO IS ADDING AN ACCOUNT");
	}
}
