package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Sheffield {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",21));
        Max.getData().add(new XYChart.Data<>("2012",21));
        Max.getData().add(new XYChart.Data<>("2013",20.3));
        Max.getData().add(new XYChart.Data<>("2014",20.9));
        Max.getData().add(new XYChart.Data<>("2015",24));
        Max.getData().add(new XYChart.Data<>("2016",23.2));
        Max.getData().add(new XYChart.Data<>("2017",20.8));
        Max.getData().add(new XYChart.Data<>("2018",21.3));

        Min.getData().add(new XYChart.Data<>("2011",1.3));
        Min.getData().add(new XYChart.Data<>("2012",-1.9));
        Min.getData().add(new XYChart.Data<>("2013",1.9));
        Min.getData().add(new XYChart.Data<>("2014",2.3));
        Min.getData().add(new XYChart.Data<>("2015",-0.2));
        Min.getData().add(new XYChart.Data<>("2016",3));
        Min.getData().add(new XYChart.Data<>("2017",2));
        Min.getData().add(new XYChart.Data<>("2018",2));

        Frost.getData().add(new XYChart.Data<>("2011",34));
        Frost.getData().add(new XYChart.Data<>("2012",59));
        Frost.getData().add(new XYChart.Data<>("2013",14));
        Frost.getData().add(new XYChart.Data<>("2014",25));
        Frost.getData().add(new XYChart.Data<>("2015",47));
        Frost.getData().add(new XYChart.Data<>("2016",10));
        Frost.getData().add(new XYChart.Data<>("2017",15));
        Frost.getData().add(new XYChart.Data<>("2018",16));

        Rain.getData().add(new XYChart.Data<>("2011",896));
        Rain.getData().add(new XYChart.Data<>("2012",618.4));
        Rain.getData().add(new XYChart.Data<>("2013",572.4));
        Rain.getData().add(new XYChart.Data<>("2014",1146.4));
        Rain.getData().add(new XYChart.Data<>("2015",728.2));
        Rain.getData().add(new XYChart.Data<>("2016",864.4));
        Rain.getData().add(new XYChart.Data<>("2017",793));
        Rain.getData().add(new XYChart.Data<>("2018",787.8));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
