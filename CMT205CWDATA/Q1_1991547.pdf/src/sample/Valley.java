package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Valley {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();

        Max.getData().add(new XYChart.Data<>("2011",19));
        Max.getData().add(new XYChart.Data<>("2012",18.3));
        Max.getData().add(new XYChart.Data<>("2013",18.2));
        Max.getData().add(new XYChart.Data<>("2014",19));
        Max.getData().add(new XYChart.Data<>("2015",21.6));
        Max.getData().add(new XYChart.Data<>("2016",20.3));
        Max.getData().add(new XYChart.Data<>("2017",18.3));
        Max.getData().add(new XYChart.Data<>("2018",19.1));

        Min.getData().add(new XYChart.Data<>("2011",2.4));
        Min.getData().add(new XYChart.Data<>("2012",-0.9));
        Min.getData().add(new XYChart.Data<>("2013",2));
        Min.getData().add(new XYChart.Data<>("2014",3.9));
        Min.getData().add(new XYChart.Data<>("2015",1.1));
        Min.getData().add(new XYChart.Data<>("2016",4.9));
        Min.getData().add(new XYChart.Data<>("2017",2.9));
        Min.getData().add(new XYChart.Data<>("2018",3.7));

        Frost.getData().add(new XYChart.Data<>("2011",21));
        Frost.getData().add(new XYChart.Data<>("2012",50));
        Frost.getData().add(new XYChart.Data<>("2013",14));
        Frost.getData().add(new XYChart.Data<>("2014",17));
        Frost.getData().add(new XYChart.Data<>("2015",37));
        Frost.getData().add(new XYChart.Data<>("2016",2));
        Frost.getData().add(new XYChart.Data<>("2017",12));
        Frost.getData().add(new XYChart.Data<>("2018",12));

        Rain.getData().add(new XYChart.Data<>("2011",871.3));
        Rain.getData().add(new XYChart.Data<>("2012",736.2));
        Rain.getData().add(new XYChart.Data<>("2013",760.6));
        Rain.getData().add(new XYChart.Data<>("2014",1021.7));
        Rain.getData().add(new XYChart.Data<>("2015",844));
        Rain.getData().add(new XYChart.Data<>("2016",943));
        Rain.getData().add(new XYChart.Data<>("2017",974));
        Rain.getData().add(new XYChart.Data<>("2018",858.4));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
