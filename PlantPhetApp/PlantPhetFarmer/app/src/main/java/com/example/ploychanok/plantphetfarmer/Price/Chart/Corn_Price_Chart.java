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

public class Corn_Price_Chart extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_activity);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Rouge", 80540));
        data.add(new ValueDataEntry("Foundation", 94190));
        data.add(new ValueDataEntry("Mascara", 102610));
        data.add(new ValueDataEntry("Lip gloss", 110430));
        data.add(new ValueDataEntry("Lipstick", 128000));
        data.add(new ValueDataEntry("Nail polish", 143760));
        data.add(new ValueDataEntry("Eyebrow pencil", 170670));
        data.add(new ValueDataEntry("Eyeliner", 213210));
        data.add(new ValueDataEntry("Eyeshadows", 249980));


        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("${%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("Corn_Price_Chart");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("${%Value}{groupsSeparator: }");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("Price");
        cartesian.getYAxis().setTitle("Month");

        anyChartView.setChart(cartesian);
    }
}