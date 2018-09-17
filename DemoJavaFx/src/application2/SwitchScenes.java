package application2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchScenes extends Application {
	//rename primaryStage to window
	Stage window; 
	Scene scene1, scene2;
	//set scenes
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		//Button 1
		Label label1 = new Label("Welcome to the first scene");
		Button button1 = new Button("Go to scene 2");
		//go from scene1 to 2 on button click
		button1.setOnAction(e->window.setScene(scene2));
		
		//Layout1 - children are laid out in vertical column
		//layout that stacks all the obj on top of each other in a colum
		//and is going to space them out 20 pixels
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		//Button 2
		//Label label2 = new Label("This Scene sucks go back to scene 1");
		Button button2 = new Button("This Scene sucks go back to scene 1");
		button2.setOnAction(e-> window.setScene(scene1));
		
		//Layout2
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(button2);
		scene2 = new Scene(layout2, 600,300);
		
		//how does window know which scene to start with
		//by default start window with scene1
		window.setScene(scene1);
		window.setTitle("Title");
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
