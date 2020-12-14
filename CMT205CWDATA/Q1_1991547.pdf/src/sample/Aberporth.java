package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

// class adds data to a data series and then inserts the data into the charts

public class Aberporth {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){


        Max.getData().add(new XYChart.Data<>("2011",18.3));
        Max.getData().add(new XYChart.Data<>("2012",18.1));
        Max.getData().add(new XYChart.Data<>("2013",17.5));
        Max.getData().add(new XYChart.Data<>("2014",18.4));
        Max.getData().add(new XYChart.Data<>("2015",20.7));
        Max.getData().add(new XYChart.Data<>("2016",19.3));
        Max.getData().add(new XYChart.Data<>("2017",17.8));
        Max.getData().add(new XYChart.Data<>("2018",18.9));

        Min.getData().add(new XYChart.Data<>("2011",1.4));
        Min.getData().add(new XYChart.Data<>("2012",-0.1));
        Min.getData().add(new XYChart.Data<>("2013",2.1));
        Min.getData().add(new XYChart.Data<>("2014",2.8 ));
        Min.getData().add(new XYChart.Data<>("2015",1));
        Min.getData().add(new XYChart.Data<>("2016",3.8));
        Min.getData().add(new XYChart.Data<>("2017",2.5));
        Min.getData().add(new XYChart.Data<>("2018",3.5));

        Frost.getData().add(new XYChart.Data<>("2011",22));
        Frost.getData().add(new XYChart.Data<>("2012",43));
        Frost.getData().add(new XYChart.Data<>("2013",15));
        Frost.getData().add(new XYChart.Data<>("2014",16));
        Frost.getData().add(new XYChart.Data<>("2015",32));
        Frost.getData().add(new XYChart.Data<>("2016",1));
        Frost.getData().add(new XYChart.Data<>("2017",7));
        Frost.getData().add(new XYChart.Data<>("2018",4));

        Rain.getData().add(new XYChart.Data<>("2011",1010));
        Rain.getData().add(new XYChart.Data<>("2012",713.8));
        Rain.getData().add(new XYChart.Data<>("2013",736.6));
        Rain.getData().add(new XYChart.Data<>("2014",1152.8));
        Rain.getData().add(new XYChart.Data<>("2015",873.5));
        Rain.getData().add(new XYChart.Data<>("2016",1207.4));
        Rain.getData().add(new XYChart.Data<>("2017",1018.2));
        Rain.getData().add(new XYChart.Data<>("2018",842));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
