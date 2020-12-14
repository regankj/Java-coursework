package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class BForest {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series BallyMax, XYChart.Series BallyMin, XYChart.Series Frost, XYChart.Series Rain){
        BallyMax.setName("Highest Mean Max Temp per Year");
        BallyMin.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        BallyMax.getData().clear();
        BallyMin.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        BallyMax.getData().add(new XYChart.Data<>("2011",17.4));
        BallyMax.getData().add(new XYChart.Data<>("2012",17.3));
        BallyMax.getData().add(new XYChart.Data<>("2013",15.7));
        BallyMax.getData().add(new XYChart.Data<>("2014",17.3));
        BallyMax.getData().add(new XYChart.Data<>("2015",19.6));
        BallyMax.getData().add(new XYChart.Data<>("2016",18.5));
        BallyMax.getData().add(new XYChart.Data<>("2017",16.7));
        BallyMax.getData().add(new XYChart.Data<>("2018",17.3));

        BallyMin.getData().add(new XYChart.Data<>("2011",1.2));
        BallyMin.getData().add(new XYChart.Data<>("2012",-0.3));
        BallyMin.getData().add(new XYChart.Data<>("2013",1.4));
        BallyMin.getData().add(new XYChart.Data<>("2014",2.5 ));
        BallyMin.getData().add(new XYChart.Data<>("2015",0.6));
        BallyMin.getData().add(new XYChart.Data<>("2016",2.3));
        BallyMin.getData().add(new XYChart.Data<>("2017",1));
        BallyMin.getData().add(new XYChart.Data<>("2018",1.6));

        Frost.getData().add(new XYChart.Data<>("2011",29));
        Frost.getData().add(new XYChart.Data<>("2012",73));
        Frost.getData().add(new XYChart.Data<>("2013",11));
        Frost.getData().add(new XYChart.Data<>("2014",8));
        Frost.getData().add(new XYChart.Data<>("2015",30));
        Frost.getData().add(new XYChart.Data<>("2016",9));
        Frost.getData().add(new XYChart.Data<>("2017",26));
        Frost.getData().add(new XYChart.Data<>("2018",19));

        Rain.getData().add(new XYChart.Data<>("2011",1563.8));
        Rain.getData().add(new XYChart.Data<>("2012",1325.6));
        Rain.getData().add(new XYChart.Data<>("2013",1471.4));
        Rain.getData().add(new XYChart.Data<>("2014",1492.2));
        Rain.getData().add(new XYChart.Data<>("2015",1412.7));
        Rain.getData().add(new XYChart.Data<>("2016",1563.7));
        Rain.getData().add(new XYChart.Data<>("2017",1436.3));
        Rain.getData().add(new XYChart.Data<>("2018",1122.7));

        tmaxGraph.getData().add(BallyMax);
        tmaxGraph.getData().add(BallyMin);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
