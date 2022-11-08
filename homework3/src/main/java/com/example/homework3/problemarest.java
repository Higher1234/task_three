package com.example.homework3;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController

public class problemarest {
    @GetMapping("/problema1")
    public String handleFormUpload(@RequestParam("a") int a, @RequestParam("b") int b) {
        System.out.println("a="+a+"b="+b);
        String result="求和结果:"+(a+b);
        return result;
    }
    @GetMapping(value = "/problema2/{a}/{b}")
    public String handleFormUpload1(@PathVariable("a") int a, @PathVariable("b") int b) {
        System.out.println("a="+a+"b="+b);
        String result="求和结果"+(a+b);
        return result;
    }

}
