package com.luv2code.springdemo.mvc.model;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "value too short")
    private String lastName;

    @Min(value=0, message = "value must be >= 0")
    @Max(value=10, message = "value must be <= 10")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
}
