import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class UDPClientTimeoutTest extends Application 
{
	@Override
	public void start(Stage primaryStage)
	{
		Group root = new Group();
		Scene scene = new Scene(root);
		VBox vbox = new VBox(5);
		// spacing between child nodes only.
		vbox.setPadding(new Insets(10));
		// space between vbox border and child nodes column
		enter = new TextField();
		enter.setPrefColumnCount(20);
		display = new TextArea();
		display.setPrefColumnCount(20);
		display.setPrefRowCount(10);
		display.setEditable(false);
		ScrollPane scrollDisplay = new ScrollPane(display);
		vbox.getChildren().addAll(enter, scrollDisplay);
		root.getChildren().add(vbox);
		
		UDPClient = new UDPClientTimeoutThread(this);
		UDPClient.start();
		
		enter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				AppendDisplay("\n\nSending packet containing: " + enter.getText() + "\n" );
				UDPClient.SendPacket(enter.getText());
				AppendDisplay("Packet sent\n");
				enter.setText("");
			}
		}
		);
		
		primaryStage.setTitle("UDP Client Timeout Test");
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
	
	UDPClientTimeoutThread UDPClient;
	private TextField enter;
	private TextArea display;
	
}
