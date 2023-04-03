package com.demo;

public class FileDemo {
    private FileUtil util;

    public FileDemo(FileUtil util) {
        this.util = util;
    }

    public void getSize(){
        System.out.println("The file size is "+util.fileSize());
    }
}
