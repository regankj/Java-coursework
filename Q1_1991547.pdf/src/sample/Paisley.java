package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Paisley {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",20));
        Max.getData().add(new XYChart.Data<>("2012",20.2));
        Max.getData().add(new XYChart.Data<>("2013",20.3));
        Max.getData().add(new XYChart.Data<>("2014",19.7));
        Max.getData().add(new XYChart.Data<>("2015",22.4));
        Max.getData().add(new XYChart.Data<>("2016",21.4));
        Max.getData().add(new XYChart.Data<>("2017",18.7));
        Max.getData().add(new XYChart.Data<>("2018",19.3));

        Min.getData().add(new XYChart.Data<>("2011",-0.9));
        Min.getData().add(new XYChart.Data<>("2012",-4.4));
        Min.getData().add(new XYChart.Data<>("2013",1));
        Min.getData().add(new XYChart.Data<>("2014",1.2));
        Min.getData().add(new XYChart.Data<>("2015",0.1));
        Min.getData().add(new XYChart.Data<>("2016",1.7));
        Min.getData().add(new XYChart.Data<>("2017",1.1));
        Min.getData().add(new XYChart.Data<>("2018",0.8));

        Frost.getData().add(new XYChart.Data<>("2011",36));
        Frost.getData().add(new XYChart.Data<>("2012",75));
        Frost.getData().add(new XYChart.Data<>("2013",29));
        Frost.getData().add(new XYChart.Data<>("2014",40));
        Frost.getData().add(new XYChart.Data<>("2015",54));
        Frost.getData().add(new XYChart.Data<>("2016",15));
        Frost.getData().add(new XYChart.Data<>("2017",34));
        Frost.getData().add(new XYChart.Data<>("2018",46));

        Rain.getData().add(new XYChart.Data<>("2011",1237.1));
        Rain.getData().add(new XYChart.Data<>("2012",947.2));
        Rain.getData().add(new XYChart.Data<>("2013",1599.3));
        Rain.getData().add(new XYChart.Data<>("2014",1316.5));
        Rain.getData().add(new XYChart.Data<>("2015",1159.3));
        Rain.getData().add(new XYChart.Data<>("2016",1257.6));
        Rain.getData().add(new XYChart.Data<>("2017",1603.2));
        Rain.getData().add(new XYChart.Data<>("2018",1163.8));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
