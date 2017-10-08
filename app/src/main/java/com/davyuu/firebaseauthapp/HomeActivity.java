package com.davyuu.firebaseauthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private View.OnClickListener signOutButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainApplication.logout();
            LoginActivity.startActivity(HomeActivity.this);
        }
    };

    public static void startActivity(Activity activity) {
        Context context = activity.getApplicationContext();
        Intent intent = new Intent(context, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        activity.finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button signOutButton = (Button) findViewById(R.id.sign_out_button);
        signOutButton.setOnClickListener(signOutButtonClickListener);
    }
}
