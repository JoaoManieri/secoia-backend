package com.manieri.projetosequoia.ui.mainmenu;

import com.manieri.projetosequoia.LoginStartAplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainMenuAplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("main-menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("Main menu - Projeto Sequoia");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();

    }
}
