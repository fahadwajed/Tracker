package co.gobd.tracker.ui.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import co.gobd.tracker.R;
import co.gobd.tracker.application.GoAssetApplication;

public class LoginActivity extends AppCompatActivity {

    @Inject
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((GoAssetApplication) getApplication()).getComponent().inject(this);
    }
}
