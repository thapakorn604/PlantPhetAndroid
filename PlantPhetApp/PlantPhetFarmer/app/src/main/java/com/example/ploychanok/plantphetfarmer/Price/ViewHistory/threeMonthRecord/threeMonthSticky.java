package com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
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

public class threeMonthSticky extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_month_sticky);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("2-2561", 9792.0));
        data.add(new ValueDataEntry("3-2561", 9599.0));
        data.add(new ValueDataEntry("4-2561", 9448.0));

        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("สถิติราคาของข้าวเหนียวย้อนหลัง3เดือน");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}
