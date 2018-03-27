package com.example.ploychanok.plantphetfarmer;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by MSI Raider on 27/3/2561.
 */

public class PriceActivity extends AppCompatActivity {
    ImageButton top, buttonlist1, buttonlist2, buttonlist3;
    TextView homesubtext1, hometext, homeprice, homesubtext2, text, listprice2, listsubtext3, footer;
    TextView listtext1, listsubtext1, listprice1, listtext2, listsubtext2, listtext3, listprice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);
        top = (ImageButton) findViewById(R.id.price);
        homesubtext1 = (TextView) findViewById(R.id.homesubtext1);
        hometext = (TextView) findViewById(R.id.hometext);
        homeprice = (TextView) findViewById(R.id.homeprice);
        homesubtext2 = (TextView) findViewById(R.id.homesubtext2);
        text = (TextView) findViewById(R.id.text);
        buttonlist1 = (ImageButton) findViewById(R.id.buttonlist1);
        listtext1 = (TextView) findViewById(R.id.listtext1);
        listsubtext1 = (TextView) findViewById(R.id.listsubtext1);
        listprice1 = (TextView) findViewById(R.id.listprice1);
        buttonlist2 = (ImageButton) findViewById(R.id.buttonlist2);
        listtext2 = (TextView) findViewById(R.id.listtext2);
        listsubtext2 = (TextView) findViewById(R.id.listsubtext2);
        listprice2 = (TextView) findViewById(R.id.listprice2);
        buttonlist3 = (ImageButton) findViewById(R.id.buttonlist3);
        listtext3 = (TextView) findViewById(R.id.listtext3);
        listsubtext3 = (TextView) findViewById(R.id.listsubtext3);
        listprice3 = (TextView) findViewById(R.id.listprice3);
        footer = (TextView) findViewById(R.id.footer);


    }
}
