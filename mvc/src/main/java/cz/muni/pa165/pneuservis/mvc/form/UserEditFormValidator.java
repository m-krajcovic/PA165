package cz.muni.pa165.pneuservis.mvc.form;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Michal Krajcovic <mkrajcovic@mail.muni.cz>
 */
public class UserEditFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
