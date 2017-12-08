package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ali on 8.12.2017.
 */

@RestController //bir rest servisi olacağını belirliyor.
public class HelloController {

    @RequestMapping
    public String sayHello(){

        return "Hello";
    }

}
