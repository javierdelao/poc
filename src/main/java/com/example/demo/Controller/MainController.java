package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MainController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String renewPlan() {
        return "hello world";
    }

}
