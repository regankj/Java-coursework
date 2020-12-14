package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Eskdalemuir {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",18.4));
        Max.getData().add(new XYChart.Data<>("2012",18.7));
        Max.getData().add(new XYChart.Data<>("2013",18.3));
        Max.getData().add(new XYChart.Data<>("2014",18));
        Max.getData().add(new XYChart.Data<>("2015",21.4));
        Max.getData().add(new XYChart.Data<>("2016",20));
        Max.getData().add(new XYChart.Data<>("2017",17));
        Max.getData().add(new XYChart.Data<>("2018",17.7));

        Min.getData().add(new XYChart.Data<>("2011",-2.8));
        Min.getData().add(new XYChart.Data<>("2012",-6.8));
        Min.getData().add(new XYChart.Data<>("2013",-2));
        Min.getData().add(new XYChart.Data<>("2014",-0.4));
        Min.getData().add(new XYChart.Data<>("2015",-2.3));
        Min.getData().add(new XYChart.Data<>("2016",-0.5));
        Min.getData().add(new XYChart.Data<>("2017",-1.3));
        Min.getData().add(new XYChart.Data<>("2018",-1.3));

        Frost.getData().add(new XYChart.Data<>("2011",83));
        Frost.getData().add(new XYChart.Data<>("2012",125));
        Frost.getData().add(new XYChart.Data<>("2013",64));
        Frost.getData().add(new XYChart.Data<>("2014",89));
        Frost.getData().add(new XYChart.Data<>("2015",102));
        Frost.getData().add(new XYChart.Data<>("2016",50));
        Frost.getData().add(new XYChart.Data<>("2017",70));
        Frost.getData().add(new XYChart.Data<>("2018",80));

        Rain.getData().add(new XYChart.Data<>("2011",2178.9));
        Rain.getData().add(new XYChart.Data<>("2012",1282.2));
        Rain.getData().add(new XYChart.Data<>("2013",2289.6));
        Rain.getData().add(new XYChart.Data<>("2014",1995.2));
        Rain.getData().add(new XYChart.Data<>("2015",1795.2));
        Rain.getData().add(new XYChart.Data<>("2016",2002.9));
        Rain.getData().add(new XYChart.Data<>("2017",2451.7));
        Rain.getData().add(new XYChart.Data<>("2018",1691.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
