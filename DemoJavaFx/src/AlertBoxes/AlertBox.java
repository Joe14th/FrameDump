package AlertBoxes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
//Alert box.
public class AlertBox {
	
	public static void display(String title, String message) {
		Stage window = new Stage();
		
		//block user interactions with other windows
		//until this is taken care of
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e->window.close());
		
		VBox layout = new VBox();
		layout.getChildren().addAll(label,closeButton);
		//align everything
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		//show and wait until hidden(closed) before returning to the caller
		//show and before go back you need to close window
		window.showAndWait();
	}
}
