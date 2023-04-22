package com.tuyano.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

public class MyClass1 {
    private String value;
    private int v2;

    public MyClass1(String value) {
        this.value = value;
        this.v2 = 0;
    }

    public String getValue() {
        return value;
    }

    public int plusValue() {
        this.v2 = this.v2 + 1;
        return this.v2;
    }

}