package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Hurn {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",21.2));
        Max.getData().add(new XYChart.Data<>("2012",22.8));
        Max.getData().add(new XYChart.Data<>("2013",20.6));
        Max.getData().add(new XYChart.Data<>("2014",21.2));
        Max.getData().add(new XYChart.Data<>("2015",25.4));
        Max.getData().add(new XYChart.Data<>("2016",24.5));
        Max.getData().add(new XYChart.Data<>("2017",21.5));
        Max.getData().add(new XYChart.Data<>("2018",23.1));

        Min.getData().add(new XYChart.Data<>("2011",-0.3));
        Min.getData().add(new XYChart.Data<>("2012",-3.4));
        Min.getData().add(new XYChart.Data<>("2013",1.8));
        Min.getData().add(new XYChart.Data<>("2014",0.4));
        Min.getData().add(new XYChart.Data<>("2015",0.2));
        Min.getData().add(new XYChart.Data<>("2016",1.3));
        Min.getData().add(new XYChart.Data<>("2017",-0.2));
        Min.getData().add(new XYChart.Data<>("2018",1.4));

        Frost.getData().add(new XYChart.Data<>("2011",67));
        Frost.getData().add(new XYChart.Data<>("2012",93));
        Frost.getData().add(new XYChart.Data<>("2013",36));
        Frost.getData().add(new XYChart.Data<>("2014",65));
        Frost.getData().add(new XYChart.Data<>("2015",65));
        Frost.getData().add(new XYChart.Data<>("2016",36));
        Frost.getData().add(new XYChart.Data<>("2017",45));
        Frost.getData().add(new XYChart.Data<>("2018",58));

        Rain.getData().add(new XYChart.Data<>("2011",900.4));
        Rain.getData().add(new XYChart.Data<>("2012",707.2));
        Rain.getData().add(new XYChart.Data<>("2013",730.4));
        Rain.getData().add(new XYChart.Data<>("2014",1128.6));
        Rain.getData().add(new XYChart.Data<>("2015",913.8));
        Rain.getData().add(new XYChart.Data<>("2016",1217.2));
        Rain.getData().add(new XYChart.Data<>("2017",813.6));
        Rain.getData().add(new XYChart.Data<>("2018",892.4));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}

