package com.aop;

import org.springframework.stereotype.Component;

@Component
public class Reader {
   public void readData()  {
        System.out.println("Reading From XL Data");
    }
}
