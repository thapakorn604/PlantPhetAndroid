package com.example.msiraider.newproject.Price.Chart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesColumn;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Position;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.anychart.ValueDataEntry;
import com.example.msiraider.newproject.R;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Corn_Price_Chart extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corn_price_graph);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("ม.ค.", 80540));
        data.add(new ValueDataEntry("ก.พ.", 94190));
        data.add(new ValueDataEntry("มี.ค.", 102610));
        data.add(new ValueDataEntry("เม.ย.", 110430));
        data.add(new ValueDataEntry("พ.ค.", 128000));
        data.add(new ValueDataEntry("มิ.ย.", 143760));
        data.add(new ValueDataEntry("ก.ค.", 170670));
        data.add(new ValueDataEntry("ส.ค.", 213210));
        data.add(new ValueDataEntry("ก.ย.", 249980));
        data.add(new ValueDataEntry("ต.ค.", 249980));
        data.add(new ValueDataEntry("พ.ย.", 249980));
        data.add(new ValueDataEntry("ธ.ค.", 249980));


        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.setAnimation(true);
        cartesian.setTitle("ราคาข้าวโพด");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("${%Value}{groupsSeparator: }");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}