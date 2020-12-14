package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Nairn {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",19.8));
        Max.getData().add(new XYChart.Data<>("2012",18.6));
        Max.getData().add(new XYChart.Data<>("2013",18.1));
        Max.getData().add(new XYChart.Data<>("2014",19.1));
        Max.getData().add(new XYChart.Data<>("2015",21.8));
        Max.getData().add(new XYChart.Data<>("2016",20.9));
        Max.getData().add(new XYChart.Data<>("2017",18.6));
        Max.getData().add(new XYChart.Data<>("2018",18.7));

        Min.getData().add(new XYChart.Data<>("2011",-2.8));
        Min.getData().add(new XYChart.Data<>("2012",-3.7));
        Min.getData().add(new XYChart.Data<>("2013",0.3));
        Min.getData().add(new XYChart.Data<>("2014",0));
        Min.getData().add(new XYChart.Data<>("2015",-1.3));
        Min.getData().add(new XYChart.Data<>("2016",0.8));
        Min.getData().add(new XYChart.Data<>("2017",0.8));
        Min.getData().add(new XYChart.Data<>("2018",-0.4));

        Frost.getData().add(new XYChart.Data<>("2011",57));
        Frost.getData().add(new XYChart.Data<>("2012",74));
        Frost.getData().add(new XYChart.Data<>("2013",39));
        Frost.getData().add(new XYChart.Data<>("2014",56));
        Frost.getData().add(new XYChart.Data<>("2015",75));
        Frost.getData().add(new XYChart.Data<>("2016",39));
        Frost.getData().add(new XYChart.Data<>("2017",40));
        Frost.getData().add(new XYChart.Data<>("2018",55));

        Rain.getData().add(new XYChart.Data<>("2011",776.1));
        Rain.getData().add(new XYChart.Data<>("2012",638.6));
        Rain.getData().add(new XYChart.Data<>("2013",734.1));
        Rain.getData().add(new XYChart.Data<>("2014",617.5));
        Rain.getData().add(new XYChart.Data<>("2015",496.5));
        Rain.getData().add(new XYChart.Data<>("2016",753.2));
        Rain.getData().add(new XYChart.Data<>("2017",744.3));
        Rain.getData().add(new XYChart.Data<>("2018",643.9));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
