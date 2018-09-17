package AlertBoxes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//create multiple windows 
//- to create multiple scenes look at switch scene..

//create new java class alert box
public class AlertBoxes extends Application {
	Stage window;
	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title");
		
		button = new Button("Click me");
		//use method in other class to handle event
		//button.setOnAction(e->AlertBox.display("Title of the window", "Wow this alert box is awesome"));
		//have data passed from one window to the other
		button.setOnAction(e->{
			boolean result = ConfirmBox.display("Title", "Are you sure you want to send naked pics?");
			System.out.println(result);
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300,250);
		window.setScene(scene);
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
