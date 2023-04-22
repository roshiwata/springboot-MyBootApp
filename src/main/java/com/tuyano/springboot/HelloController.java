package com.tuyano.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("/other")
	public String other() {
		return "redirect:/";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "forward:/";
	}

	@RequestMapping("/{num}")
	public int index(@PathVariable int num, Model model){
		int res = 0;
		for(int i = 1; i <= num; i++)
			res += 1;
		model.addAttribute("msg", "total: " + res);
		return res;
	}

	@RequestMapping("/test/{st}")
    public String doSomething(@PathVariable String st) {
        MyClass1 myClass1 = new MyClass1(st);
        String value = myClass1.getValue();
		return value;
    }



}
