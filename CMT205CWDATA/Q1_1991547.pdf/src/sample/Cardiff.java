package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Cardiff {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",20.7));
        Max.getData().add(new XYChart.Data<>("2012",22));
        Max.getData().add(new XYChart.Data<>("2013",20.7));
        Max.getData().add(new XYChart.Data<>("2014",20.9));
        Max.getData().add(new XYChart.Data<>("2015",25));
        Max.getData().add(new XYChart.Data<>("2016",23.6));
        Max.getData().add(new XYChart.Data<>("2017",20.3));
        Max.getData().add(new XYChart.Data<>("2018",21.6));

        Min.getData().add(new XYChart.Data<>("2011",0.4));
        Min.getData().add(new XYChart.Data<>("2012",-3.4));
        Min.getData().add(new XYChart.Data<>("2013",1.6));
        Min.getData().add(new XYChart.Data<>("2014",1.7));
        Min.getData().add(new XYChart.Data<>("2015",1.1));
        Min.getData().add(new XYChart.Data<>("2016",2.1));
        Min.getData().add(new XYChart.Data<>("2017",1.3));
        Min.getData().add(new XYChart.Data<>("2018",2.2));

        Frost.getData().add(new XYChart.Data<>("2011",49));
        Frost.getData().add(new XYChart.Data<>("2012",67));
        Frost.getData().add(new XYChart.Data<>("2013",24));
        Frost.getData().add(new XYChart.Data<>("2014",38));
        Frost.getData().add(new XYChart.Data<>("2015",42));
        Frost.getData().add(new XYChart.Data<>("2016",22));
        Frost.getData().add(new XYChart.Data<>("2017",23));
        Frost.getData().add(new XYChart.Data<>("2018",37));

        Rain.getData().add(new XYChart.Data<>("2011",1198.9));
        Rain.getData().add(new XYChart.Data<>("2012",848.3));
        Rain.getData().add(new XYChart.Data<>("2013",929.5));
        Rain.getData().add(new XYChart.Data<>("2014",1496.4));
        Rain.getData().add(new XYChart.Data<>("2015",1135.5));
        Rain.getData().add(new XYChart.Data<>("2016",1397.3));
        Rain.getData().add(new XYChart.Data<>("2017",1310.2));
        Rain.getData().add(new XYChart.Data<>("2018",1191.8));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
