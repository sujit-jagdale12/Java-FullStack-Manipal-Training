package com.annotationxl;


import org.springframework.stereotype.Component;

@Component
public class XlFormatter {
    
    public void setFont(String font) {
        System.out.println("XLFormatter : Set Font to " + font);
    }

    public String formatData() {
        return "formated data";
    }
}
