package com.example.msiraider.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.msiraider.newproject.FAQ.FaqHomeActivity;
import com.example.msiraider.newproject.Map.MapActivity;
import com.example.msiraider.newproject.Price.PriceActivity;
import com.example.msiraider.newproject.Register.RegisterActivity;

public class HomeActivity extends AppCompatActivity {
    TextView logo;
    ImageButton price,map,register,faq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        logo = (TextView)findViewById( R.id.logo);
        price = (ImageButton) findViewById(R.id.price);
        map = (ImageButton) findViewById(R.id.map);
        register = (ImageButton) findViewById(R.id.register);
        faq =(ImageButton)findViewById(R.id.faq);

        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,PriceActivity.class);
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,FaqHomeActivity.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });



    }
}
