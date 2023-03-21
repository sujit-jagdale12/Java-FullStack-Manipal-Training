package com.annotations;

public class Tiger implements Animal {

	@Checker
	private int Speed;
	
	@Checker
	private int Color;
	
	@Override
	public void walk() {

	}

	@Override
	public void eat() {

	}

	@Deprecated
	public void sleep() {

	}

}
