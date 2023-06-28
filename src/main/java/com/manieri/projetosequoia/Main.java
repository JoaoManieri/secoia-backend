package com.manieri.projetosequoia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("/com/manieri/projetosequoia/views/costumers/edit-costumer-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Teste Main");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
