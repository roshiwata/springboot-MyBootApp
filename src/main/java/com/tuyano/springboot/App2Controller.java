package com.tuyano.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// App2Controller.java
@RestController
public class App2Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from App2sssssss";
    }
}