package ua.testing;

/**
 * <h1>Registration Form (Regular Expressions)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-11
 */
public class View {
    public static final String COLON = ":";
    public static final String SPACE = " ";
    public static final String INPUT = "Input ";
    public static final String WRONG_INPUT_VALUE = " is entered incorrectly! Repeat please! ";
    public static final String CREATED_SUCCESS = "Notebook entry created successfully.";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
