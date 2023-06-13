package com.manieri.projetosequoia.ui.costumers;

import com.manieri.projetosequoia.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewCostumerController {


    static Stage stage;

    @FXML
    private TextField adress_textField;

    @FXML
    private TextField atuationField_textField;

    @FXML
    private TextField cnpj_textField;

    @FXML
    private TextField fantasyName_textField;

    @FXML
    private Label log_textField;

    @FXML
    private TextField realName_extField;

    private static final int SEARCH_DELAY = 1000; // Tempo de espera após o usuário parar de digitar (em milissegundos)
    private boolean searchScheduled;

    @FXML
    protected void findCNPJ() {

        HTTPRequestCNPJ request = new HTTPRequestCNPJ();
        Empresa empresa = request.getInfo(cnpj_textField.getText());
        realName_extField.setText(empresa.getNome());
        atuationField_textField.setText(empresa.getAtividade_principal().get(0).getText());
        adress_textField.setText(empresa.getEmail());

        // cnpj_textField.setOnKeyTyped(event -> scheduleSearch());

    }

    private void scheduleSearch() {

        if (!searchScheduled) {
            searchScheduled = true;
            cnpj_textField.setDisable(true); // Desabilita o campo de texto enquanto aguarda a busca

            Thread searchThread = new Thread(() -> {
                try {
                    Thread.sleep(SEARCH_DELAY); // Aguarda o tempo de espera após o usuário parar de digitar

                    HTTPRequestCNPJ request = new HTTPRequestCNPJ();
                    Empresa empresa = request.getInfo(cnpj_textField.getText());
                    realName_extField.setText(empresa.getNome());
                    atuationField_textField.setText(empresa.getAtividade_principal().get(0).getText());
                    adress_textField.setText(empresa.getEmail());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    searchScheduled = false;
                    cnpj_textField.setDisable(false); // Habilita novamente o campo de texto
                }
            });

            searchThread.start();
        }
    }

}
