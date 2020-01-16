package org.contract.common.validation.validators;

import org.contract.common.validation.annotations.HasValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * value validator.
 *
 */

public class HasValueValidator implements ConstraintValidator<HasValue, String> {
    @Override
    public void initialize(HasValue constraintAnnotation) {
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {
        return object != null && !object.trim().isEmpty();
    }
}
