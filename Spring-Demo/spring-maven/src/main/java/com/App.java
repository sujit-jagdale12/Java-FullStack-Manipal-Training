package com;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotationxl.XlConfig;
import com.demo.FileConfig;
import com.demo.FileDemo;
import com.demo.FileUtil;

public class App {

    public static void simpleSpring() {
        System.out.println("🔥 Providing Dependencies Normally 🔥");
        FileUtil util = new FileUtil();
        FileDemo fileDemo = new FileDemo(util);

        fileDemo.getSize();
    }

    public static void springConfig() {
        System.out.println("🔥 Providing Dependencies With Java Code 🔥");
        ApplicationContext context = new AnnotationConfigApplicationContext(FileConfig.class);
        FileDemo demo = context.getBean(FileDemo.class);
        demo.getSize();
    }

    public static void springXmlConfig() {
        System.out.println("🔥 Providing Dependencies With Xml Config 🔥");
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
        FileDemo demo = context.getBean(FileDemo.class);
        demo.getSize();
    }

    public static void withSpringAnnotationConfig() {
        System.out.println("🔥 Providing Dependencies With Annotation Config 🔥");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(XlConfig.class, FileConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        simpleSpring();
        springXmlConfig();
        springConfig();
        withSpringAnnotationConfig();
    }
}
