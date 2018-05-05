package com.example.msiraider.newproject.Price;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.Chart.Cassava_Price_Chart;
import com.example.msiraider.newproject.Price.Chart.Corn_Price_Chart;
import com.example.msiraider.newproject.Price.Chart.Rice_Price_Chart;
import com.example.msiraider.newproject.Price.Chart.StickyRice_Price_Chart;
import com.example.msiraider.newproject.Price.DataFetching.fetchCassavaData;
import com.example.msiraider.newproject.Price.DataFetching.fetchCornData;
import com.example.msiraider.newproject.Price.DataFetching.fetchRiceData;
import com.example.msiraider.newproject.Price.DataFetching.fetchStickyRice;
import com.example.msiraider.newproject.R;

import java.util.Calendar;

/**
 * Created by MSI Raider on 27/3/2561.
 */

public class PriceActivity extends AppCompatActivity {
    ImageButton top, buttonlist1, buttonlist2, buttonlist3;
    public static TextView homesubtext1, hometext, homeprice, homesubtext2, text, listprice2, listsubtext3, footer;
    public static TextView listtext1, listsubtext1, listprice1, listtext2, listsubtext2, listtext3, listprice3;


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
//        listtext1 = (TextView) findViewById(R.id.listtext1);
//        listsubtext1 = (TextView) findViewById(R.id.listsubtext1);
//        listprice1 = (TextView) findViewById(R.id.listprice1);
//        buttonlist2 = (ImageButton) findViewById(R.id.buttonlist2);
//        listtext2 = (TextView) findViewById(R.id.listtext2);
//        listsubtext2 = (TextView) findViewById(R.id.listsubtext2);
//        listprice2 = (TextView) findViewById(R.id.listprice2);
//        buttonlist3 = (ImageButton) findViewById(R.id.buttonlist3);
//        listtext3 = (TextView) findViewById(R.id.listtext3);
//        listsubtext3 = (TextView) findViewById(R.id.listsubtext3);
//        listprice3 = (TextView) findViewById(R.id.listprice3);
        footer = (TextView) findViewById(R.id.footer);
//        --------------------------Retrieve Data--------------------
        final fetchCassavaData process = new fetchCassavaData();
        process.execute();
        fetchRiceData process1 = new fetchRiceData();
        process1.execute();
        final fetchStickyRice process2 = new fetchStickyRice();
        process2.execute();
        fetchCornData process3 = new fetchCornData();
        process3.execute();
//        -----------------------------Get Currenttime-----------------
        String currentTime = String.valueOf(Calendar.getInstance().getTime());
        currentTime = currentTime.toString();
        text.setText(currentTime);
        buttonlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PriceActivity.this, Corn_Price_Chart.class);
                startActivity(intent);


            }
        });
        homeprice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PriceActivity.this, Cassava_Price_Chart.class);
                startActivity(intent);
            }
        });
        buttonlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PriceActivity.this, StickyRice_Price_Chart.class);
                startActivity(intent);
            }
        });
        buttonlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PriceActivity.this, Rice_Price_Chart.class);
                startActivity(intent);
            }
        });
    }
}
