package com.ani.data.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.data.jpa.domain.Mobile;
import com.ani.data.jpa.domain.Product;
import com.ani.data.jpa.repository.ProductRepo;
import com.ani.data.jpa.repository.ProductSpecifications;
import com.ani.data.jpa.repository.SimpleJpaRepo;
import com.ani.data.jpa.service.ProductService;

@SpringBootApplication
public class SpringJpaDataApplication {

	public static void demo1(SimpleJpaRepo repo) {

		List<Mobile> mobiles = repo.findByNumberContaining("88");
		mobiles.forEach(System.out::println);

		System.out.println(repo.count());
	}

	public static void demo2(SimpleJpaRepo repo) {

		List<Mobile> mobiles1 = repo.findAllJPQL();
		mobiles1.forEach(System.out::println);

		List<Mobile> mobiles2 = repo.findAllSQL();
		mobiles2.forEach(System.out::println);
	}

	public static void demo3(SimpleJpaRepo repo) {
		Optional<Mobile> op1 = repo.findOneWithMobile1("1607092591");
		Mobile mob1 = op1.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob1);

		Optional<Mobile> op2 = repo.findOneWithMobile2("1607092591");
		Mobile mob2 = op2.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob2);

		Optional<Mobile> op3 = repo.findOneWithMobile3("1607092591");
		Mobile mob3 = op3.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob3);
	}
	public static void demo5(SimpleJpaRepo repo) {
		repo.custSave(99L, "9999", 18.90f, 72.90f);
	}

	public static void demo6(ProductRepo repo) {
		List<Product> products1 = repo.findAll(ProductSpecifications.hasNameContaining("Pi"));
		products1.forEach(System.out::println);
	}

	public static void demo8(ProductService service) {
		// service.customMethod(3);
		service.customUpadte(8);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJpaDataApplication.class, args);
		
		// demo1(ctx.getBean(SimpleJpaRepo.class));
		// demo2(ctx.getBean(SimpleJpaRepo.class));
		// demo3(ctx.getBean(SimpleJpaRepo.class));

		// demo6(ctx.getBean(ProductRepo.class));
		demo8(ctx.getBean(ProductService.class));

        // String[] beans = ctx.getBeanDefinitionNames();
		// Arrays.stream(beans).forEach(System.out::println);
	}

}
