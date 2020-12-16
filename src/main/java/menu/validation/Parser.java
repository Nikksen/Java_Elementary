package menu.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public boolean checkPhoneNumber(String phone) {
        Pattern pattern = Pattern.compile("\\+380\\d{9}");
        Matcher matcher = pattern.matcher(phone);
        if (!(matcher.find())) {
            System.out.println("Введите номер телефона в формате +380{9}");
            return false;
        } else
            return true;
    }
}
