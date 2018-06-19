package com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord;

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
import java.util.List;

/**
 * Created by PC on 5/6/2018.
 */

public class twoYearCassava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_year_cassava);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();

        data.add(new ValueDataEntry("4-2559", 1.94));
        data.add(new ValueDataEntry("5-2559", 1.74));
        data.add(new ValueDataEntry("6-2559", 1.43));
        data.add(new ValueDataEntry("7-2559", 1.4));
        data.add(new ValueDataEntry("8-2559", 1.22));
        data.add(new ValueDataEntry("9-2559", 1.1));
        data.add(new ValueDataEntry("10-2559", 1.04));
        data.add(new ValueDataEntry("11-2559", 1.29));
        data.add(new ValueDataEntry("12-2559", 1.45));
        data.add(new ValueDataEntry("1-2560", 1.43));
        data.add(new ValueDataEntry("2-2560", 1.51));
        data.add(new ValueDataEntry("3-2560", 1.42));
        data.add(new ValueDataEntry("4-2560", 1.22));
        data.add(new ValueDataEntry("5-2560", 1.21));
        data.add(new ValueDataEntry("6-2560", 1.17));
        data.add(new ValueDataEntry("7-2560", 1.21));
        data.add(new ValueDataEntry("8-2560", 1.22));
        data.add(new ValueDataEntry("9-2560", 1.34));
        data.add(new ValueDataEntry("10-2560", 1.41));
        data.add(new ValueDataEntry("11-2560", 1.72));
        data.add(new ValueDataEntry("12-2560", 2.07));
        data.add(new ValueDataEntry("1-2561", 1.98));
        data.add(new ValueDataEntry("2-2561", 2.1));
        data.add(new ValueDataEntry("3-2561", 2.36));
        data.add(new ValueDataEntry("4-2561", 2.52));


        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("สถิติราคาของมันสำปะหลังย้อนหลัง2ปี");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}
