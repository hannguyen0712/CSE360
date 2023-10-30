package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DefinitionsController {
	@FXML
	private Button redirectToEffortAndDefectLogs;
	@FXML
	private Button redirectToEffortLogConsole;
	@FXML
	private Button redirectToEffortLogConsole1;
	@FXML
	private Button redirectToDefectLogConsole;
	@FXML
	private Button redirectToEffortLogEditor;

	@FXML
	private void redirectToEffortAndDefectLogs() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("DefectLog.fxml"));
	        Parent newSceneRoot = loader.load();
	        Scene newScene = new Scene(newSceneRoot);

	        // Get the current stage
	        Stage currentStage = (Stage) redirectToEffortAndDefectLogs.getScene().getWindow();
	        currentStage.setScene(newScene);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	@FXML
	private void redirectToEffortLogConsole() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Effort_Console.fxml"));
	        Parent newSceneRoot = loader.load();
	        Scene newScene = new Scene(newSceneRoot);

	        // Get the current stage
	        Stage currentStage = (Stage) redirectToEffortLogConsole.getScene().getWindow();
	        currentStage.setScene(newScene);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	@FXML
	private void redirectToEffortLogConsole1() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Effort_Console.fxml"));
	        Parent newSceneRoot = loader.load();
	        Scene newScene = new Scene(newSceneRoot);

	        // Get the current stage
	        Stage currentStage = (Stage) redirectToEffortLogConsole1.getScene().getWindow();
	        currentStage.setScene(newScene);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	@FXML
	private void redirectToDefectLogConsole() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("defectLogConsole.fxml"));
	        Parent newSceneRoot = loader.load();
	        Scene newScene = new Scene(newSceneRoot);

	        // Get the current stage
	        Stage currentStage = (Stage) redirectToDefectLogConsole.getScene().getWindow();
	        currentStage.setScene(newScene);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	@FXML
	private void redirectToEffortLogEditor() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("EffortLogEditor.fxml"));
	        Parent newSceneRoot = loader.load();
	        Scene newScene = new Scene(newSceneRoot);

	        // Get the current stage
	        Stage currentStage = (Stage) redirectToEffortLogEditor.getScene().getWindow();
	        currentStage.setScene(newScene);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
