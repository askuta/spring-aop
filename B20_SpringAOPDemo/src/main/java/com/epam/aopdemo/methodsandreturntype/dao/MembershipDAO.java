package com.epam.aopdemo.methodsandreturntype.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + ": MembershipDAO IS ADDING AN ACCOUNT");
	}

	public void addSilly() {
		System.out.println(getClass() + ": MembershipDAO IS ADDING SILLYNESS");
	}

	public boolean addSillyReturnBoolean() {
		System.out.println(getClass() + ": MembershipDAO IS RETURNING BOOLEAN");
		return true;
	}
}
