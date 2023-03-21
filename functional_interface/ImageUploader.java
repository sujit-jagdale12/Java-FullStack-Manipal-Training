package com.functional_interface;

import java.util.function.Consumer;

public class ImageUploader {

	private void simulateTime(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void select(Consumer<String> c) {
		simulateTime(3);
		c.accept("selection");
	}

	public void compress(Consumer<String> c) {
		simulateTime(8);
		c.accept("compress");
	}

	public void upload(Consumer<String> c) {
		simulateTime(5);
		c.accept("upload");
	}
}
