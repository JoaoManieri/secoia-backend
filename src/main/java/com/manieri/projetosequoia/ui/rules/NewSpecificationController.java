package com.manieri.projetosequoia.ui.rules;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;
import software.amazon.awssdk.services.s3.model.S3Exception;

import java.awt.Desktop;

import java.io.File;
import java.io.IOException;

public class NewSpecificationController {

    @FXML
    private Label pdfPath;

    @FXML
    private Button readPdf;

    @FXML
    private Button save_button;

    @FXML
    private VBox vbox;

    File file;

    @FXML
    void findPdf(ActionEvent event) {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Nova especificação!");

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));
        file = fileChooser.showOpenDialog(primaryStage);

        if(file != null){

            pdfPath.setText(file.toPath().toString());
            primaryStage.close();

            readPdf.setDisable(false);

        }
    }

    @FXML
    void readPDF(ActionEvent event) {
        File file = new File(pdfPath.getText());

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                try {
                    desktop.open(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("O arquivo PDF não existe.");
            }
        } else {
            System.out.println("O Desktop não é suportado na plataforma atual.");
        }
    }

    @FXML
    void saveData(ActionEvent event) {
        if (file != null) {

            AwsBasicCredentials credentials = AwsBasicCredentials.create("AKIAYAEO6K2NOBOBYKUK", "9U698WbLXSQOLQOs5WXmKgHICHhYRs5L6jrh8n5v");


            try (S3Client s3Client = S3Client.builder()
                    .region(Region.SA_EAST_1) // Substitua pela região desejada
                    .credentialsProvider(() -> credentials)
                    .build()) {
                String bucketName = "newtechdev";
                String key = file.getPath();
                PutObjectRequest request = PutObjectRequest.builder()
                        .bucket(bucketName)
                        .key(key)
                        .build();
                s3Client.putObject(request, file.toPath());

                showToast("O PDF foi salvo na nuvem!", 2000);

                System.out.println("PDF salvo com sucesso no Amazon S3!");

            } catch (S3Exception e) {
                System.err.println("Erro ao salvar o PDF no Amazon S3: " + e.awsErrorDetails().errorMessage());
            }
        }
    }

    private void showToast(String message, int duration) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Retorno servidor");
        alert.setHeaderText("PDF salvo!");
        alert.showAndWait();
    }

}
