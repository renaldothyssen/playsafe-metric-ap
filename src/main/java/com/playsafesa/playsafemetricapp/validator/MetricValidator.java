package com.playsafesa.playsafemetricapp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
/*
Spring validator to validate input that surface through the RestController, ideally useful when using input based on a schema class.
I've dedicated to include, to show an alternative way of validating this service. However, it is not currently being used in the actual application.
 */
@Component
public class MetricValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"id","Err001","Input is empty");
        if(errors.hasErrors()){
            return;
        }
    }
}
