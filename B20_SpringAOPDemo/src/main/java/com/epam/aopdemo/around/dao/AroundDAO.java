package com.epam.aopdemo.around.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.epam.aopdemo.Account;

@Component
public class AroundDAO {

	public List<Account> findAccounts(boolean tripWire) {
		System.out.println(getClass() + ": AroundDAO IS LOOKING FOR ACCOUNTS");

		if (tripWire) {
			throw new RuntimeException("No soup for you!");
		} else {
			List<Account> accounts = new ArrayList<>();
			accounts.add(new Account("John", "Silver"));
			accounts.add(new Account("Madhu", "Platinum"));
			accounts.add(new Account("Luce", "Gold"));

			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return accounts;
		}
	}
}
