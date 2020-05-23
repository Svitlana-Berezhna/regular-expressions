package ua.testing;

/**
 * <h1>Registration Form (Regular Expressions)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-11
 */
public class Controller {
    private Model model;
    private View view;

    private String surname;
    private String nickname;

    public static final String SURNAME = "SURNAME";
    public static final String NICKNAME = "NICKNAME";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            surname = inputValueWithScanner(sc, SURNAME);
            if (model.checkValieWithRegExp(surname, GlobalConstants.SURNAME_REGEX)) {
                break;
            } else {
                view.printMessage(SURNAME + View.WRONG_INPUT_VALUE);
            }
        }
        while (true) {
            nickname = inputValueWithScanner(sc, NICKNAME);
            if (model.checkValieWithRegExp(nickname, GlobalConstants.NICKNAME_REGEX)) {
                break;
            } else {
                view.printMessage(NICKNAME + View.WRONG_INPUT_VALUE);
            }
        }
        model.setNotebookEntry(surname, nickname);
        view.printMessage(View.CREATED_SUCCESS);
        view.printMessage(SURNAME + View.COLON + view.SPACE + model.getSurname());
        view.printMessage(NICKNAME + View.COLON + view.SPACE + model.getNickname());
    }

    private String inputValueWithScanner(Scanner sc, String value) {
        view.printMessage(View.INPUT + value + View.COLON + View.SPACE);
        while (!sc.hasNext()) {
            view.printMessage(value + View.WRONG_INPUT_VALUE);
            view.printMessage(View.INPUT + value);
            sc.next();
        }
        return sc.next();
    }
}
