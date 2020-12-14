package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Eastbourne {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",21.9));
        Max.getData().add(new XYChart.Data<>("2012",22));
        Max.getData().add(new XYChart.Data<>("2013",20.2));
        Max.getData().add(new XYChart.Data<>("2014",21.4));
        Max.getData().add(new XYChart.Data<>("2015",22.5));
        Max.getData().add(new XYChart.Data<>("2016",22.3));
        Max.getData().add(new XYChart.Data<>("2017",21));
        Max.getData().add(new XYChart.Data<>("2018",21.9));

        Min.getData().add(new XYChart.Data<>("2011",1.7));
        Min.getData().add(new XYChart.Data<>("2012",-0.5));
        Min.getData().add(new XYChart.Data<>("2013",3.6));
        Min.getData().add(new XYChart.Data<>("2014",1.4));
        Min.getData().add(new XYChart.Data<>("2015",2.3));
        Min.getData().add(new XYChart.Data<>("2016",3.9));
        Min.getData().add(new XYChart.Data<>("2017",2.2));
        Min.getData().add(new XYChart.Data<>("2018",3.9));

        Frost.getData().add(new XYChart.Data<>("2011",23));
        Frost.getData().add(new XYChart.Data<>("2012",48));
        Frost.getData().add(new XYChart.Data<>("2013",4));
        Frost.getData().add(new XYChart.Data<>("2014",18));
        Frost.getData().add(new XYChart.Data<>("2015",18));
        Frost.getData().add(new XYChart.Data<>("2016",3));
        Frost.getData().add(new XYChart.Data<>("2017",12));
        Frost.getData().add(new XYChart.Data<>("2018",9));

        Rain.getData().add(new XYChart.Data<>("2011",862.4));
        Rain.getData().add(new XYChart.Data<>("2012",716.6));
        Rain.getData().add(new XYChart.Data<>("2013",629.3));
        Rain.getData().add(new XYChart.Data<>("2014",952.3));
        Rain.getData().add(new XYChart.Data<>("2015",837.7));
        Rain.getData().add(new XYChart.Data<>("2016",992.5));
        Rain.getData().add(new XYChart.Data<>("2017",856.9));
        Rain.getData().add(new XYChart.Data<>("2018",575));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
