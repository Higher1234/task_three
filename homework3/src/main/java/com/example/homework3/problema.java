package com.example.homework3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/problema")
public class problema {
    @PostMapping("")
    public ModelAndView handleFormUpload(@RequestParam("a") int a, @RequestParam("b") int b) {
        System.out.println("a="+a+" b="+b);
        ModelAndView mv = new ModelAndView();
        System.out.println("good1");
        mv.addObject("result", a+b);
        System.out.println("good2");
        return mv;
    }
    @GetMapping("")
    public String setUpUploadForm() {
        return "problema";
    }


}


