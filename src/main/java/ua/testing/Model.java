package ua.testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h1>Registration Form (Regular Expressions)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-11
 */
public class Model {
    private String surname;
    private String nickname;

    public void setNotebookEntry(String surname, String nickname) {
        this.surname = surname;
        this.nickname = nickname;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public static boolean checkValieWithRegExp(String Value, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(Value);
        return m.matches();
    }
}
