package com.gzeinnumer.androidloggingwithtimber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //implementation 'com.jakewharton.timber:timber:4.6.1'
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }

        Timber.e("Error Message");
        Timber.d("Debug Message");

        Timber.tag("Some Different tag").e("And error message");
    }
}
