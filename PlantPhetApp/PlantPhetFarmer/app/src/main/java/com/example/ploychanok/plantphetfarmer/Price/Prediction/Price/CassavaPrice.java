package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchCassavaData;
import com.example.msiraider.newproject.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.msiraider.newproject.Price.DataFetching.fetchCassavaData.cassavaNew;


/**
 * Created by PC on 5/6/2018.
 */

public class CassavaPrice extends AppCompatActivity {
    public static TextView cassavahomeprice, cassava_price3m, cassava_price6m, cassava_price9m, text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cassava_price);
        cassavahomeprice = (TextView) findViewById(R.id.homeprice);
        cassava_price3m = (TextView) findViewById(R.id.cassava_price3m);
        cassava_price6m = (TextView) findViewById(R.id.cassava_price6m);
        cassava_price9m = (TextView) findViewById(R.id.cassava_price9m);
        text = (TextView) findViewById(R.id.text);
        fetchCassavaData process = new fetchCassavaData();
        process.execute();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(" อัพเดทเมื่อ : " + formattedDate);

        cassavahomeprice.setText(cassavaNew);
        cassava_price3m.setText("2.07");
        cassava_price6m.setText("2.17");
        cassava_price9m.setText("2.15");

    }
}