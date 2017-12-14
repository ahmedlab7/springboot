package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ali on 14.12.2017.
 */

@Controller
public class HelloController {

    private HelloService helloService;

    public void setHelloService(HelloService helloService){

        this.helloService = helloService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(ModelMap model){

        String message = helloService.getMessage();
        model.addAttribute("message", message);
        return "/hello";

    }
}
