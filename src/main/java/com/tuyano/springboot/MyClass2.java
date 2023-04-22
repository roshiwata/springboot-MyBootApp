package com.tuyano.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@RestController
public class MyClass2 {

    // private String value2;

	@RequestMapping("/MY2/")
	public int index() {
        int value2 = 0;
		value2 = 111;
        value2 = value2 + 1;

        MyClass1 myClass1a = new MyClass1("fff");
        int vb = myClass1a.plusValue();
        vb = myClass1a.plusValue();
        vb = myClass1a.plusValue();

        return vb;
	}

}