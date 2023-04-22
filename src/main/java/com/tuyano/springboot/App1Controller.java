package com.tuyano.springboot;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

// App1Controller.java
@RestController
public class App1Controller {

    private RestTemplate restTemplate;

    @Autowired
    public App1Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        String url = "http://localhost:8082/hello";
        String response = restTemplate.getForObject(url, String.class);
        return "App1 received: " + response;
    }
}

