package co.gobd.tracker.application;

import android.app.Application;

import co.gobd.tracker.di.component.AppComponent;
import co.gobd.tracker.di.component.DaggerAppComponent;


/**
 * Created by fahadwajed on 6/22/16.
 */
public class GoAssetApplication extends Application {

    private AppComponent component;

    @Override
    public void onCreate(){
        super.onCreate();
        component = DaggerAppComponent.builder().build();
    }

    public AppComponent getComponent(){
        return component;
    }
}
