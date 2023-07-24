package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView anim;
Button btnTran,btnalpa,btnrota,btnscale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anim=findViewById(R.id.txt);

        btnTran=findViewById(R.id.tars);
        btnalpa=findViewById(R.id.alpha);
        btnrota=findViewById(R.id.rot);
        btnscale=findViewById(R.id.scale);
        btnTran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveanimation);
                anim.startAnimation(move);

            }
        });
        btnscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                anim.startAnimation(scale);
            }
        });
        btnrota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
                anim.startAnimation(rotation);
            }
        });
        btnalpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                anim.startAnimation(alpha);
            }
        });


    }
}