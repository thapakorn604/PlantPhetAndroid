package com.example.msiraider.newproject.Price.Prediction.Price;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchCornData;
import com.example.msiraider.newproject.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.msiraider.newproject.Price.DataFetching.fetchCornData.cornNew;

/**
 * Created by PC on 5/6/2018.
 */

public class CornPrice extends AppCompatActivity {
    public static TextView cornhomeprice,corn_price3m,corn_price6m,corn_price9m,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corn_price);
        cornhomeprice = (TextView) findViewById(R.id.homeprice);
        corn_price3m = (TextView) findViewById(R.id.corn_price3m);
        corn_price6m = (TextView) findViewById(R.id.corn_price6m);
        corn_price9m = (TextView) findViewById(R.id.corn_price9m);
        fetchCornData process3 = new fetchCornData();
        process3.execute();


        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(" อัพเดทเมื่อ : " + formattedDate);


        cornhomeprice.setText(cornNew);
        corn_price3m.setText("7.04");
        corn_price6m.setText("7.30");
        corn_price9m.setText("7.27");

    }
}
