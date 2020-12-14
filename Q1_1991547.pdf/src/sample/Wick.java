package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Wick {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",16.8));
        Max.getData().add(new XYChart.Data<>("2012",16.2));
        Max.getData().add(new XYChart.Data<>("2013",15.2));
        Max.getData().add(new XYChart.Data<>("2014",16));
        Max.getData().add(new XYChart.Data<>("2015",18.2));
        Max.getData().add(new XYChart.Data<>("2016",17.1));
        Max.getData().add(new XYChart.Data<>("2017",16.3));
        Max.getData().add(new XYChart.Data<>("2018",16.7));

        Min.getData().add(new XYChart.Data<>("2011",0.5));
        Min.getData().add(new XYChart.Data<>("2012",-2.9));
        Min.getData().add(new XYChart.Data<>("2013",0.6));
        Min.getData().add(new XYChart.Data<>("2014",1));
        Min.getData().add(new XYChart.Data<>("2015",0.1));
        Min.getData().add(new XYChart.Data<>("2016",1.3));
        Min.getData().add(new XYChart.Data<>("2017",1.2));
        Min.getData().add(new XYChart.Data<>("2018",0.4));

        Frost.getData().add(new XYChart.Data<>("2011",39));
        Frost.getData().add(new XYChart.Data<>("2012",70));
        Frost.getData().add(new XYChart.Data<>("2013",29));
        Frost.getData().add(new XYChart.Data<>("2014",41));
        Frost.getData().add(new XYChart.Data<>("2015",40));
        Frost.getData().add(new XYChart.Data<>("2016",16));
        Frost.getData().add(new XYChart.Data<>("2017",27));
        Frost.getData().add(new XYChart.Data<>("2018",39));

        Rain.getData().add(new XYChart.Data<>("2011",921.3));
        Rain.getData().add(new XYChart.Data<>("2012",710.5));
        Rain.getData().add(new XYChart.Data<>("2013",809.4));
        Rain.getData().add(new XYChart.Data<>("2014",783));
        Rain.getData().add(new XYChart.Data<>("2015",642.3));
        Rain.getData().add(new XYChart.Data<>("2016",788));
        Rain.getData().add(new XYChart.Data<>("2017",757.8));
        Rain.getData().add(new XYChart.Data<>("2018",793.2));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
