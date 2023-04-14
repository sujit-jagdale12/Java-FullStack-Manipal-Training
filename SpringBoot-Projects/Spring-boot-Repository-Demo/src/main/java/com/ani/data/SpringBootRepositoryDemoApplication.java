package com.ani.data;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.data.crud.CrudDemo;
import com.ani.data.crud.CustomizedMethods;


@SpringBootApplication
public class SpringBootRepositoryDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootRepositoryDemoApplication.class, args);

		// CrudDemo crudDemo=ctx.getBean(CrudDemo.class);
		// crudDemo.demo();

		CustomizedMethods methods=ctx.getBean(CustomizedMethods.class);
		methods.demo5();
	}

}
