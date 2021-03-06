package co.gobd.tracker.ui.view;

/**
 * Created by fahadwajed on 6/23/16.
 */
public interface SignUpView {

    String getUserName();

    void showUserNameEmptyError();

    String getPassword();

    void showPasswordEmptyError();

    void showPasswordLengthError();

    String getConfirmPassword();

    void showPasswordMatchError();

    String getEmail();

    void showInvalidEmailPatterError();

    boolean isEmailPatternValid();

    String getPhoneNumber();

    void stopProgress();

    void startLoginActivity();

    void startProgress();

    void showRegistrationError();

    void showConnectionError();

    boolean isPhoneNumberValid();

    void showInvalidPhoneNumberError();

    void showUserNameHasSpaceError();

}
