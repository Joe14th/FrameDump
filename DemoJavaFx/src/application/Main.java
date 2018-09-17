package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

//EventHandle not needed here for anonymous classes or Lambda expression
public class Main extends Application{// implements EventHandler<ActionEvent>{
	//Override because inherited from application class
	Button button;
	
	//main javaFX code
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//title to main window
		primaryStage.setTitle("Title of the Window");
		
		//create button
		button = new Button();
		button.setText("Hey baby");
		
		//whenever it is clicked the code to handle it is in this class
		//button.setOnAction(this); OR anonymous inner class
		//more compact and don't have to check event source when multiple buttons
		//button.setOnAction(new EventHandler<ActionEvent>(){
		//	@Override
		//	public void handle(ActionEvent arg0) {
		//		System.out.println("I am an anonymous inner class");
		//	}
		//});
		//lambda expression e represents even handler and anything that would be in
		//in the method body goes after -> inside {}
		button.setOnAction(e -> {
			System.out.println("hey now brown cow");
			System.out.println("I am a meatball");
		});
		
		//make a layout for how everything is arranged before it appears
		//position button in the middle
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		//create scene
		//how you want things arranged in scene, size, size (size of entire window)
		Scene scene = new Scene(layout, 300, 250);
		//use this scene for the main window
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		//sets up program as java fx 
		//go into application then call start
		launch(args);
	}


	//@Override
	//public void handle(ActionEvent event) {
		//find which button caused this to occur 
		//identify different buttons
		//if(event.getSource().equals(button)) {
		//	System.out.println("OOoooo i love it when u touch me there.....");
		//}
		//if(event.getSource() == button2) {
		//	System.out.println("you clicked button 2");
		//} deal with different buttons
	//}

	
}
