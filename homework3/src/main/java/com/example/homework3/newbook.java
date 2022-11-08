package com.example.homework3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/newbook")
public class newbook {
    @GetMapping("")
    public String setUpUploadForm() {
        return "newbook";
    }
    @PostMapping("")
    public void handleFormUpload(@RequestParam("bookname") String bookname, @RequestParam("author") String author,
                                 @RequestParam("publishdate") int publishdate,@RequestParam("publisher") String publisher,
                                    @RequestParam("num") int num) {
        System.out.println("bookname:"+bookname+"\nauthor:"+author+"\npublishdate:"+publishdate+"\npublisher:"+publisher
        +"\nnum:"+num);
    }
}


