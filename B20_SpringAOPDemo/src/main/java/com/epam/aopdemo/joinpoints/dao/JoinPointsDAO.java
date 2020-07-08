package com.epam.aopdemo.joinpoints.dao;

import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Component
public class JoinPointsDAO {

	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": JoinPointsDAO IS ADDING AN ACCOUNT");
	}
}
