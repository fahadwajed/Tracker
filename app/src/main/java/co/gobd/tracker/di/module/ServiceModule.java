package co.gobd.tracker.di.module;

import javax.inject.Singleton;

import co.gobd.tracker.network.AccountApi;
import co.gobd.tracker.service.account.AccountService;
import co.gobd.tracker.service.account.AccountServiceImpl;
import dagger.Module;
import dagger.Provides;

/**
 * Created by fahadwajed on 6/22/16.
 */
@Module
public class ServiceModule {

    @Provides
    @Singleton
    public AccountService providesAuthenticationService(AccountApi accountApi) {
        return new AccountServiceImpl(accountApi);
    }
}
