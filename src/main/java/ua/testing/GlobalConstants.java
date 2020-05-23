package ua.testing;

/**
 * <h1>Registration Form (Regular Expressions)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-11
 */
public interface GlobalConstants {
    String SURNAME_REGEX = "^[A-Za-z-]{2,30}$";
    String NICKNAME_REGEX = "^[A-Za-z0-9_]{4,12}$";
}
