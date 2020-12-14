package WK66_uicontrols;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author cdea
 */
public class TableViewExample_2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TableViewExample_2");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 500, 250, Color.WHITE);

        // create a grid pane
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        root.setCenter(gridpane);

        // candidates label
        Label candidatesLbl = new Label("Boss");
        GridPane.setHalignment(candidatesLbl, HPos.CENTER);
        gridpane.add(candidatesLbl, 0, 0);

        // List of leaders
        ObservableList<Person_2> leaders = getPeople();
        final ListView<Person_2> leaderListView = new ListView<>(leaders);
        leaderListView.setPrefWidth(150);
        leaderListView.setMaxWidth(Double.MAX_VALUE);
        leaderListView.setPrefHeight(150);

        // display first and last name with tooltip using alias
        leaderListView.setCellFactory(new Callback<ListView<Person_2>, ListCell<Person_2>>() {

            @Override
            public ListCell<Person_2> call(ListView<Person_2> param) {
                final Label leadLbl = new Label();
                final Tooltip tooltip = new Tooltip();
                final ListCell<Person_2> cell = new ListCell<Person_2>() {
                    @Override
                    public void updateItem(Person_2 item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            leadLbl.setText(item.getAliasName());
                            setText(item.getFirstName() + " " + item.getLastName());
                            tooltip.setText(item.getAliasName());
                            setTooltip(tooltip);
                        }
                    }
                }; // ListCell
                return cell;

            }
        }); // setCellFactory

        gridpane.add(leaderListView, 0, 1);

        Label emplLbl = new Label("Employees");
        gridpane.add(emplLbl, 2, 0);
        GridPane.setHalignment(emplLbl, HPos.CENTER);

        final TableView<Person_2> employeeTableView = new TableView<>();
        employeeTableView.setPrefWidth(300);

        final ObservableList<Person_2> teamMembers = FXCollections.observableArrayList();
        employeeTableView.setItems(teamMembers);

        TableColumn<Person_2, String> aliasNameCol = new TableColumn<>("Alias");
        aliasNameCol.setEditable(true);
        aliasNameCol.setCellValueFactory(new PropertyValueFactory("aliasName"));
        aliasNameCol.setPrefWidth(employeeTableView.getPrefWidth() / 3);

        TableColumn<Person_2, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory("firstName"));
        firstNameCol.setPrefWidth(employeeTableView.getPrefWidth() / 3);

        TableColumn<Person_2, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory("lastName"));
        lastNameCol.setPrefWidth(employeeTableView.getPrefWidth() / 3);

        employeeTableView.getColumns().setAll(aliasNameCol, firstNameCol, lastNameCol);
        gridpane.add(employeeTableView, 2, 1);

        // selection listening
        leaderListView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Person_2> observable, Person_2 oldValue, Person_2 newValue) -> {
            if (observable != null && observable.getValue() != null) {
                teamMembers.clear();
                teamMembers.addAll(observable.getValue().employeesProperty());
            }
        });



        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ObservableList<Person_2> getPeople() {
        ObservableList<Person_2> people = FXCollections.<Person_2>observableArrayList();
        Person_2 docX = new Person_2("Professor X", "Charles", "Xavier");
        docX.employeesProperty().add(new Person_2("Wolverine", "James", "Howlett"));
        docX.employeesProperty().add(new Person_2("Cyclops", "Scott", "Summers"));
        docX.employeesProperty().add(new Person_2("Storm", "Ororo", "Munroe"));

        Person_2 magneto = new Person_2("Magneto", "Max", "Eisenhardt");
        magneto.employeesProperty().add(new Person_2("Juggernaut", "Cain", "Marko"));
        magneto.employeesProperty().add(new Person_2("Mystique", "Raven", "DarkhÃ¶lme"));
        magneto.employeesProperty().add(new Person_2("Sabretooth", "Victor", "Creed"));

        Person_2 biker = new Person_2("Mountain Biker", "Jonathan", "Gennick");
        biker.employeesProperty().add(new Person_2("Josh", "Joshua", "Juneau"));
        biker.employeesProperty().add(new Person_2("Freddy", "Freddy", "Guime"));
        biker.employeesProperty().add(new Person_2("Mark", "Mark", "Beaty"));
        biker.employeesProperty().add(new Person_2("John", "John", "O'Conner"));
        biker.employeesProperty().add(new Person_2("D-Man", "Carl", "Dea"));

        people.add(docX);
        people.add(magneto);
        people.add(biker);

        return people;
    }

    public static void main(String[] args) {
        launch(args);
    }
}