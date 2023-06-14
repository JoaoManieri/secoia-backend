package com.manieri.projetosequoia.ui.costumers;

import com.manieri.projetosequoia.database.DAO.AdressDao;
import com.manieri.projetosequoia.database.DAO.CostumerDAO;
import com.manieri.projetosequoia.model.CostumerAdress;
import com.manieri.projetosequoia.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class NewCostumerController {

    static Stage stage;

    @FXML
    private TextField atuationField_textField;

    @FXML
    private TextField bairro_textField;

    @FXML
    private TextField cep_textField;

    @FXML
    private TextField cidade_textField;

    @FXML
    private TextField cnpj_textField;

    @FXML
    private TextField complemento_textField;

    @FXML
    private TextField email_textField;

    @FXML
    private TextField fantasyName_textField;

    @FXML
    private TextField numero_textField;

    @FXML
    private TextField realName_extField;

    @FXML
    private TextField rua_textField;

    @FXML
    private TextField uf_textField;

    @FXML
    private ComboBox<?> status_comboBox;

    @FXML
    protected void findCNPJ() {

        HTTPRequestCNPJ request = new HTTPRequestCNPJ();
        Empresa empresa = request.getInfo(cnpj_textField.getText());
        realName_extField.setText(empresa.getNome());
        atuationField_textField.setText(empresa.getAtividade_principal().get(0).getText());

        email_textField.setText(empresa.getEmail());

        rua_textField.setText(empresa.getLogradouro());
        bairro_textField.setText(empresa.getBairro());
        numero_textField.setText(empresa.getNumero());
        cidade_textField.setText(empresa.getMunicipio());
        uf_textField.setText(empresa.getUf());
        cep_textField.setText(empresa.getCep());

    }

    @FXML
    protected void saveData() throws SQLException {

        CostumerAdress adress = new CostumerAdress(
                rua_textField.getText(),numero_textField.getText(),
                complemento_textField.getText(),bairro_textField.getText(),
                cidade_textField.getText(),uf_textField.getText(),cep_textField.getText()
        );

        Boolean sucess = new AdressDao().setAdress(adress);
        System.out.println(sucess);

    }
}
