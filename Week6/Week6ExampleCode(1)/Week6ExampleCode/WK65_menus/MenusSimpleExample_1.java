package WK65_menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * MenusSimpleExample_1 simulates an security alarm application. This
 * demonstrates various menu and menu item selections.
 *
 * @author cdea
 */
public class MenusSimpleExample_1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menus Example");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(new MenuItem("Save"));
        //fileMenu.getItems().add(new MenuItem("Print"));
        menuBar.getMenus().add(fileMenu);

        root.setTop(menuBar);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
