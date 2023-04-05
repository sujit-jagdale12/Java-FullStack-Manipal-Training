package com.ani.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.boot.service.CarService;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootFirstApplication.class, args);

		CarService service =  ctx.getBean(CarService.class);
		service.createCar(10, "abc", "lmn");
	}

}
