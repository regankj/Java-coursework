package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Lerwick {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",15.6));
        Max.getData().add(new XYChart.Data<>("2012",14.7));
        Max.getData().add(new XYChart.Data<>("2013",14.1));
        Max.getData().add(new XYChart.Data<>("2014",14.7));
        Max.getData().add(new XYChart.Data<>("2015",14.6));
        Max.getData().add(new XYChart.Data<>("2016",15.6));
        Max.getData().add(new XYChart.Data<>("2017",15));
        Max.getData().add(new XYChart.Data<>("2018",14.5));

        Min.getData().add(new XYChart.Data<>("2011",4.1));
        Min.getData().add(new XYChart.Data<>("2012",-1.2));
        Min.getData().add(new XYChart.Data<>("2013",1.3));
        Min.getData().add(new XYChart.Data<>("2014",1.2));
        Min.getData().add(new XYChart.Data<>("2015",0.4));
        Min.getData().add(new XYChart.Data<>("2016",2.2));
        Min.getData().add(new XYChart.Data<>("2017",-2));
        Min.getData().add(new XYChart.Data<>("2018",0.5));

        Frost.getData().add(new XYChart.Data<>("2011",31));
        Frost.getData().add(new XYChart.Data<>("2012",64));
        Frost.getData().add(new XYChart.Data<>("2013",26));
        Frost.getData().add(new XYChart.Data<>("2014",23));
        Frost.getData().add(new XYChart.Data<>("2015",40));
        Frost.getData().add(new XYChart.Data<>("2016",9));
        Frost.getData().add(new XYChart.Data<>("2017",11));
        Frost.getData().add(new XYChart.Data<>("2018",23));

        Rain.getData().add(new XYChart.Data<>("2011",1283.6));
        Rain.getData().add(new XYChart.Data<>("2012",1084.9));
        Rain.getData().add(new XYChart.Data<>("2013",1246.4));
        Rain.getData().add(new XYChart.Data<>("2014",1237));
        Rain.getData().add(new XYChart.Data<>("2015",1136.3));
        Rain.getData().add(new XYChart.Data<>("2016",1349));
        Rain.getData().add(new XYChart.Data<>("2017",1520.8));
        Rain.getData().add(new XYChart.Data<>("2018",1217.9));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
