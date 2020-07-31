package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @RequestMapping(path = "posts", method = RequestMethod.GET)
    @ResponseBody
    public String PostIndex(){
        return "post index page";
    }
    @RequestMapping(path = "posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String ViewIndividualPost(@PathVariable Long id){
        return "view individual id";
    }
    @RequestMapping(path = "posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String ViewCreate(){
        return "view the form for creating a post";
    }
    @RequestMapping(path = "posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }

}
