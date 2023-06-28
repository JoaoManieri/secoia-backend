package com.manieri.projetosequoia;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;
import software.amazon.awssdk.services.s3.model.S3Exception;

import java.io.File;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Save PDF to Amazon S3");

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));
        File file = fileChooser.showOpenDialog(primaryStage);

        System.out.println(file.toPath());

        if (file != null) {
            // Substitua "SUA_ACCESS_KEY_ID" e "SUA_SECRET_ACCESS_KEY" pelas suas credenciais reais
            AwsBasicCredentials credentials = AwsBasicCredentials.create("AKIAYAEO6K2NOBOBYKUK", "9U698WbLXSQOLQOs5WXmKgHICHhYRs5L6jrh8n5v");

            S3Client s3Client = S3Client.builder()
                    .region(Region.SA_EAST_1) // Substitua pela região desejada
                    .credentialsProvider(() -> credentials)
                    .build();

            String bucketName = "newtechdev";
            String key = "novoPdf.pdf";

            try {
                PutObjectRequest request = PutObjectRequest.builder()
                        .bucket(bucketName)
                        .key(key)
                        .build();
                PutObjectResponse response = s3Client.putObject(request, file.toPath());

                System.out.println("PDF salvo com sucesso no Amazon S3!");
            } catch (S3Exception e) {
                System.err.println("Erro ao salvar o PDF no Amazon S3: " + e.awsErrorDetails().errorMessage());
            } finally {
                s3Client.close();
            }
        }

        primaryStage.close();
    }
}
