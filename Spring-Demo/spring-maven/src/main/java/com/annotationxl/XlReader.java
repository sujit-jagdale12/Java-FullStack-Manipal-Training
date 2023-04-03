package com.annotationxl;

import org.springframework.stereotype.Component;

@Component
public class XlReader {
    
    private XlFormatter formatter;

    public void setReadLimit(int limit) {
        System.out.println("XLReader : Set Read Limit " + limit);
    }

    public String readXL() {
        return formatter.formatData();
    }
}
