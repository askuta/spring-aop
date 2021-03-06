package com.epam.aopdemo.afterthrowing.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Component
public class AfterThrowingDAO {

	public List<Account> findAccounts(boolean tripWire) {
		System.out.println(getClass() + ": AfterThrowingDAO IS LOOKING FOR ACCOUNTS");
		if (tripWire) {
			throw new RuntimeException("No soup for you!");
		} else {
			List<Account> accounts = new ArrayList<>();
			accounts.add(new Account("John", "Silver"));
			accounts.add(new Account("Madhu", "Platinum"));
			accounts.add(new Account("Luce", "Gold"));

			return accounts;
		}
	}
}
