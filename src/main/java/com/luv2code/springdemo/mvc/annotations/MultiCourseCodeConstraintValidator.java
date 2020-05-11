package com.luv2code.springdemo.mvc.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class MultiCourseCodeConstraintValidator implements ConstraintValidator<MultiCourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(MultiCourseCode courseCodeAnnotation) {
        coursePrefixes = courseCodeAnnotation.value();
    }

    @Override
    public boolean isValid(String inputValue, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;
        List<String> coursePrefixesList = Arrays.asList(coursePrefixes);

        if (inputValue != null) {
            return coursePrefixesList.stream().anyMatch(x -> inputValue.startsWith(x));
        } else {
            return true;
        }

    }
}
