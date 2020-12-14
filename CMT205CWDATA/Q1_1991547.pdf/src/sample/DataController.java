package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;



/* cotroller class which adds the data to home.fxml. Each station also has it's own class to insert data into the charts
    see Aberporth.java for general comments about all station classes
 */

public class DataController {

    // refers to the second tab of the homepage
    @FXML
    public Tab graphTab;

    // temperature graph in the graph tab
    @FXML
    public LineChart tmaxGraph;

    // air frost graph on the graph tab
    @FXML
    public BarChart airfrostGraph;

    // rain graph on the graph tab
    @FXML
    public LineChart rainGraph;

    // refers to the label at the top of the graph tab
    @FXML
    public Label stationName;

    // defining the data series
    private XYChart.Series Max = new XYChart.Series();
    private XYChart.Series Min = new XYChart.Series();
    private XYChart.Series Frost = new XYChart.Series();
    private XYChart.Series Rain = new XYChart.Series();

    // --------- INITIALISING EACH STATION FOR INSERTING DATA ---------

    @FXML private void initAber() {
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Aberporth");
        DataTab.initData(Max, Min, Frost, Rain);
        Aberporth.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initArmagh(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Armargh");
        DataTab.initData(Max, Min, Frost, Rain);
        Armagh.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initBForest(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Ballypatrick Forest");
        DataTab.initData(Max, Min, Frost, Rain);
        BForest.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initBradford(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Bradford");
        DataTab.initData(Max, Min, Frost, Rain);
        Bradford.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initBraemar(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Braemar");
        DataTab.initData(Max, Min, Frost, Rain);
        Braemar.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initCamborne(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Camborne");
        DataTab.initData(Max, Min, Frost, Rain);
        Camborne.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initCambridge(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Cambridge NIAB");
        DataTab.initData(Max, Min, Frost, Rain);
        Cambridge.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initCardiff(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Cardiff Bute Park");
        DataTab.initData(Max, Min, Frost, Rain);
        Cardiff.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initChivenor(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Chivenor");
        DataTab.initData(Max, Min, Frost, Rain);
        Chivenor.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initCwmyst(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Cwmystwyth");
        DataTab.initData(Max, Min, Frost, Rain);
        Cwmysthwyth.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initDunst(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Dunstaffnage");
        DataTab.initData(Max, Min, Frost, Rain);
        Dunstaffnage.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }


    @FXML private void initEastbourne(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Eastbourne");
        DataTab.initData(Max, Min, Frost, Rain);
        Eastbourne.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initEskdale(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Eskdalemuir");
        DataTab.initData(Max, Min, Frost, Rain);
        Eskdalemuir.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initHeathrow(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Heathrow");
        DataTab.initData(Max, Min, Frost, Rain);
        Heathrow.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initHurn(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Hurn");
        DataTab.initData(Max, Min, Frost, Rain);
        Hurn.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initLerwick(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Lerwick");
        DataTab.initData(Max, Min, Frost, Rain);
        Lerwick.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initLeuchars(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Leuchars");
        DataTab.initData(Max, Min, Frost, Rain);
        Leuchars.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initLowestoft(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Lowestoft");
        DataTab.initData(Max, Min, Frost, Rain);
        Lowestoft.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initManston(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Manston");
        DataTab.initData(Max, Min, Frost, Rain);
        Manston.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initNairn(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Nairn");
        DataTab.initData(Max, Min, Frost, Rain);
        Nairn.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initNewton(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Newton Rigg");
        DataTab.initData(Max, Min, Frost, Rain);
        Newton.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initOxford(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Oxford");
        DataTab.initData(Max, Min, Frost, Rain);
        Oxford.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initPaisley(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Paisley");
        DataTab.initData(Max, Min, Frost, Rain);
        Paisley.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initRossOW(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Ross-On-Wye");
        DataTab.initData(Max, Min, Frost, Rain);
        RossOW.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initShawbury(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Shawbury");
        DataTab.initData(Max, Min, Frost, Rain);
        Shawbury.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initSheffield(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Sheffield");
        DataTab.initData(Max, Min, Frost, Rain);
        Sheffield.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initStornoway(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Stornoway Airport");
        DataTab.initData(Max, Min, Frost, Rain);
        Stornoway.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void  initSutton(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Sutton Bonington");
        DataTab.initData(Max, Min, Frost, Rain);
        Sutton.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initTiree(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Tiree");
        DataTab.initData(Max, Min, Frost, Rain);
        Tiree.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initValley(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Valley");
        DataTab.initData(Max, Min, Frost, Rain);
        Valley.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initWaddington(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Waddington");
        DataTab.initData(Max, Min, Frost, Rain);
        Waddington.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initWhitby(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Whitby");
        DataTab.initData(Max, Min, Frost, Rain);
        Whitby.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initWick(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Wick Airport");
        DataTab.initData(Max, Min, Frost, Rain);
        Wick.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    @FXML private void initYeovilton(){
        DataTab.initCharts(graphTab, tmaxGraph, airfrostGraph, rainGraph, stationName, "Yeovilton");
        DataTab.initData(Max, Min, Frost, Rain);
        Yeovilton.insertData(tmaxGraph, airfrostGraph, rainGraph, Max, Min, Frost, Rain);
    }

    /* Code for an error message
    taken from https://stackoverflow.com/questions/39149242/how-can-i-do-an-error-messages-in-javafx
    accessed 26-04-20
    end of referenced code
     */
    @FXML private void initOthers(){
        graphTab.setDisable(true);
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Invalid");
        errorAlert.setContentText("No Data available for this station");
        errorAlert.showAndWait();
    }
}
