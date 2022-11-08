package com.example.homework3;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class sessionadd {
    @GetMapping("/sessionadd")
    public String add(@RequestParam("para") int para,HttpServletRequest request)
    {
        System.out.println(para);
        Object totalnum=request.getSession().getAttribute("totalnum");
        if(totalnum==null)
        {
            request.getSession().setAttribute("totalnum",para);
        }
        else
        {
            request.getSession().setAttribute("totalnum",para+(int)totalnum);
        }
        return "sessionadd";
    }
}
