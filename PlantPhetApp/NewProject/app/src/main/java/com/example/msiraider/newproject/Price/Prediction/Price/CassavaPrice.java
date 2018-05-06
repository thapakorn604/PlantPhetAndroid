package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchCassavaData;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class CassavaPrice extends AppCompatActivity {
    public static TextView cassavahomeprice,cassava_price3m,cassava_price6m,cassava_price9m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cassava_price);
        cassavahomeprice = (TextView) findViewById(R.id.homeprice);
        cassava_price3m = (TextView) findViewById(R.id.cassava_price3m);
        cassava_price6m = (TextView) findViewById(R.id.cassava_price6m);
        cassava_price9m = (TextView) findViewById(R.id.cassava_price9m);
        fetchCassavaData process = new fetchCassavaData();
        process.execute();

}
}