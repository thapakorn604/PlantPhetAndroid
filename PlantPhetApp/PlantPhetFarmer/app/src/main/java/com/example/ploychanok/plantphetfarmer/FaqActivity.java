package com.example.ploychanok.plantphetfarmer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MSI Raider on 27/3/2561.
 */

public class FaqActivity extends AppCompatActivity {
    TextView logo,footer;
    Button manual;
    Button faq;
    Button about,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);

        logo = (TextView) findViewById(R.id.logo);
        manual = (Button) findViewById(R.id.manual);
        faq = (Button) findViewById(R.id.faq);
        about = (Button) findViewById(R.id.about);
        contact = (Button) findViewById(R.id.contact);
        footer = (TextView) findViewById(R.id.footer);


    }

}
