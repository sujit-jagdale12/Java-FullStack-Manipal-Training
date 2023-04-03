package com.aop;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.aop")
@Configuration
public class AppConfigure {

}
