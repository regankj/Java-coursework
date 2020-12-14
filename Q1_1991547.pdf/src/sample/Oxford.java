package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Oxford {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",22.7));
        Max.getData().add(new XYChart.Data<>("2012",23.9));
        Max.getData().add(new XYChart.Data<>("2013",21.4));
        Max.getData().add(new XYChart.Data<>("2014",21.8));
        Max.getData().add(new XYChart.Data<>("2015",25.5));
        Max.getData().add(new XYChart.Data<>("2016",24.9));
        Max.getData().add(new XYChart.Data<>("2017",22.6));
        Max.getData().add(new XYChart.Data<>("2018",23.5));

        Min.getData().add(new XYChart.Data<>("2011",0.2));
        Min.getData().add(new XYChart.Data<>("2012",-2.2));
        Min.getData().add(new XYChart.Data<>("2013",1.9));
        Min.getData().add(new XYChart.Data<>("2014",1.2));
        Min.getData().add(new XYChart.Data<>("2015",0.2));
        Min.getData().add(new XYChart.Data<>("2016",2.4));
        Min.getData().add(new XYChart.Data<>("2017",1));
        Min.getData().add(new XYChart.Data<>("2018",2.2));

        Frost.getData().add(new XYChart.Data<>("2011",41));
        Frost.getData().add(new XYChart.Data<>("2012",69));
        Frost.getData().add(new XYChart.Data<>("2013",23));
        Frost.getData().add(new XYChart.Data<>("2014",32));
        Frost.getData().add(new XYChart.Data<>("2015",43));
        Frost.getData().add(new XYChart.Data<>("2016",16));
        Frost.getData().add(new XYChart.Data<>("2017",23));
        Frost.getData().add(new XYChart.Data<>("2018",29));

        Rain.getData().add(new XYChart.Data<>("2011",620.5));
        Rain.getData().add(new XYChart.Data<>("2012",603.7));
        Rain.getData().add(new XYChart.Data<>("2013",480.9));
        Rain.getData().add(new XYChart.Data<>("2014",984.4));
        Rain.getData().add(new XYChart.Data<>("2015",635.8));
        Rain.getData().add(new XYChart.Data<>("2016",797));
        Rain.getData().add(new XYChart.Data<>("2017",547.4));
        Rain.getData().add(new XYChart.Data<>("2018",658.2));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
