package co.gobd.tracker.service.account;

/**
 * Created by fahadwajed on 6/22/16.
 */
public interface AccountService {
    void register(String userName, String password, String confirmPassword, String email,
                       String phoneNumber, final RegistrationCallback registrationCallback);
    void login(String userName, String password, LoginCallback callback);
    void getProfile(String bearer, ProfileCallback callback);
}
