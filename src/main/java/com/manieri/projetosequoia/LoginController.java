package com.manieri.projetosequoia;

import com.manieri.projetosequoia.ui.mainmenu.MainMenuAplication;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController{

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void clicExit() {
        stage.close();
    }

    @FXML
    protected void clicLogin() throws Exception {

        stage.close();

        Stage stage = new Stage();
        MainMenuAplication mainMenu = new MainMenuAplication();
        mainMenu.start(stage);
    }
}