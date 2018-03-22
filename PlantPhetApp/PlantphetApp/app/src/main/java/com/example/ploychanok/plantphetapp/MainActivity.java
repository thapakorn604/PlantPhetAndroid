package com.example.ploychanok.plantphetapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton priceIcon;
    ImageButton profileIcon;
    ImageButton mapIcon;
    ImageButton faqIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceIcon = (ImageButton) findViewById(R.id.priceicon);
        profileIcon =(ImageButton) findViewById(R.id.profileicon);
        mapIcon = (ImageButton) findViewById(R.id.mapicon);
        faqIcon = (ImageButton) findViewById(R.id.faqicon);

        priceIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PriceActivity.class);
                startActivity(intent);

            }

        });
        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mapIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        faqIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }


}
