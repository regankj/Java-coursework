package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Heathrow {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",23.9));
        Max.getData().add(new XYChart.Data<>("2012",25));
        Max.getData().add(new XYChart.Data<>("2013",21.8));
        Max.getData().add(new XYChart.Data<>("2014",23.5));
        Max.getData().add(new XYChart.Data<>("2015",27));
        Max.getData().add(new XYChart.Data<>("2016",25.8));
        Max.getData().add(new XYChart.Data<>("2017",23.7));
        Max.getData().add(new XYChart.Data<>("2018",24.7));

        Min.getData().add(new XYChart.Data<>("2011",0.3));
        Min.getData().add(new XYChart.Data<>("2012",-1.5));
        Min.getData().add(new XYChart.Data<>("2013",2.8));
        Min.getData().add(new XYChart.Data<>("2014",1.3));
        Min.getData().add(new XYChart.Data<>("2015",1.2));
        Min.getData().add(new XYChart.Data<>("2016",3));
        Min.getData().add(new XYChart.Data<>("2017",1.6));
        Min.getData().add(new XYChart.Data<>("2018",2.9));

        Frost.getData().add(new XYChart.Data<>("2011",37));
        Frost.getData().add(new XYChart.Data<>("2012",56));
        Frost.getData().add(new XYChart.Data<>("2013",17));
        Frost.getData().add(new XYChart.Data<>("2014",31));
        Frost.getData().add(new XYChart.Data<>("2015",35));
        Frost.getData().add(new XYChart.Data<>("2016",10));
        Frost.getData().add(new XYChart.Data<>("2017",21));
        Frost.getData().add(new XYChart.Data<>("2018",23));

        Rain.getData().add(new XYChart.Data<>("2011",682.8));
        Rain.getData().add(new XYChart.Data<>("2012",521.4));
        Rain.getData().add(new XYChart.Data<>("2013",509.2));
        Rain.getData().add(new XYChart.Data<>("2014",707.4));
        Rain.getData().add(new XYChart.Data<>("2015",560.1));
        Rain.getData().add(new XYChart.Data<>("2016",864));
        Rain.getData().add(new XYChart.Data<>("2017",562));
        Rain.getData().add(new XYChart.Data<>("2018",590.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
