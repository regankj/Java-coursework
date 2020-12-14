package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Stornoway {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",17.2));
        Max.getData().add(new XYChart.Data<>("2012",16.1));
        Max.getData().add(new XYChart.Data<>("2013",16));
        Max.getData().add(new XYChart.Data<>("2014",16.7));
        Max.getData().add(new XYChart.Data<>("2015",18.1));
        Max.getData().add(new XYChart.Data<>("2016",18.2));
        Max.getData().add(new XYChart.Data<>("2017",15.8));
        Max.getData().add(new XYChart.Data<>("2018",16.6));

        Min.getData().add(new XYChart.Data<>("2011",1.9));
        Min.getData().add(new XYChart.Data<>("2012",-0.7));
        Min.getData().add(new XYChart.Data<>("2013",1.8));
        Min.getData().add(new XYChart.Data<>("2014",1.8));
        Min.getData().add(new XYChart.Data<>("2015",1.5));
        Min.getData().add(new XYChart.Data<>("2016",2.2));
        Min.getData().add(new XYChart.Data<>("2017",1.8));
        Min.getData().add(new XYChart.Data<>("2018",1));

        Frost.getData().add(new XYChart.Data<>("2011",20));
        Frost.getData().add(new XYChart.Data<>("2012",51));
        Frost.getData().add(new XYChart.Data<>("2013",24));
        Frost.getData().add(new XYChart.Data<>("2014",21));
        Frost.getData().add(new XYChart.Data<>("2015",32));
        Frost.getData().add(new XYChart.Data<>("2016",5));
        Frost.getData().add(new XYChart.Data<>("2017",16));
        Frost.getData().add(new XYChart.Data<>("2018",23));

        Rain.getData().add(new XYChart.Data<>("2011",1358));
        Rain.getData().add(new XYChart.Data<>("2012",923.6));
        Rain.getData().add(new XYChart.Data<>("2013",1289.6));
        Rain.getData().add(new XYChart.Data<>("2014",1103.8));
        Rain.getData().add(new XYChart.Data<>("2015",1188.7));
        Rain.getData().add(new XYChart.Data<>("2016",1302));
        Rain.getData().add(new XYChart.Data<>("2017",1498));
        Rain.getData().add(new XYChart.Data<>("2018",1199.8));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
