package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Dunstaffnage {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",18.5));
        Max.getData().add(new XYChart.Data<>("2012",18.4));
        Max.getData().add(new XYChart.Data<>("2013",18.5));
        Max.getData().add(new XYChart.Data<>("2014",18.8));
        Max.getData().add(new XYChart.Data<>("2015",20.3));
        Max.getData().add(new XYChart.Data<>("2016",19.8));
        Max.getData().add(new XYChart.Data<>("2017",17.8));
        Max.getData().add(new XYChart.Data<>("2018",18.7));

        Min.getData().add(new XYChart.Data<>("2011",0.2));
        Min.getData().add(new XYChart.Data<>("2012",-2.1));
        Min.getData().add(new XYChart.Data<>("2013",1.6));
        Min.getData().add(new XYChart.Data<>("2014",2.4));
        Min.getData().add(new XYChart.Data<>("2015",1.2));
        Min.getData().add(new XYChart.Data<>("2016",2.8));
        Min.getData().add(new XYChart.Data<>("2017",1.3));
        Min.getData().add(new XYChart.Data<>("2018",1.6));

        Frost.getData().add(new XYChart.Data<>("2011",35));
        Frost.getData().add(new XYChart.Data<>("2012",74));
        Frost.getData().add(new XYChart.Data<>("2013",17));
        Frost.getData().add(new XYChart.Data<>("2014",26));
        Frost.getData().add(new XYChart.Data<>("2015",26));
        Frost.getData().add(new XYChart.Data<>("2016",5));
        Frost.getData().add(new XYChart.Data<>("2017",26));
        Frost.getData().add(new XYChart.Data<>("2018",27));

        Rain.getData().add(new XYChart.Data<>("2011",1744.4));
        Rain.getData().add(new XYChart.Data<>("2012",1103.8));
        Rain.getData().add(new XYChart.Data<>("2013",2366.8));
        Rain.getData().add(new XYChart.Data<>("2014",1689.1));
        Rain.getData().add(new XYChart.Data<>("2015",1607.1));
        Rain.getData().add(new XYChart.Data<>("2016",1935.9));
        Rain.getData().add(new XYChart.Data<>("2017",2044.8));
        Rain.getData().add(new XYChart.Data<>("2018",1737.1));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
