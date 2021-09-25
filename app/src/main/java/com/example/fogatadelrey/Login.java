package com.example.fogatadelrey;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.LoginStatusCallback;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;


public class Login extends AppCompatActivity {

    private CallbackManager callbackManager;
    private LoginButton loginButton;

    private static final String EMAIL = "email";



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        loginButton = (LoginButton) findViewById(R.id.login_button);


        loginButton = findViewById(R.id.login_button);

        callbackManager = CallbackManager.Factory.create();

        loginButton.setPermissions(Arrays.asList(EMAIL));

        AccessToken accessToken = AccessToken.getCurrentAccessToken();

        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {

            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d("mostrar", "Se inició sesion!!");
            }

            @Override
            public void onCancel() {
                Log.d("mostrar", "Se canceló sesion");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d("mostrar", "Ocurrió un error :C");
            }
        });

        LoginManager.getInstance().retrieveLoginStatus(this, new LoginStatusCallback() {
            @Override
            public void onCompleted(AccessToken accessToken) {
                // User was previously logged in, can log them in directly here.
                // If this callback is called, a popup notification appears that says
                // "Logged in as <User Name>"
            }
            @Override
            public void onFailure() {
                // No access token could be retrieved for the user
            }
            @Override
            public void onError(Exception exception) {
                // An error occurred
            }
        });

    }


    public void ir(View view) {

        Intent intent = new Intent(Login.this, Menu.class);
        startActivity(intent);
    }
}