package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    // == wyświetlenie formularza ==
    @GetMapping("/showForm")
    public String showForm(Model theModel) {

        //utworzenie pustego obiektu Student
        Student theStudent = new Student();

        //dodanie do modelu
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("theCountryOptions", countryOptions);

        return "student-form";
    }

    // == przetworzenie formularza ==
    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        //log the input data
        System.out.println("theStudent: " + theStudent.toString());

        // nie trzeba przekazywać obiektu student do modelu i do widoku student-confirmation - on będzie tam dostępny automatycznie
        // dziwne

        return "student-confirmation";
    }

}
