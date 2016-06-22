package co.gobd.tracker.service.account;

import co.gobd.tracker.callback.ConnectionCallback;

/**
 * Created by fahadwajed on 6/22/16.
 */
public interface RegistrationCallback extends ConnectionCallback {

    public void onRegistrationSuccess();
    public void onRegistrationFailure();
    
}
