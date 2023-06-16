package com.manieri.projetosequoia.ui.costumers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class EditCostumerControler {

    @FXML
    private Label Jlabel;
    @FXML
    private TextField JText;

    @FXML
    protected void escreva() {
        System.out.println("Davi");
        Jlabel.setText(JText.getText());



    }





}


