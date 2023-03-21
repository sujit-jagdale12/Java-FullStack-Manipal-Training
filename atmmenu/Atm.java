package com.atmmenu;

public class Atm {
	public void swipe(CardSwipable card) {
		System.out.println("Balance: "+card.balance());
		System.out.println("Deposit: "+card.deposit());
		System.out.println("Transfer: "+card.transfer());
		System.out.println("Withdraw: "+card.withdraw());
		System.out.println("---------------");
	}
}
