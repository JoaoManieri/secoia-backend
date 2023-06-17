package com.manieri.projetosequoia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("views/costumers/new-costumer-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("S");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}

