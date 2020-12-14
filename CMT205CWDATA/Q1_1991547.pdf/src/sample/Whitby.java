package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Whitby {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",21.1));
        Max.getData().add(new XYChart.Data<>("2012",21.4));
        Max.getData().add(new XYChart.Data<>("2013",19.4));
        Max.getData().add(new XYChart.Data<>("2014",20.4));
        Max.getData().add(new XYChart.Data<>("2015",22.4));
        Max.getData().add(new XYChart.Data<>("2016",20.8));
        Max.getData().add(new XYChart.Data<>("2017",20.4));
        Max.getData().add(new XYChart.Data<>("2018",21.2));

        Min.getData().add(new XYChart.Data<>("2011",1.2));
        Min.getData().add(new XYChart.Data<>("2012",-2.2));
        Min.getData().add(new XYChart.Data<>("2013",1.3));
        Min.getData().add(new XYChart.Data<>("2014",1.8));
        Min.getData().add(new XYChart.Data<>("2015",0.5));
        Min.getData().add(new XYChart.Data<>("2016",2.2));
        Min.getData().add(new XYChart.Data<>("2017",1.6));
        Min.getData().add(new XYChart.Data<>("2018",1.5));

        Frost.getData().add(new XYChart.Data<>("2011",34));
        Frost.getData().add(new XYChart.Data<>("2012",62));
        Frost.getData().add(new XYChart.Data<>("2013",28));
        Frost.getData().add(new XYChart.Data<>("2014",32));
        Frost.getData().add(new XYChart.Data<>("2015",36));
        Frost.getData().add(new XYChart.Data<>("2016",26));
        Frost.getData().add(new XYChart.Data<>("2017",21));
        Frost.getData().add(new XYChart.Data<>("2018",22));

        Rain.getData().add(new XYChart.Data<>("2011",656));
        Rain.getData().add(new XYChart.Data<>("2012",838.8));
        Rain.getData().add(new XYChart.Data<>("2013",561.3));
        Rain.getData().add(new XYChart.Data<>("2014",882.9));
        Rain.getData().add(new XYChart.Data<>("2015",546.4));
        Rain.getData().add(new XYChart.Data<>("2016",734.7));
        Rain.getData().add(new XYChart.Data<>("2017",568.4));
        Rain.getData().add(new XYChart.Data<>("2018",736.5));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
