package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Bradford {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",19.9));
        Max.getData().add(new XYChart.Data<>("2012",20));
        Max.getData().add(new XYChart.Data<>("2013",19.5));
        Max.getData().add(new XYChart.Data<>("2014",19.8));
        Max.getData().add(new XYChart.Data<>("2015",23.1));
        Max.getData().add(new XYChart.Data<>("2016",22.2));
        Max.getData().add(new XYChart.Data<>("2017",19.7));
        Max.getData().add(new XYChart.Data<>("2018",19.9));

        Min.getData().add(new XYChart.Data<>("2011",0.6));
        Min.getData().add(new XYChart.Data<>("2012",-3.7));
        Min.getData().add(new XYChart.Data<>("2013",1));
        Min.getData().add(new XYChart.Data<>("2014",1.6 ));
        Min.getData().add(new XYChart.Data<>("2015",-0.6));
        Min.getData().add(new XYChart.Data<>("2016",2.2));
        Min.getData().add(new XYChart.Data<>("2017",1.6));
        Min.getData().add(new XYChart.Data<>("2018",1.3));

        Frost.getData().add(new XYChart.Data<>("2011",37));
        Frost.getData().add(new XYChart.Data<>("2012",89));
        Frost.getData().add(new XYChart.Data<>("2013",23));
        Frost.getData().add(new XYChart.Data<>("2014",39));
        Frost.getData().add(new XYChart.Data<>("2015",63));
        Frost.getData().add(new XYChart.Data<>("2016",20));
        Frost.getData().add(new XYChart.Data<>("2017",25));
        Frost.getData().add(new XYChart.Data<>("2018",40));

        Rain.getData().add(new XYChart.Data<>("2011",850));
        Rain.getData().add(new XYChart.Data<>("2012",701.7));
        Rain.getData().add(new XYChart.Data<>("2013",663));
        Rain.getData().add(new XYChart.Data<>("2014",1233.1));
        Rain.getData().add(new XYChart.Data<>("2015",748));
        Rain.getData().add(new XYChart.Data<>("2016",1033.4));
        Rain.getData().add(new XYChart.Data<>("2017",1108.4));
        Rain.getData().add(new XYChart.Data<>("2018",829.4));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
