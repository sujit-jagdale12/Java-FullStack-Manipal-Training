package com.annotations;

import java.lang.reflect.Field;

public class GetSetProcessor {

	public static void generateAccessors(Object object) {
		Class<?> clazz = object.getClass();

		for (Field field : clazz.getDeclaredFields()) {
			String name = field.getName();
			String camelName = Character.toUpperCase(name.charAt(0)) + name.substring(1);

			System.out.println(camelName);

			System.out.println();
			String setter = "set" + camelName;
			String getter = "get" + camelName;
			System.out.println(setter+"()");
			System.out.println(getter+"()");

			System.out.println();
//			try {
//				clazz.getMethod(setter).invoke(object);
//				clazz.getMethod(getter).invoke(object);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}

	}
}
