package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Tiree {
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
        Max.getData().add(new XYChart.Data<>("2012",16.1));
        Max.getData().add(new XYChart.Data<>("2013",15.8));
        Max.getData().add(new XYChart.Data<>("2014",17.1));
        Max.getData().add(new XYChart.Data<>("2015",17.7));
        Max.getData().add(new XYChart.Data<>("2016",17.7));
        Max.getData().add(new XYChart.Data<>("2017",15.9));
        Max.getData().add(new XYChart.Data<>("2018",16.7));

        Min.getData().add(new XYChart.Data<>("2011",2.6));
        Min.getData().add(new XYChart.Data<>("2012",0.3));
        Min.getData().add(new XYChart.Data<>("2013",3.2));
        Min.getData().add(new XYChart.Data<>("2014",3.5));
        Min.getData().add(new XYChart.Data<>("2015",1.9));
        Min.getData().add(new XYChart.Data<>("2016",3.8));
        Min.getData().add(new XYChart.Data<>("2017",2.6));
        Min.getData().add(new XYChart.Data<>("2018",2.5));

        Frost.getData().add(new XYChart.Data<>("2011",17));
        Frost.getData().add(new XYChart.Data<>("2012",44));
        Frost.getData().add(new XYChart.Data<>("2013",4));
        Frost.getData().add(new XYChart.Data<>("2014",4));
        Frost.getData().add(new XYChart.Data<>("2015",12));
        Frost.getData().add(new XYChart.Data<>("2016",0));
        Frost.getData().add(new XYChart.Data<>("2017",4));
        Frost.getData().add(new XYChart.Data<>("2018",5));

        Rain.getData().add(new XYChart.Data<>("2011",1421.5));
        Rain.getData().add(new XYChart.Data<>("2012",988.9));
        Rain.getData().add(new XYChart.Data<>("2013",1509.8));
        Rain.getData().add(new XYChart.Data<>("2014",1191.8));
        Rain.getData().add(new XYChart.Data<>("2015",1210.3));
        Rain.getData().add(new XYChart.Data<>("2016",1510.8));
        Rain.getData().add(new XYChart.Data<>("2017",1480.8));
        Rain.getData().add(new XYChart.Data<>("2018",1317));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
