package com.luv2code.springdemo.mvc.model;

import lombok.Data;

import java.util.LinkedHashMap;

@Data
public class Student {

    private String firstName;
    private String lastName;
    private String firstCountry;
    private String secondCountry;
    private String favoriteLanguage;
    private String secondaryLanguage;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> secondaryLanguageOptions;

    public Student() {

        countryOptions = new LinkedHashMap();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");

        secondaryLanguageOptions = new LinkedHashMap<>();
        secondaryLanguageOptions.put("Java", "Java"); //parameter order: value, display label
        secondaryLanguageOptions.put("C#", "C#");
        secondaryLanguageOptions.put("PHP", "PHP");
        secondaryLanguageOptions.put("Ruby", "Ruby");
    }
}
