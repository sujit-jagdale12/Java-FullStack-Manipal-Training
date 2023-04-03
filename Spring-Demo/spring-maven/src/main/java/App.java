

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.FileConfig;
import com.demo.FileDemo;
import com.demo.FileUtil;

public final class App {

    public static void simpleSpring() {
        FileUtil util = new FileUtil();
        FileDemo fileDemo = new FileDemo(util);

        fileDemo.getSize();
    }

    public static void springConfig() {
       ApplicationContext context=new AnnotationConfigApplicationContext(FileConfig.class);
       FileDemo demo = context.getBean(FileDemo.class);
       demo.getSize();
    }

    public static void main(String[] args) {
        // simpleSpring();
        springConfig();
    }
}
