package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchRiceData;
import com.example.msiraider.newproject.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.msiraider.newproject.Price.DataFetching.fetchRiceData.riceNew;

/**
 * Created by PC on 5/6/2018.
 */

public class JasmineRice extends AppCompatActivity {
    public static TextView ricehomeprice, jasmine_price3m, jasmine_price6m, jasmine_price9m,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rice_price);
        ricehomeprice = (TextView) findViewById(R.id.homeprice);
        jasmine_price3m = (TextView) findViewById(R.id.rice_price3m);
        jasmine_price6m = (TextView) findViewById(R.id.rice_price6m);
        jasmine_price9m = (TextView) findViewById(R.id.rice_price9m);
        fetchRiceData process1 = new fetchRiceData();
        process1.execute();
        Calendar c = Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(" อัพเดทเมื่อ : " + formattedDate);

        ricehomeprice.setText(riceNew);
        jasmine_price3m.setText("15282.72");
        jasmine_price6m.setText("15390.34");
        jasmine_price9m.setText("15469.76");
    }
}