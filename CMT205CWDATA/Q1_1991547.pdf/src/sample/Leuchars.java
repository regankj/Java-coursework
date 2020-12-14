package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Leuchars {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",19.5));
        Max.getData().add(new XYChart.Data<>("2012",19.6));
        Max.getData().add(new XYChart.Data<>("2013",18));
        Max.getData().add(new XYChart.Data<>("2014",18.6));
        Max.getData().add(new XYChart.Data<>("2015",21.4));
        Max.getData().add(new XYChart.Data<>("2016",20.9));
        Max.getData().add(new XYChart.Data<>("2017",19.1));
        Max.getData().add(new XYChart.Data<>("2018",19.6));

        Min.getData().add(new XYChart.Data<>("2011",-2.5));
        Min.getData().add(new XYChart.Data<>("2012",-4.1));
        Min.getData().add(new XYChart.Data<>("2013",-0.4));
        Min.getData().add(new XYChart.Data<>("2014",0.4));
        Min.getData().add(new XYChart.Data<>("2015",-0.6));
        Min.getData().add(new XYChart.Data<>("2016",0.2));
        Min.getData().add(new XYChart.Data<>("2017",0.3));
        Min.getData().add(new XYChart.Data<>("2018",-0.3));

        Frost.getData().add(new XYChart.Data<>("2011",60));
        Frost.getData().add(new XYChart.Data<>("2012",83));
        Frost.getData().add(new XYChart.Data<>("2013",42));
        Frost.getData().add(new XYChart.Data<>("2014",62));
        Frost.getData().add(new XYChart.Data<>("2015",61));
        Frost.getData().add(new XYChart.Data<>("2016",38));
        Frost.getData().add(new XYChart.Data<>("2017",46));
        Frost.getData().add(new XYChart.Data<>("2018",61));

        Rain.getData().add(new XYChart.Data<>("2011",791.3));
        Rain.getData().add(new XYChart.Data<>("2012",744.9));
        Rain.getData().add(new XYChart.Data<>("2013",853.8));
        Rain.getData().add(new XYChart.Data<>("2014",896));
        Rain.getData().add(new XYChart.Data<>("2015",629.2));
        Rain.getData().add(new XYChart.Data<>("2016",810.5));
        Rain.getData().add(new XYChart.Data<>("2017",726.5));
        Rain.getData().add(new XYChart.Data<>("2018",668));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
