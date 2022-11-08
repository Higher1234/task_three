package com.example.homework3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/first")
public class first {
    @GetMapping("")
    public String setUpUploadForm() {
        return "first";
    }

    @PostMapping("")
    public String add(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request) {
        System.out.println("password:"+password+"  username:"+username+"\n");
        if (username.equals("aaa") && password.equals("123")) {
            request.getSession().setAttribute("login", true);
            System.out.println("login success\n");
            return("redirect:/book");
        }
        else
            return "first";
    }
}


