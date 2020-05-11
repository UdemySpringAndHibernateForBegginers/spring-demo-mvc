package com.luv2code.springdemo.mvc.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MultiCourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MultiCourseCode {

    //definicja parametrów value i ich wartości domyślnych
    public String[] value() default {"LUV", "TOPS"};
    public String message() default "must start with LUV or TOPS";

    //can group related constraints (?)
    public Class<?>[] groups() default {};

    //default payloads (?)
    public Class<? extends Payload>[] payload() default {};
}
