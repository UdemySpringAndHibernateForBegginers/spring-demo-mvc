package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // == pre-process methods ==
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        // trimowanie każdego stringa z każdego requestu przekazanego do tego kontrolera
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    // == wyświetlenie formularza ==
    @GetMapping("/showForm")
    public String showForm(Model theModel) {

        //utworzenie pustego obiektu Customer
        Customer theCustomer = new Customer();

        //dodanie do modelu
        theModel.addAttribute("customer", theCustomer);

        return "customer-form";
    }

    // == przetworzenie formularza ==
    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                              BindingResult theBindingResult) {

        //log the input data
        System.out.println("=============");
        System.out.println("theCustomer: " + theCustomer.toString());
        System.out.println("=============");
        System.out.println("Binding result: " + theBindingResult.toString());
        System.out.println("=============");

        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            // nie trzeba przekazywać obiektu customer do modelu i do widoku student-confirmation - on będzie tam dostępny automatycznie
            // dziwne
            return "customer-confirmation";
        }
    }

}
