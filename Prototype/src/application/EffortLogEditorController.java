package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EffortLogEditorController {
	@FXML
	private Button proceedToEffortLogConsole;
	
	@FXML
	private void redirectToEffortAndDefectLogs() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("effortLogConsole.fxml"));
	        Parent newSceneRoot = loader.load();
	        Scene newScene = new Scene(newSceneRoot);

	        // Get the current stage
	        Stage currentStage = (Stage) proceedToEffortLogConsole.getScene().getWindow();
	        currentStage.setScene(newScene);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
