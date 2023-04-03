package com.aop;

import java.time.LocalDate;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReaderAspect {

	@Before("execution(* com.aop.*.*(..))")
	public void aspect() {
		System.out.println("Date: " + LocalDate.now().toString());
	}
}
