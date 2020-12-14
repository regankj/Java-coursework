package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Shawbury {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",20.6));
        Max.getData().add(new XYChart.Data<>("2012",20.8));
        Max.getData().add(new XYChart.Data<>("2013",20.4));
        Max.getData().add(new XYChart.Data<>("2014",20.3));
        Max.getData().add(new XYChart.Data<>("2015",24.1));
        Max.getData().add(new XYChart.Data<>("2016",22.9));
        Max.getData().add(new XYChart.Data<>("2017",20.1));
        Max.getData().add(new XYChart.Data<>("2018",24.1));

        Min.getData().add(new XYChart.Data<>("2011",-0.7));
        Min.getData().add(new XYChart.Data<>("2012",-5.8));
        Min.getData().add(new XYChart.Data<>("2013",0.2));
        Min.getData().add(new XYChart.Data<>("2014",0.7));
        Min.getData().add(new XYChart.Data<>("2015",-1));
        Min.getData().add(new XYChart.Data<>("2016",1.4));
        Min.getData().add(new XYChart.Data<>("2017",0.7));
        Min.getData().add(new XYChart.Data<>("2018",0.7));

        Frost.getData().add(new XYChart.Data<>("2011",56));
        Frost.getData().add(new XYChart.Data<>("2012",97));
        Frost.getData().add(new XYChart.Data<>("2013",45));
        Frost.getData().add(new XYChart.Data<>("2014",57));
        Frost.getData().add(new XYChart.Data<>("2015",77));
        Frost.getData().add(new XYChart.Data<>("2016",36));
        Frost.getData().add(new XYChart.Data<>("2017",39));
        Frost.getData().add(new XYChart.Data<>("2018",57));

        Rain.getData().add(new XYChart.Data<>("2011",617.8));
        Rain.getData().add(new XYChart.Data<>("2012",526.7));
        Rain.getData().add(new XYChart.Data<>("2013",455.2));
        Rain.getData().add(new XYChart.Data<>("2014",945.2));
        Rain.getData().add(new XYChart.Data<>("2015",688.2));
        Rain.getData().add(new XYChart.Data<>("2016",751));
        Rain.getData().add(new XYChart.Data<>("2017",649.5));
        Rain.getData().add(new XYChart.Data<>("2018",725.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
