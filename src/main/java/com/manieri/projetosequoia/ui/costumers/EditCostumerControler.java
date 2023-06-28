package com.manieri.projetosequoia.ui.costumers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class EditCostumerControler implements Initializable {



    @FXML
    private ComboBox<String> comboBox_pesquisa;

    public void adicionar_opcoes(){
        comboBox_pesquisa.getItems().add("CNPJ");
        comboBox_pesquisa.getItems().add("NOME EMPRESA");
        comboBox_pesquisa.getItems().add("TELEFONE");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        adicionar_opcoes();

    }
}


