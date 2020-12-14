package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Sutton {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",21.9));
        Max.getData().add(new XYChart.Data<>("2012",22));
        Max.getData().add(new XYChart.Data<>("2013",21.5));
        Max.getData().add(new XYChart.Data<>("2014",21.4));
        Max.getData().add(new XYChart.Data<>("2015",24.3));
        Max.getData().add(new XYChart.Data<>("2016",24.1));
        Max.getData().add(new XYChart.Data<>("2017",21.5));
        Max.getData().add(new XYChart.Data<>("2018",22.6));

        Min.getData().add(new XYChart.Data<>("2011",0.5));
        Min.getData().add(new XYChart.Data<>("2012",-4));
        Min.getData().add(new XYChart.Data<>("2013",1.4));
        Min.getData().add(new XYChart.Data<>("2014",0.8));
        Min.getData().add(new XYChart.Data<>("2015",-0.2));
        Min.getData().add(new XYChart.Data<>("2016",2.3));
        Min.getData().add(new XYChart.Data<>("2017",1.3));
        Min.getData().add(new XYChart.Data<>("2018",1.9));

        Frost.getData().add(new XYChart.Data<>("2011",45));
        Frost.getData().add(new XYChart.Data<>("2012",73));
        Frost.getData().add(new XYChart.Data<>("2013",23));
        Frost.getData().add(new XYChart.Data<>("2014",44));
        Frost.getData().add(new XYChart.Data<>("2015",58));
        Frost.getData().add(new XYChart.Data<>("2016",25));
        Frost.getData().add(new XYChart.Data<>("2017",29));
        Frost.getData().add(new XYChart.Data<>("2018",38));

        Rain.getData().add(new XYChart.Data<>("2011",588.2));
        Rain.getData().add(new XYChart.Data<>("2012",510.9));
        Rain.getData().add(new XYChart.Data<>("2013",401.9));
        Rain.getData().add(new XYChart.Data<>("2014",831.8));
        Rain.getData().add(new XYChart.Data<>("2015",554.4));
        Rain.getData().add(new XYChart.Data<>("2016",630.5));
        Rain.getData().add(new XYChart.Data<>("2017",582.8));
        Rain.getData().add(new XYChart.Data<>("2018",667.2));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
