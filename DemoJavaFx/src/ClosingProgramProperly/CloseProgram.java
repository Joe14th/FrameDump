package ClosingProgramProperly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//properly close out of application
public class CloseProgram extends Application {
	Stage window;
	Button button;
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title");
		
		//clicking x normally bipases close program method
		//method will still run if hit x instead of button
		//but modified boolean method does not effect this
		//window.setOnCloseRequest(e->closeProgram());
		//no matter what answer is above dont care gonna close anyways
		window.setOnCloseRequest(e->{
			//hey java our method is gonna take care of it
			e.consume(); //consumed event
			closeProgram();
		});
		
		//confirm user want to exit/ save file/history...
		button = new Button("Close Program");
		button.setOnAction(e->closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().addAll(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram() {
		//System.out.println("File is saved");
		//window.close();
		Boolean answer  = ConfirmBox.display("title", "sure you want to exit");
		if(answer)
			window.close();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
