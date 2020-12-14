package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Yeovilton {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",20.8));
        Max.getData().add(new XYChart.Data<>("2012",22.5));
        Max.getData().add(new XYChart.Data<>("2013",20.7));
        Max.getData().add(new XYChart.Data<>("2014",20.7));
        Max.getData().add(new XYChart.Data<>("2015",25.3));
        Max.getData().add(new XYChart.Data<>("2016",23.3));
        Max.getData().add(new XYChart.Data<>("2017",21.3));
        Max.getData().add(new XYChart.Data<>("2018",22.8));

        Min.getData().add(new XYChart.Data<>("2011",-0.3));
        Min.getData().add(new XYChart.Data<>("2012",-4.5));
        Min.getData().add(new XYChart.Data<>("2013",1.1));
        Min.getData().add(new XYChart.Data<>("2014",0.8));
        Min.getData().add(new XYChart.Data<>("2015",0));
        Min.getData().add(new XYChart.Data<>("2016",1.6));
        Min.getData().add(new XYChart.Data<>("2017",0.2));
        Min.getData().add(new XYChart.Data<>("2018",1.4));

        Frost.getData().add(new XYChart.Data<>("2011",58));
        Frost.getData().add(new XYChart.Data<>("2012",90));
        Frost.getData().add(new XYChart.Data<>("2013",36));
        Frost.getData().add(new XYChart.Data<>("2014",49));
        Frost.getData().add(new XYChart.Data<>("2015",61));
        Frost.getData().add(new XYChart.Data<>("2016",25));
        Frost.getData().add(new XYChart.Data<>("2017",35));
        Frost.getData().add(new XYChart.Data<>("2018",59));

        Rain.getData().add(new XYChart.Data<>("2011",677.7));
        Rain.getData().add(new XYChart.Data<>("2012",575.1));
        Rain.getData().add(new XYChart.Data<>("2013",588.8));
        Rain.getData().add(new XYChart.Data<>("2014",986.6));
        Rain.getData().add(new XYChart.Data<>("2015",652.2));
        Rain.getData().add(new XYChart.Data<>("2016",914));
        Rain.getData().add(new XYChart.Data<>("2017",637.1));
        Rain.getData().add(new XYChart.Data<>("2018",690.4));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
