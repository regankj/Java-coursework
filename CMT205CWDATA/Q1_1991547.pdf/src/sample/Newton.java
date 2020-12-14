package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Newton {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",18.9));
        Max.getData().add(new XYChart.Data<>("2012",19.1));
        Max.getData().add(new XYChart.Data<>("2013",19));
        Max.getData().add(new XYChart.Data<>("2014",18.8));
        Max.getData().add(new XYChart.Data<>("2015",22.5));
        Max.getData().add(new XYChart.Data<>("2016",21.4));
        Max.getData().add(new XYChart.Data<>("2017",18.3));
        Max.getData().add(new XYChart.Data<>("2018",18.7));

        Min.getData().add(new XYChart.Data<>("2011",-1.6));
        Min.getData().add(new XYChart.Data<>("2012",-7));
        Min.getData().add(new XYChart.Data<>("2013",-0.3));
        Min.getData().add(new XYChart.Data<>("2014",0.6));
        Min.getData().add(new XYChart.Data<>("2015",-1.8));
        Min.getData().add(new XYChart.Data<>("2016",1.1));
        Min.getData().add(new XYChart.Data<>("2017",0.1));
        Min.getData().add(new XYChart.Data<>("2018",-0.2));

        Frost.getData().add(new XYChart.Data<>("2011",61));
        Frost.getData().add(new XYChart.Data<>("2012",105));
        Frost.getData().add(new XYChart.Data<>("2013",43));
        Frost.getData().add(new XYChart.Data<>("2014",62));
        Frost.getData().add(new XYChart.Data<>("2015",86));
        Frost.getData().add(new XYChart.Data<>("2016",34));
        Frost.getData().add(new XYChart.Data<>("2017",50));
        Frost.getData().add(new XYChart.Data<>("2018",66));

        Rain.getData().add(new XYChart.Data<>("2011",1048.8));
        Rain.getData().add(new XYChart.Data<>("2012",688.3));
        Rain.getData().add(new XYChart.Data<>("2013",1007.8));
        Rain.getData().add(new XYChart.Data<>("2014",1099.6));
        Rain.getData().add(new XYChart.Data<>("2015",882.9));
        Rain.getData().add(new XYChart.Data<>("2016",1079));
        Rain.getData().add(new XYChart.Data<>("2017",1222.2));
        Rain.getData().add(new XYChart.Data<>("2018",961.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
