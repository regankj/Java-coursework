import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
public class UDPServerTest extends Application {
	public void start(Stage primaryStage)  
	{
		Group root = new Group();
		Scene scene = new Scene(root);
		display = new TextArea();
		display.setPrefColumnCount(20);
		display.setPrefRowCount(10);
		display.setEditable(false);
		ScrollPane scrollDisplay = new ScrollPane(display); 
		root.getChildren().add(scrollDisplay);
		
		new UDPServerThread(this).start();
		
		primaryStage.setTitle("UDP Server Test");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String [] args)
	{
		launch(args);
	}
	public void AppendDisplay(String msg) 
	{
		display.appendText(msg);
	}	
	private TextArea display;
}
