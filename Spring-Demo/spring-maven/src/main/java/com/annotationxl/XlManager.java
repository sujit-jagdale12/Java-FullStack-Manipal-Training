package com.annotationxl;

import org.springframework.stereotype.Component;

@Component
public class XlManager {

    private XlReader reader;
    private XlFormatter formatter;

    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
    }
}
