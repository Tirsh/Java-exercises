package com.tirsh.springmvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//    @RequestMapping("/showDetails")
//    public String shoeDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr" + empName;
//        model.addAttribute("employeeName", empName);
//        return "show-details";
//    }
    @RequestMapping("/showDetails")
    public String shoeDetails(@RequestParam("employeeName") String empName, Model model){
        empName = "Mr" + empName;
        model.addAttribute("employeeName", empName);
        model.addAttribute("description", "very good person");
        return "show-details";
    }
}
