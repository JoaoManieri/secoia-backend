package com.manieri.projetosequoia.ui.costumers;

import com.manieri.projetosequoia.LoginStartAplication;
import com.manieri.projetosequoia.database.DAO.AdressDao;
import com.manieri.projetosequoia.database.DAO.CostumerDAO;
import com.manieri.projetosequoia.model.CostumerAdress;
import com.manieri.projetosequoia.model.Empresa;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    private VBox vbox;

    private List<String> lista = new ArrayList<>();

    @FXML
    protected void findCNPJ() {

        HTTPRequestCNPJ request = new HTTPRequestCNPJ();
        Empresa empresa = request.getInfo(cnpj_textField.getText());
        realName_extField.setText(empresa.getNome());
        atuationField_textField.setText(empresa.getAtividade_principal().get(0).getText());
        fantasyName_textField.setText(empresa.getFantasia());

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

    @FXML
    protected void newContatic() throws IOException {

        System.out.println("Chamda");
        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("views/costumers/new-contact-item.fxml"));
        Node content = fxmlLoader.load();
        vbox.getChildren().add(6, content);



    }
}
