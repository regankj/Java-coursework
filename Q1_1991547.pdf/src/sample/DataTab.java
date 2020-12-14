package sample;


import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;

// class for functions to initialise data/charts

public class DataTab {

    // function to enable the graph tab and also the the charts of any previous data

    public static void initCharts(Tab graphTab, LineChart tmaxGraph, BarChart airfrostGraph, LineChart rainGraph, Label stationName, String s) {
        graphTab.setDisable(false);
        /* code to re-enable a tab
        taken from https://stackoverflow.com/questions/40313632/how-to-enable-disable-tab-in-javafx
        accessed 22-04-20
        end of referenced code
         */
        stationName.setText(s);
        tmaxGraph.getData().clear();
        airfrostGraph.getData().clear();
        rainGraph.getData().clear();
        /* code to remove data from a chart (above)
        taken from https://stackoverflow.com/questions/41956339/javafx-linechart-clean-data-from-chart
        accessed 22-04-20
        end of referenced code
         */
    }

    // function to clear a data series and set it's name

    public static void initData(XYChart.Series Max, XYChart.Series Min, XYChart.Series Frost, XYChart.Series Rain){
        Max.setName("Highest Mean Max Temp per Year");
        Min.setName("Lowest Mean Min Temp per Year");
        Frost.setName("Days of Air Frost per Year");
        Rain.setName("Total Rainfall per Year");
        Max.getData().clear();
        Min.getData().clear();
        Frost.getData().clear();
        Rain.getData().clear();
    }
}
