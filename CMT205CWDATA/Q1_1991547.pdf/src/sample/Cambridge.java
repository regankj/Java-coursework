package sample;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Cambridge {
    public static void insertData(LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){

        Max.getData().add(new XYChart.Data<>("2011",23.6));
        Max.getData().add(new XYChart.Data<>("2012",24.6));
        Max.getData().add(new XYChart.Data<>("2013",21.6));
        Max.getData().add(new XYChart.Data<>("2014",22.5));
        Max.getData().add(new XYChart.Data<>("2015",25.1));
        Max.getData().add(new XYChart.Data<>("2016",24.4));
        Max.getData().add(new XYChart.Data<>("2017",22.5));
        Max.getData().add(new XYChart.Data<>("2018",23.9));

        Min.getData().add(new XYChart.Data<>("2011",0.2));
        Min.getData().add(new XYChart.Data<>("2012",-2.7));
        Min.getData().add(new XYChart.Data<>("2013",2.2));
        Min.getData().add(new XYChart.Data<>("2014",0.1));
        Min.getData().add(new XYChart.Data<>("2015",0.1));
        Min.getData().add(new XYChart.Data<>("2016",2.8));
        Min.getData().add(new XYChart.Data<>("2017",1.2));
        Min.getData().add(new XYChart.Data<>("2018",1.9));

        Frost.getData().add(new XYChart.Data<>("2011",44));
        Frost.getData().add(new XYChart.Data<>("2012",73));
        Frost.getData().add(new XYChart.Data<>("2013",20));
        Frost.getData().add(new XYChart.Data<>("2014",38));
        Frost.getData().add(new XYChart.Data<>("2015",56));
        Frost.getData().add(new XYChart.Data<>("2016",21));
        Frost.getData().add(new XYChart.Data<>("2017",30));
        Frost.getData().add(new XYChart.Data<>("2018",41));

        Rain.getData().add(new XYChart.Data<>("2011",527.6));
        Rain.getData().add(new XYChart.Data<>("2012",481.5));
        Rain.getData().add(new XYChart.Data<>("2013",347.2));
        Rain.getData().add(new XYChart.Data<>("2014",727.3));
        Rain.getData().add(new XYChart.Data<>("2015",460.8));
        Rain.getData().add(new XYChart.Data<>("2016",689.8));
        Rain.getData().add(new XYChart.Data<>("2017",485.9));
        Rain.getData().add(new XYChart.Data<>("2018",498.6));

        tmaxGraph.getData().add(Max);
        tmaxGraph.getData().add(Min);
        airfrostGraph.getData().add(Frost);
        rainGraph.getData().add(Rain);
    }
}
