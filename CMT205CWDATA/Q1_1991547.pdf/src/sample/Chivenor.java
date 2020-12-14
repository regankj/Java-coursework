package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Chivenor {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",20.1));
        Max.getData().add(new XYChart.Data<>("2012",20.3));
        Max.getData().add(new XYChart.Data<>("2013",19.6));
        Max.getData().add(new XYChart.Data<>("2014",20.3));
        Max.getData().add(new XYChart.Data<>("2015",23.4));
        Max.getData().add(new XYChart.Data<>("2016",21.8));
        Max.getData().add(new XYChart.Data<>("2017",19.8));
        Max.getData().add(new XYChart.Data<>("2018",20.9));

        Min.getData().add(new XYChart.Data<>("2011",1.7));
        Min.getData().add(new XYChart.Data<>("2012",-2.5));
        Min.getData().add(new XYChart.Data<>("2013",2.2));
        Min.getData().add(new XYChart.Data<>("2014",2.8));
        Min.getData().add(new XYChart.Data<>("2015",1.7));
        Min.getData().add(new XYChart.Data<>("2016",4.2));
        Min.getData().add(new XYChart.Data<>("2017",2.4));
        Min.getData().add(new XYChart.Data<>("2018",3));

        Frost.getData().add(new XYChart.Data<>("2011",26));
        Frost.getData().add(new XYChart.Data<>("2012",57));
        Frost.getData().add(new XYChart.Data<>("2013",19));
        Frost.getData().add(new XYChart.Data<>("2014",23));
        Frost.getData().add(new XYChart.Data<>("2015",21));
        Frost.getData().add(new XYChart.Data<>("2016",5));
        Frost.getData().add(new XYChart.Data<>("2017",14));
        Frost.getData().add(new XYChart.Data<>("2018",18));

        Rain.getData().add(new XYChart.Data<>("2011",1060.6));
        Rain.getData().add(new XYChart.Data<>("2012",783.8));
        Rain.getData().add(new XYChart.Data<>("2013",860.2));
        Rain.getData().add(new XYChart.Data<>("2014",1270));
        Rain.getData().add(new XYChart.Data<>("2015",909.7));
        Rain.getData().add(new XYChart.Data<>("2016",996));
        Rain.getData().add(new XYChart.Data<>("2017",1006.8));
        Rain.getData().add(new XYChart.Data<>("2018",875.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
