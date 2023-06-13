package com.manieri.projetosequoia.ui.costumers;

import com.manieri.projetosequoia.LoginStartAplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NewCustumerAplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("new-costumer-view.fxml"));
        NewCostumerController.stage = stage;
        Scene scene = new Scene(fxmlLoader.load());

        NewCostumerController controller = new NewCostumerController();
        // controller.findCNPJ();

        stage.setTitle("NEW COSTUMER");
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {
        launch();
    }
}
