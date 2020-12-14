package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class RossOW {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",21.1));
        Max.getData().add(new XYChart.Data<>("2012",22.1));
        Max.getData().add(new XYChart.Data<>("2013",21));
        Max.getData().add(new XYChart.Data<>("2014",20.9));
        Max.getData().add(new XYChart.Data<>("2015",25.5));
        Max.getData().add(new XYChart.Data<>("2016",23.9));
        Max.getData().add(new XYChart.Data<>("2017",21.2));
        Max.getData().add(new XYChart.Data<>("2018",22.3));

        Min.getData().add(new XYChart.Data<>("2011",0.1));
        Min.getData().add(new XYChart.Data<>("2012",-4.3));
        Min.getData().add(new XYChart.Data<>("2013",1.3));
        Min.getData().add(new XYChart.Data<>("2014",1));
        Min.getData().add(new XYChart.Data<>("2015",-0.3));
        Min.getData().add(new XYChart.Data<>("2016",2));
        Min.getData().add(new XYChart.Data<>("2017",1.2));
        Min.getData().add(new XYChart.Data<>("2018",1.9));

        Frost.getData().add(new XYChart.Data<>("2011",48));
        Frost.getData().add(new XYChart.Data<>("2012",78));
        Frost.getData().add(new XYChart.Data<>("2013",25));
        Frost.getData().add(new XYChart.Data<>("2014",44));
        Frost.getData().add(new XYChart.Data<>("2015",55));
        Frost.getData().add(new XYChart.Data<>("2016",23));
        Frost.getData().add(new XYChart.Data<>("2017",27));
        Frost.getData().add(new XYChart.Data<>("2018",42));

        Rain.getData().add(new XYChart.Data<>("2011",809.4));
        Rain.getData().add(new XYChart.Data<>("2012",588.1));
        Rain.getData().add(new XYChart.Data<>("2013",521.8));
        Rain.getData().add(new XYChart.Data<>("2014",1128.5));
        Rain.getData().add(new XYChart.Data<>("2015",770.8));
        Rain.getData().add(new XYChart.Data<>("2016",988.3));
        Rain.getData().add(new XYChart.Data<>("2017",652.2));
        Rain.getData().add(new XYChart.Data<>("2018",732.8));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
