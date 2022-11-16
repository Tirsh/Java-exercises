package com.tirsh.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-employee-details";
    }
//    @RequestMapping("/showDetails")
//    public String shoeDetails(){
//        return "show-details";
//    }

    @RequestMapping("/showDetails")
    public String shoeDetails(HttpServletRequest request){
        String name = request.getParameter("employeeName");
        return "show-details";
    }
}
