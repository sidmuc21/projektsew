package com.example.projektsew2025;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        URL url = new File("<REPLACE_BY_PROJECT_PATH>/ProjektSEW2025/src/main/java/com.example.projektsew2025/main.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage.setTitle("Memory Game");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}