package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class BasicDemos {

	public void demo1() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous class object");
			}
		};
	}

	public void demo2() {
		Runnable runnable = () -> {

		};

		Runnable runnable2 = this::anyMethod;

	}

	public void anyMethod() {
	}

	public void demo3() {
		ArrayList<String> names = new ArrayList<>();
		names.add("xyz");
		names.add("abc");
		names.add("pqr");
		names.add("lmn");
		names.add("ret");
		names.add("opt");
		names.add("tiu");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for (String name : names) {
			System.out.println(name);
		}

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public void demo4() {
		ArrayList<String> names = new ArrayList<>();
		names.add("xyz");
		names.add("abc");
		names.add("pqr");
		names.add("lmn");
		names.add("ret");
		names.add("opt");
		names.add("tiu");

		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});
	}

	public void demo5() {
		ArrayList<String> names = new ArrayList<>();
		names.add("xyz");
		names.add("abc");
		names.add("pqr");
		names.add("lmn");
		names.add("ret");
		names.add("opt");
		names.add("tiu");

		names.forEach((String name) -> System.out.println(name));
		names.forEach(name -> System.out.println(name));
		System.out.println("Using local method reference");
		names.forEach(this::printing);// local method used so this for local reference
		System.out.println("Using System.out method reference");
		names.forEach(System.out::println);// System method used so reference passed as System.out
	}

	public void printing(String name) {
		System.out.println(name);
	}
}
