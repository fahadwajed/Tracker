package co.gobd.tracker.di.component;

import javax.inject.Singleton;

import co.gobd.tracker.di.module.ApiModule;
import co.gobd.tracker.di.module.AppModule;
import co.gobd.tracker.di.module.ServiceModule;
import dagger.Component;

/**
 * Created by fahadwajed on 6/22/16.
 */
@Singleton
@Component(modules = {ApiModule.class, AppModule.class, ServiceModule.class})
public interface AppComponent {

    void inject()
}
