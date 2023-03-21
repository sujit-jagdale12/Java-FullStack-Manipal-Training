package com.functional_interface;

import java.util.function.Consumer;

public class App {

	public static void callback() {
		ImageUploader uploader = new ImageUploader();

		uploader.select(selecttask ->{
			System.out.println("✔✔Image selected");
			uploader.compress(uploadtask -> System.out.println("✔Image compressed"));
			uploader.upload(uploadtask -> System.out.println("Image uploaded"));
		});
	}

	public static void main(String[] args) {
		Demos demos = new Demos();
//		demos.supplier();

		callback();
	}
}
