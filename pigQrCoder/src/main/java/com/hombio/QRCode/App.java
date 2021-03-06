package com.hombio.QRCode;
import java.io.IOException;

import com.hombio.layout.LayoutURL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application
{
	
	public static Stage getCoderStage() throws IOException {
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(LayoutURL.get("main.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("条形码、二维码生成器");
        stage.setResizable(false);
        return stage;
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(LayoutURL.get("main.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("条形码、二维码生成器");
        stage.show();
        stage.setResizable(false);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
