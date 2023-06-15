package com.manieri.projetosequoia.ui.order;

import com.manieri.projetosequoia.database.DAO.CostumerDAO;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class NewOrderController {

    @FXML
    private ComboBox<String> searchCostumers_coboBox;

    @FXML
    protected void initialize() {
        // Adicione um ouvinte de eventos de teclado ao campo de texto do ComboBox
        searchCostumers_coboBox.getEditor().addEventHandler(KeyEvent.KEY_RELEASED, event -> {
            if (isLetterTyped(event.getCode())) {
                try {
                    searchCostumers();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    protected void searchCostumers() throws SQLException {
        if (isLetterTyped()) {
            searchCostumers_coboBox.getItems().clear();
            List<String> listaDeItens = new CostumerDAO().queryName(searchCostumers_coboBox.getEditor().getText());
            if (listaDeItens != null) {
                searchCostumers_coboBox.getItems().addAll(listaDeItens);
                searchCostumers_coboBox.show();
            }
        }
    }

    private boolean isLetterTyped(KeyCode keyCode) {
        return keyCode.isLetterKey();
    }

    private boolean isLetterTyped() {
        String text = searchCostumers_coboBox.getEditor().getText();
        return text.matches(".*[a-zA-Z]+.*");
    }


}
