package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Lowestoft {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",22.8));
        Max.getData().add(new XYChart.Data<>("2012",23.6));
        Max.getData().add(new XYChart.Data<>("2013",21.1));
        Max.getData().add(new XYChart.Data<>("2014",22));
        Max.getData().add(new XYChart.Data<>("2015",22.1));
        Max.getData().add(new XYChart.Data<>("2016",21.7));
        Max.getData().add(new XYChart.Data<>("2017",22));
        Max.getData().add(new XYChart.Data<>("2018",22.9));

        Min.getData().add(new XYChart.Data<>("2011",1.2));
        Min.getData().add(new XYChart.Data<>("2012",-1.4));
        Min.getData().add(new XYChart.Data<>("2013",2.7));
        Min.getData().add(new XYChart.Data<>("2014",1.6));
        Min.getData().add(new XYChart.Data<>("2015",0.8));
        Min.getData().add(new XYChart.Data<>("2016",3.2));
        Min.getData().add(new XYChart.Data<>("2017",1.5));
        Min.getData().add(new XYChart.Data<>("2018",2.5));

        Frost.getData().add(new XYChart.Data<>("2011",33));
        Frost.getData().add(new XYChart.Data<>("2012",57));
        Frost.getData().add(new XYChart.Data<>("2013",16));
        Frost.getData().add(new XYChart.Data<>("2014",33));
        Frost.getData().add(new XYChart.Data<>("2015",41));
        Frost.getData().add(new XYChart.Data<>("2016",18));
        Frost.getData().add(new XYChart.Data<>("2017",23));
        Frost.getData().add(new XYChart.Data<>("2018",20));

        Rain.getData().add(new XYChart.Data<>("2011",581.2));
        Rain.getData().add(new XYChart.Data<>("2012",683.6));
        Rain.getData().add(new XYChart.Data<>("2013",445));
        Rain.getData().add(new XYChart.Data<>("2014",783.4));
        Rain.getData().add(new XYChart.Data<>("2015",541.7));
        Rain.getData().add(new XYChart.Data<>("2016",721.6));
        Rain.getData().add(new XYChart.Data<>("2017",629.2));
        Rain.getData().add(new XYChart.Data<>("2018",629.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
