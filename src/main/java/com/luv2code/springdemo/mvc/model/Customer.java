package com.luv2code.springdemo.mvc.model;

import com.luv2code.springdemo.mvc.annotations.CourseCode;
import com.luv2code.springdemo.mvc.annotations.MultiCourseCode;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "value too short")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value=0, message = "value must be >= 0")
    @Max(value=10, message = "value must be <= 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value = "TOPS", message = "must start with TOPS")
    private String courseCode;

    @MultiCourseCode
    private String secondaryCourseCode;
}
