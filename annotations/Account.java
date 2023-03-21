package com.annotations;

public class Account {

	@GeneratorAccessors
	private String ac;
	
	@GeneratorAccessors
	private double balance;

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
