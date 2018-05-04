package com.example.ploychanok.plantphetfarmer.Price.Chart;

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
import com.example.ploychanok.plantphetfarmer.R;

import java.util.ArrayList;
import java.util.List;

public class Cassava_Price_Chart extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_activity);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian cartesian = AnyChart.column();


        List<DataEntry> data = new ArrayList<>();

        data.add(new ValueDataEntry("มกราคม", 8000));
        data.add(new ValueDataEntry("กุมภาพันธ์", 9000));
        data.add(new ValueDataEntry("มีนาคม", 10000));
        data.add(new ValueDataEntry("เมษายน", 9500));
        data.add(new ValueDataEntry("พฤษภาคม", 12800));
        data.add(new ValueDataEntry("มิถุนายน", 14376));
        data.add(new ValueDataEntry("กรกฎาคม", 10067));
        data.add(new ValueDataEntry("สิงหาคม", 13500));
        data.add(new ValueDataEntry("กันยายน", 85000));

        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("${%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("มันสำปะหลัง");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("${%Value}{groupsSeparator: }");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}