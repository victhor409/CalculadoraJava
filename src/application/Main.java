package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;




public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Calculadora.fxml"));
		ScrollPane scrollPane = loader.load();
		
		mainScene = new Scene(scrollPane);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
