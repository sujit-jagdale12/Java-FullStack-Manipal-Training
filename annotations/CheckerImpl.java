package com.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CheckerImpl {

	public static String checkField(Object object) {
		
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			String name=field.getName();
			
			char firstChar = name.charAt(0);
			
			if(Character.isUpperCase(firstChar)) {
				Checker chk = field.getAnnotation(Checker.class);
                return "❌ "+ name +" : " +chk.message();
			}
		}
		
		return "✔all correct.";
	}
}
