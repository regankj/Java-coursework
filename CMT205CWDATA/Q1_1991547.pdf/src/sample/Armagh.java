package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Armagh {

    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",19.7));
        Max.getData().add(new XYChart.Data<>("2012",20.1));
        Max.getData().add(new XYChart.Data<>("2013",19));
        Max.getData().add(new XYChart.Data<>("2014",20));
        Max.getData().add(new XYChart.Data<>("2015",23.1));
        Max.getData().add(new XYChart.Data<>("2016",21.4));
        Max.getData().add(new XYChart.Data<>("2017",18.7));
        Max.getData().add(new XYChart.Data<>("2018",19.6));

        Min.getData().add(new XYChart.Data<>("2011",-0.1));
        Min.getData().add(new XYChart.Data<>("2012",-3.8));
        Min.getData().add(new XYChart.Data<>("2013",0.5));
        Min.getData().add(new XYChart.Data<>("2014",1.7 ));
        Min.getData().add(new XYChart.Data<>("2015",0.3));
        Min.getData().add(new XYChart.Data<>("2016",1.1));
        Min.getData().add(new XYChart.Data<>("2017",0.1));
        Min.getData().add(new XYChart.Data<>("2018",1.1));

        Frost.getData().add(new XYChart.Data<>("2011",48));
        Frost.getData().add(new XYChart.Data<>("2012",87));
        Frost.getData().add(new XYChart.Data<>("2013",24));
        Frost.getData().add(new XYChart.Data<>("2014",29));
        Frost.getData().add(new XYChart.Data<>("2015",41));
        Frost.getData().add(new XYChart.Data<>("2016",24));
        Frost.getData().add(new XYChart.Data<>("2017",46));
        Frost.getData().add(new XYChart.Data<>("2018",33));

        Rain.getData().add(new XYChart.Data<>("2011",891.5));
        Rain.getData().add(new XYChart.Data<>("2012",794.6));
        Rain.getData().add(new XYChart.Data<>("2013",871.9));
        Rain.getData().add(new XYChart.Data<>("2014",853.1));
        Rain.getData().add(new XYChart.Data<>("2015",853.4));
        Rain.getData().add(new XYChart.Data<>("2016",962.6));
        Rain.getData().add(new XYChart.Data<>("2017",955.1));
        Rain.getData().add(new XYChart.Data<>("2018",736.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
