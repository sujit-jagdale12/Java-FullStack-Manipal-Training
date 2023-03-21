package com.generics;

public class DynamicBox<T> {
	private T anything;

    public void setAnything(T anything) {
        this.anything = anything;
    }

    public T getAnything() {
        return anything;
    }
}
