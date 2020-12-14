package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Waddington {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",21.6));
        Max.getData().add(new XYChart.Data<>("2012",22.3));
        Max.getData().add(new XYChart.Data<>("2013",20.5));
        Max.getData().add(new XYChart.Data<>("2014",21.4));
        Max.getData().add(new XYChart.Data<>("2015",23.4));
        Max.getData().add(new XYChart.Data<>("2016",23.4));
        Max.getData().add(new XYChart.Data<>("2017",21.3));
        Max.getData().add(new XYChart.Data<>("2018",22));

        Min.getData().add(new XYChart.Data<>("2011",0.6));
        Min.getData().add(new XYChart.Data<>("2012",-3.3));
        Min.getData().add(new XYChart.Data<>("2013",1.2));
        Min.getData().add(new XYChart.Data<>("2014",0.9));
        Min.getData().add(new XYChart.Data<>("2015",-0.2));
        Min.getData().add(new XYChart.Data<>("2016",2.1));
        Min.getData().add(new XYChart.Data<>("2017",1.1));
        Min.getData().add(new XYChart.Data<>("2018",1.7));

        Frost.getData().add(new XYChart.Data<>("2011",39));
        Frost.getData().add(new XYChart.Data<>("2012",69));
        Frost.getData().add(new XYChart.Data<>("2013",24));
        Frost.getData().add(new XYChart.Data<>("2014",39));
        Frost.getData().add(new XYChart.Data<>("2015",60));
        Frost.getData().add(new XYChart.Data<>("2016",21));
        Frost.getData().add(new XYChart.Data<>("2017",24));
        Frost.getData().add(new XYChart.Data<>("2018",30));

        Rain.getData().add(new XYChart.Data<>("2011",558.3));
        Rain.getData().add(new XYChart.Data<>("2012",647.8));
        Rain.getData().add(new XYChart.Data<>("2013",423.5));
        Rain.getData().add(new XYChart.Data<>("2014",889.2));
        Rain.getData().add(new XYChart.Data<>("2015",517.6));
        Rain.getData().add(new XYChart.Data<>("2016",624.4));
        Rain.getData().add(new XYChart.Data<>("2017",531.2));
        Rain.getData().add(new XYChart.Data<>("2018",652.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
