package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage() {
        return "main-menu";
    }

    //show html form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //process form
    @GetMapping("/proccessForm")
    public String proccessForm(HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();

        String result = "Yo, " + studentName + "!";

        model.addAttribute("message", result);

        return "helloworld";
    }
}
