package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello from Spring!";
    }
    @GetMapping("/goodbye")
    @ResponseBody
    public String Goodbye(){
        return "Goodbye from Spring!";
    }

    @RequestMapping(path = "hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public  String SayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
//@GetMapping("/hello/{name}")
//    @ResponseBody
//    public String SayHello(@PathVariable String name){
//        return "Hello " + name + "!";
}


