

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
        FileConfig config = new FileConfig();
        FileDemo fileDemo = config.getFileDemo();
        fileDemo.getSize();

    }

    public static void main(String[] args) {
        // simpleSpring();
        springConfig();
    }
}
