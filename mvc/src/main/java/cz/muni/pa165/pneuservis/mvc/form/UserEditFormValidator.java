package cz.muni.pa165.pneuservis.mvc.form;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Michal Krajcovic <mkrajcovic@mail.muni.cz>
 */
public class UserEditFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return UserEditForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserEditForm form = (UserEditForm) o;

        String password = form.getPassword();
        if (password != null && !password.isEmpty() && (password.length() < 6 || password.length() > 50)) {
            errors.rejectValue("password", "size", "Password size must be between 6 and 50");
        }
    }
}
