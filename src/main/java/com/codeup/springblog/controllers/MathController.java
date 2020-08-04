package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path = "add/{x}/and/{y}", method = RequestMethod.GET )
    @ResponseBody
    public Long add(@PathVariable Long x, @PathVariable Long y){
        return x + y;
    }
    @RequestMapping(path = "subtract/{x}/from/{y}", method = RequestMethod.GET )
    @ResponseBody
    public Long subtract(@PathVariable Long x, @PathVariable Long y){
        return x - y;
    }
    @RequestMapping(path = "multiply/{x}/and/{y}", method = RequestMethod.GET )
    @ResponseBody
    public Long multiply(@PathVariable Long x, @PathVariable Long y){
        return x * y;
    }
    @RequestMapping(path = "divide/{x}/by/{y}", method = RequestMethod.GET )
    @ResponseBody
    public Long divide(@PathVariable Long x, @PathVariable Long y){
        return x / y;
    }
}
