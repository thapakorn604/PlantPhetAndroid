package com.example.ploychanok.plantphetfarmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ploychanok.plantphetfarmer.FAQ.FaqActivity;
import com.example.ploychanok.plantphetfarmer.Map.MapActivity;
import com.example.ploychanok.plantphetfarmer.Price.PriceActivity;

public class MainActivity extends AppCompatActivity {
    TextView logo;
    ImageButton price,map,profile,faq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = (TextView)findViewById( R.id.logo);
        price = (ImageButton) findViewById(R.id.price);
        map = (ImageButton) findViewById(R.id.map);
        profile = (ImageButton) findViewById(R.id.profile);
        faq =(ImageButton)findViewById(R.id.faq);

        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PriceActivity.class);
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FaqActivity.class);
                startActivity(intent);
            }
        });




    }
}
