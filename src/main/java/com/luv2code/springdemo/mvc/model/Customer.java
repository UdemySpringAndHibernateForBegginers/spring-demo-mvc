package com.luv2code.springdemo.mvc.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "value too short")
    private String lastName;
}