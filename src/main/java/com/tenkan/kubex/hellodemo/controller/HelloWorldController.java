package com.tenkan.kubex.hellodemo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
    @RequestMapping("/testpath/greeting")
    public String greet() {
        return "Good Morning.";
    }
}