package com.manieri.projetosequoia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.manieri.projetosequoia.model.Costumer;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


//        Costumer costumer = createSampleCostumer(); // Crie um objeto de exemplo para testar
//
//        // Criar um novo documento PDF
//        PDDocument document = new PDDocument();
//
//        // Criar uma nova página
//        PDPage page = new PDPage(PDRectangle.A4);
//        document.addPage(page);
//
//        // Iniciar o fluxo de conteúdo da página
//        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
//            // Definir a posição inicial para começar a escrever
//            contentStream.beginText();
//            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
//            contentStream.newLineAtOffset(50, 700);
//
//            // Escrever os dados do cliente no PDF
//            contentStream.showText("Fantasy Name: " + costumer.getFantasyName());
//            contentStream.newLine();
//            contentStream.showText("Real Name: " + costumer.getRealName());
//            contentStream.newLine();
//            contentStream.showText("CNPJ: " + costumer.getCnpj());
//            contentStream.newLine();
//            // Continue escrevendo os outros campos da classe Costumer
//
//            contentStream.endText();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Exibir o diálogo de salvamento do arquivo
//        assert filePath != null;
//        File file = new File(filePath); // Altere para o local desejado
//        try {
//            document.save(file);
//            document.close();
//            System.out.println("PDF salvo com sucesso!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static Costumer createSampleCostumer() {
//        // Crie um objeto de exemplo para testar
//        Costumer costumer = new Costumer(
//                "FantasyName",
//                "RealName",
//                "123456789",
//                true,
//                "2021",
//                true,
//                true,
//                "AtuationField",
//                "CompetitiveFactor",
//                new ArrayList<>(), // Insira seus endereços de cliente aqui
//                new ArrayList<>() // Insira seus contatos de cliente aqui
//        );
//
//        return costumer;
    }
}