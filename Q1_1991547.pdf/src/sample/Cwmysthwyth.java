package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Cwmysthwyth {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",17.8));
        Max.getData().add(new XYChart.Data<>("2012",18.8));
        Max.getData().add(new XYChart.Data<>("2013",10.3));


        Min.getData().add(new XYChart.Data<>("2011",-0.7));
        Min.getData().add(new XYChart.Data<>("2012",-3.7));
        Min.getData().add(new XYChart.Data<>("2013",-0.3));


        Frost.getData().add(new XYChart.Data<>("2011",54));
        Frost.getData().add(new XYChart.Data<>("2012",105));
        Frost.getData().add(new XYChart.Data<>("2013",33));


        Rain.getData().add(new XYChart.Data<>("2011",1784.2));
        Rain.getData().add(new XYChart.Data<>("2012",1333.9));
        Rain.getData().add(new XYChart.Data<>("2013",392.7));


        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
