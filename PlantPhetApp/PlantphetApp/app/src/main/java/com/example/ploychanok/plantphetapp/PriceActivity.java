package com.example.ploychanok.plantphetapp;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PriceActivity extends AppCompatActivity {
    ImageView top,listText,list2,list3;
    TextView homesubtext1,hometext,homeprice,homesubtext2,text,listText1,listSubText1;
    TextView listprice1,listText2,listSubText2,listPrice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);

        top = (ImageView) findViewById(R.id.top);
        homesubtext1 = (TextView) findViewById(R.id.homesubtext1);
        homesubtext2 = (TextView) findViewById(R.id.homesubtext2);
        text = (TextView) findViewById(R.id.text);
        hometext = (TextView) findViewById(R.id.hometext);
        homeprice = (TextView) findViewById(R.id.homeprice);
        listText = (ImageView) findViewById(R.id.list1);
        listText1 =(TextView) findViewById(R.id.listtext1);
        listSubText1 = (TextView) findViewById(R.id.listsubtext1);
        listprice1 = (TextView)findViewById(R.id.listprice1);
        list2 = (ImageView)findViewById(R.id.list2);
        listText2 = (TextView) findViewById(R.id.listtext2);
        listSubText2 = (TextView) findViewById(R.id.listsubtext2);
        listPrice2 = (TextView) findViewById(R.id.listprice2);
        list3 = (ImageView) findViewById(R.id.list3);





    }







}
