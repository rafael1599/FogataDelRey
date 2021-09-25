package com.example.fogatadelrey;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    Animation topAnimation;
    View loeps;
    // Animation
    private static int time =4000;
    //------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        //---
        loeps = findViewById(R.id.logo_first);
        loeps.setAnimation(topAnimation);

        //-- login --//

        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent( MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        },time);

    }
}