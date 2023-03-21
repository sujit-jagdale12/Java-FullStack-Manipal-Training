package com.annotations;

public class App {

	public static void demo1() {
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.walk();

		String str = CheckerImpl.checkField(tiger);
		System.out.println(str);

//		Class<Tiger> cls = Tiger.class;
//		System.out.println(cls.getName());
//		System.out.println(cls.getSimpleName());
	}

	public static void demo2() {
		Account account = new Account();
		GetSetProcessor.generateAccessors(account);
	}

	public static void main(String[] args) {
		
		System.out.println("💥 Annotations 💥");
//		demo1();
		demo2();
	}
}
