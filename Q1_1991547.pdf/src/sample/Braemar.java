package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Braemar {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",17.8));
        Max.getData().add(new XYChart.Data<>("2012",17.3));
        Max.getData().add(new XYChart.Data<>("2013",16.9));
        Max.getData().add(new XYChart.Data<>("2014",17.6));
        Max.getData().add(new XYChart.Data<>("2015",21.9));
        Max.getData().add(new XYChart.Data<>("2016",20.1));
        Max.getData().add(new XYChart.Data<>("2017",16.8));
        Max.getData().add(new XYChart.Data<>("2018",17.7));

        Min.getData().add(new XYChart.Data<>("2011",-6.5));
        Min.getData().add(new XYChart.Data<>("2012",-8.1));
        Min.getData().add(new XYChart.Data<>("2013",-2.3));
        Min.getData().add(new XYChart.Data<>("2014",-2.1 ));
        Min.getData().add(new XYChart.Data<>("2015",-4.1));
        Min.getData().add(new XYChart.Data<>("2016",-1.7));
        Min.getData().add(new XYChart.Data<>("2017",-1.4));
        Min.getData().add(new XYChart.Data<>("2018",-2.8));

        Frost.getData().add(new XYChart.Data<>("2011",105));
        Frost.getData().add(new XYChart.Data<>("2012",142));
        Frost.getData().add(new XYChart.Data<>("2013",96));
        Frost.getData().add(new XYChart.Data<>("2014",108));
        Frost.getData().add(new XYChart.Data<>("2015",137));
        Frost.getData().add(new XYChart.Data<>("2016",81));
        Frost.getData().add(new XYChart.Data<>("2017",99));
        Frost.getData().add(new XYChart.Data<>("2018",108));

        Rain.getData().add(new XYChart.Data<>("2011",928.6));
        Rain.getData().add(new XYChart.Data<>("2012",824));
        Rain.getData().add(new XYChart.Data<>("2013",1073.4));
        Rain.getData().add(new XYChart.Data<>("2014",812.1));
        Rain.getData().add(new XYChart.Data<>("2015",854.8));
        Rain.getData().add(new XYChart.Data<>("2016",1250.2));
        Rain.getData().add(new XYChart.Data<>("2017",1076.6));
        Rain.getData().add(new XYChart.Data<>("2018",956.7));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
