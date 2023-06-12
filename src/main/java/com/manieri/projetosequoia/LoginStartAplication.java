package com.manieri.projetosequoia;

import com.manieri.projetosequoia.database.CloudSQLTester;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class
LoginStartAplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        LoginController controller = fxmlLoader.getController();
        controller.setStage(stage);

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

        getUsersTest();
    }

    public void getUsersTest() { new CloudSQLTester().handlerRequest(); }

    public static void main(String[] args) {
        launch();
    }
}