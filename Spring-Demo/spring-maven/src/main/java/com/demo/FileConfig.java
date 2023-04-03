package com.demo;

import org.springframework.context.annotation.Bean;

public class FileConfig {

    @Bean
    public FileUtil getUtil() {
        return new FileUtil();
    }
    @Bean
    public FileUtil getUtil1() {
        return new FileUtil();
    }

    @Bean
    public FileDemo getFileDemo() {
        return new FileDemo(getUtil());
    }
}
