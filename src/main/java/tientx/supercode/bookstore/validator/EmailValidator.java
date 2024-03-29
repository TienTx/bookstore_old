/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author zOzDarKzOz
 */
@Component("emailValidator")
public class EmailValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+"
            + "(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+"
            + "(\\.[A-Za-z0-9]+)*"
            + "(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean valid(final String email) {

        matcher = pattern.matcher(email);
        return matcher.matches();

    }
}
