package com.epam.aopdemo.afterreturning.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Component
public class AfterReturningDAO {

	public void addAccount() {
		System.out.println(getClass() + ": AfterReturningDAO IS ADDING AN ACCOUNT");
	}

	public List<Account> findAccounts() {
		System.out.println(getClass() + ": AfterReturningDAO IS LOOKING FOR ACCOUNTS");

		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account("John", "Silver"));
		accounts.add(new Account("Madhu", "Platinum"));
		accounts.add(new Account("Luce", "Gold"));

		return accounts;
	}
}
