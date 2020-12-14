package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Manston {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",28.8));
        Max.getData().add(new XYChart.Data<>("2012",23.8));
        Max.getData().add(new XYChart.Data<>("2013",21.3));
        Max.getData().add(new XYChart.Data<>("2014",22.7));
        Max.getData().add(new XYChart.Data<>("2015",22.6));
        Max.getData().add(new XYChart.Data<>("2016",22.4));
        Max.getData().add(new XYChart.Data<>("2017",22.3));
        Max.getData().add(new XYChart.Data<>("2018",23.3));

        Min.getData().add(new XYChart.Data<>("2011",0.3));
        Min.getData().add(new XYChart.Data<>("2012",-1));
        Min.getData().add(new XYChart.Data<>("2013",3.1));
        Min.getData().add(new XYChart.Data<>("2014",0.6));
        Min.getData().add(new XYChart.Data<>("2015",1));
        Min.getData().add(new XYChart.Data<>("2016",3.1));
        Min.getData().add(new XYChart.Data<>("2017",1.9));
        Min.getData().add(new XYChart.Data<>("2018",2.9));

        Frost.getData().add(new XYChart.Data<>("2011",3));
        Frost.getData().add(new XYChart.Data<>("2012",47));
        Frost.getData().add(new XYChart.Data<>("2013",7));
        Frost.getData().add(new XYChart.Data<>("2014",25));
        Frost.getData().add(new XYChart.Data<>("2015",27));
        Frost.getData().add(new XYChart.Data<>("2016",8));
        Frost.getData().add(new XYChart.Data<>("2017",14));
        Frost.getData().add(new XYChart.Data<>("2018",18));

        Rain.getData().add(new XYChart.Data<>("2011",690.5));
        Rain.getData().add(new XYChart.Data<>("2012",695.3));
        Rain.getData().add(new XYChart.Data<>("2013",484.4));
        Rain.getData().add(new XYChart.Data<>("2014",795));
        Rain.getData().add(new XYChart.Data<>("2015",617.6));
        Rain.getData().add(new XYChart.Data<>("2016",758.2));
        Rain.getData().add(new XYChart.Data<>("2017",612.8));
        Rain.getData().add(new XYChart.Data<>("2018",595));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
