package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Camborne {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",18.2));
        Max.getData().add(new XYChart.Data<>("2012",18.6));
        Max.getData().add(new XYChart.Data<>("2013",17.6));
        Max.getData().add(new XYChart.Data<>("2014",19));
        Max.getData().add(new XYChart.Data<>("2015",20.8));
        Max.getData().add(new XYChart.Data<>("2016",20.3));
        Max.getData().add(new XYChart.Data<>("2017",18.2));
        Max.getData().add(new XYChart.Data<>("2018",19.4));

        Min.getData().add(new XYChart.Data<>("2011",3.7));
        Min.getData().add(new XYChart.Data<>("2012",1.4));
        Min.getData().add(new XYChart.Data<>("2013",3.5));
        Min.getData().add(new XYChart.Data<>("2014",4.1));
        Min.getData().add(new XYChart.Data<>("2015",2.8));
        Min.getData().add(new XYChart.Data<>("2016",4.7));
        Min.getData().add(new XYChart.Data<>("2017",3.5));
        Min.getData().add(new XYChart.Data<>("2018",4.6));

        Frost.getData().add(new XYChart.Data<>("2011",8));
        Frost.getData().add(new XYChart.Data<>("2012",40));
        Frost.getData().add(new XYChart.Data<>("2013",27));
        Frost.getData().add(new XYChart.Data<>("2014",7));
        Frost.getData().add(new XYChart.Data<>("2015",12));
        Frost.getData().add(new XYChart.Data<>("2016",1));
        Frost.getData().add(new XYChart.Data<>("2017",3));
        Frost.getData().add(new XYChart.Data<>("2018",0));

        Rain.getData().add(new XYChart.Data<>("2011",1191.9));
        Rain.getData().add(new XYChart.Data<>("2012",906.7));
        Rain.getData().add(new XYChart.Data<>("2013",862.8));
        Rain.getData().add(new XYChart.Data<>("2014",1327.8));
        Rain.getData().add(new XYChart.Data<>("2015",1070.6));
        Rain.getData().add(new XYChart.Data<>("2016",1161.8));
        Rain.getData().add(new XYChart.Data<>("2017",1084.8));
        Rain.getData().add(new XYChart.Data<>("2018",1147.3));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
