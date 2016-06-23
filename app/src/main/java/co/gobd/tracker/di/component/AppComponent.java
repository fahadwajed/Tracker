package co.gobd.tracker.di.component;

import javax.inject.Singleton;

import co.gobd.tracker.application.GoAssetApplication;
import co.gobd.tracker.di.module.ApiModule;
import co.gobd.tracker.di.module.AppModule;
import co.gobd.tracker.di.module.ServiceModule;
import co.gobd.tracker.ui.activity.LoginActivity;
import co.gobd.tracker.ui.activity.SignUpActivity;
import dagger.Component;

/**
 * Created by fahadwajed on 6/22/16.
 */
@Singleton
@Component(modules = {ApiModule.class, AppModule.class, ServiceModule.class})
public interface AppComponent {

    void inject(GoAssetApplication target);
    void inject(LoginActivity target);
    void inject(SignUpActivity target);
}
