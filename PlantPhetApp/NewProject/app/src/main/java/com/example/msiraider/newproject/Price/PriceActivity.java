package com.example.msiraider.newproject.Price;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
//    public static ImageButton top, buttonlist1, buttonlist2, buttonlist3;
//    public static TextView rice,cassava,corn,sticky;
    public static Button top,buttonlist1,buttonlist2,buttonlist3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);
         top = (Button) findViewById(R.id.top);
         buttonlist1 = (Button) findViewById(R.id.buttonlist1);
         buttonlist2 = (Button) findViewById(R.id.buttonlist2);
         buttonlist3 = (Button) findViewById(R.id.buttonlist3);

//        --------------------------Retrieve Data--------------------
//        final fetchCassavaData process = new fetchCassavaData();
//        process.execute();
//        fetchRiceData process1 = new fetchRiceData();
//        process1.execute();
//        final fetchStickyRice process2 = new fetchStickyRice();
//        process2.execute();
//        fetchCornData process3 = new fetchCornData();
//        process3.execute();
//        -----------------------------Get Currenttime-----------------

        buttonlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PriceActivity.this, Corn_Price_Chart.class);
                startActivity(intent);


            }
        });
        top.setOnClickListener(new View.OnClickListener() {
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
