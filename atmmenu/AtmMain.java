package com.atmmenu;

public class AtmMain {
	public static void main(String[] args) {

		Axis card1 = new Axis();

		HDFC card2 = new HDFC();

		SBI card3 = new SBI();


		Atm atm = new Atm();
		atm.swipe(card1);
		atm.swipe(card2);
		atm.swipe(card3);
	}
}

