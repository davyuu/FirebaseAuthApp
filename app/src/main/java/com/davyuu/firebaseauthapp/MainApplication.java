package com.davyuu.firebaseauthapp;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;


public class MainApplication extends Application {

    public static void logout() {
        FirebaseAuth.getInstance().signOut();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
