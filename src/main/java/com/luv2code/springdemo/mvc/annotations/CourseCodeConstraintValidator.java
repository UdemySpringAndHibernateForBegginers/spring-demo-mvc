package com.luv2code.springdemo.mvc.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCodeAnnotation) {
        coursePrefix = courseCodeAnnotation.value();
    }

    @Override
    public boolean isValid(String inputValue, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (inputValue != null) {
            result = inputValue.startsWith(coursePrefix);
        } else {
            result = true;
        }

        return result;
    }
}
