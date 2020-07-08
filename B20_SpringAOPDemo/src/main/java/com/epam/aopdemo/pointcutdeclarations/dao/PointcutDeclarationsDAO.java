package com.epam.aopdemo.pointcutdeclarations.dao;

import org.springframework.stereotype.Component;

@Component
public class PointcutDeclarationsDAO {

	private String name;
	private String serviceCode;

	public void addAccount() {
		System.out.println(getClass() + ": PointcutDeclarationsDAO IS ADDING AN ACCOUNT");
	}

	public void goToSleep() {
		System.out.println(getClass() + ": PointcutDeclarationsDAO IS GOING TO SLEEP");
	}

	public String getName() {
		System.out.println(getClass() + ": PointcutDeclarationsDAO GET NAME");

		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": PointcutDeclarationsDAO SET NAME");

		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": PointcutDeclarationsDAO GET SERVICE CODE NAME");

		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": PointcutDeclarationsDAO SET SERVICE CODE NAME");

		this.serviceCode = serviceCode;
	}
}
