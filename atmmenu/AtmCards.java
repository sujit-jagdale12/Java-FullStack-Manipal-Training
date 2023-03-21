package com.atmmenu;

interface CardSwipable {

	double balance();

	int withdraw();

	int deposit();

	int transfer();
}

class Axis implements CardSwipable {
	@Override
	public double balance() {
		return 1000;
	}

	@Override
	public int withdraw() {
		return 500;
	}

	@Override
	public int deposit() {
		return 5000;
	}

	@Override
	public int transfer() {
		return 1500;
	}
}

class SBI implements CardSwipable {
	@Override
	public double balance() {
		return 12321;
	}

	@Override
	public int withdraw() {
		return 4532;
	}

	@Override
	public int deposit() {
		return 4590;
	}

	@Override
	public int transfer() {
		return 3200;
	}
}

class HDFC implements CardSwipable {
	@Override
	public double balance() {
		return 10000;
	}

	@Override
	public int withdraw() {
		return 4321;
	}

	@Override
	public int deposit() {
		return 6500;
	}

	@Override
	public int transfer() {
		return 1232;
	}
}