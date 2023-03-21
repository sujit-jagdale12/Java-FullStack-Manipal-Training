package com.typecheck;

class Car {

}

public class TypeChecker {

	public String checkObjectType(Object object) {
		if (object instanceof Integer)
			return "Int";
		else if (object instanceof String)
			return "String";
		else if (object instanceof Car)
			return "Car";

		return "";

	}
}
