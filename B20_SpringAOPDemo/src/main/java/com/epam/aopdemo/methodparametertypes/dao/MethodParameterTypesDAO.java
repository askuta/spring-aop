package com.epam.aopdemo.methodparametertypes.dao;

import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Component
public class MethodParameterTypesDAO {

	public void addAccount() {
		System.out.println(getClass() + ": MethodParameterTypesDAO IS ADDING AN ACCOUNT");
	}

	public void addAccount(Account account) {
		System.out.println(getClass() + ": MethodParameterTypesDAO IS ADDING AN ACCOUNT WITH ACCOUNT PARAMETER");
	}

	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": MethodParameterTypesDAO IS ADDING AN ACCOUNT WITH BOOLEAN PARAMETER");
	}

	public boolean doWork() {
		System.out.println(getClass() + ": MethodParameterTypesDAO IS DOING SOME WORK");
		return true;
	}
}
