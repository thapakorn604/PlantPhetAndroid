package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchStickyRice;
import com.example.msiraider.newproject.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.msiraider.newproject.Price.DataFetching.fetchStickyRice.stickyriceNew;

/**
 * Created by PC on 5/6/2018.
 */

public class StickyPrice extends AppCompatActivity {
    public static TextView stickyhomeprice, sticky_price3m, sticky_price6m, sticky_price9m,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sticky_price);
        stickyhomeprice = (TextView) findViewById(R.id.homeprice);
        sticky_price3m = (TextView) findViewById(R.id.sticky_price3m);
        sticky_price6m = (TextView) findViewById(R.id.sticky_price6m);
        sticky_price9m = (TextView) findViewById(R.id.sticky_price9m);
        final fetchStickyRice process2 = new fetchStickyRice();
        process2.execute();

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(" อัพเดทเมื่อ : " + formattedDate);

        stickyhomeprice.setText(stickyriceNew);
        sticky_price3m.setText("9348.90");
        sticky_price6m.setText("9311.95");
        sticky_price9m.setText("9292.76");
    }
}
