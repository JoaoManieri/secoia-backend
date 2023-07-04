package com.manieri.projetosequoia.ui.rules;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class NewEntityController implements Initializable {

    @FXML
    private TextArea description_text_field;

    @FXML
    private TextField entity_name_text_field;

    @FXML
    private ImageView image_logo;

    @FXML
    private Button save_button;

    File file;

    @FXML
    void editImageLogo() {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Novo logo!");

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Imagens", "*.jpg", "*.jpeg", "*.png", "*.bmp");
        fileChooser.getExtensionFilters().add(filter);

        File selectedFile = fileChooser.showOpenDialog(primaryStage);

        if (selectedFile != null) {
            System.out.println(selectedFile.getPath());

            Image image = new Image(selectedFile.getPath());
            image_logo.setImage(image);

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Tooltip tooltip = new Tooltip("Logo");

        Tooltip.install(image_logo, tooltip);
    }
}
