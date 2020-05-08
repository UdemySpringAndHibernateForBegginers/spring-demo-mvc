package com.luv2code.springdemo.mvc.model;

import lombok.Data;

import java.util.LinkedHashMap;

@Data
public class Student {

    private String firstName;
    private String lastName;
    private String firstCountry;
    private String secondCountry;
    private LinkedHashMap<String, String> countryOptions;

    public Student() {

        countryOptions = new LinkedHashMap();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
    }
}
