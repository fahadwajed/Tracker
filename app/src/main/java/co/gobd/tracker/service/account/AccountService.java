package co.gobd.tracker.service.account;

import co.gobd.tracker.model.register.Register;

/**
 * Created by fahadwajed on 6/22/16.
 */
public interface AccountService {
    void getRegister(Register register, final RegistrationCallback registrationCallback);
    void login(String userName, String password, LoginCallback callback);
    void getProfile(String bearer, ProfileCallback callback);
}
