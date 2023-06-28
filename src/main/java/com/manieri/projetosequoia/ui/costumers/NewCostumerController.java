package com.manieri.projetosequoia.ui.costumers;

import com.manieri.projetosequoia.LoginStartAplication;
import com.manieri.projetosequoia.database.DAO.AdressDao;
import com.manieri.projetosequoia.database.DAO.CostumerDAO;
import com.manieri.projetosequoia.model.Costumer;
import com.manieri.projetosequoia.model.CostumerAdress;
import com.manieri.projetosequoia.model.CostumerContacts;
import com.manieri.projetosequoia.model.Empresa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.ResourceBundle;

public class NewCostumerController implements Initializable {

    private static final int MAX_CNPJ_LENGTH = 14;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            newContatic();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ObservableList<String> lista = FXCollections.observableArrayList();
        lista.add(0, "SIM");
        lista.add(1, "NÃO");

        // Atualiza o campo de texto com o valor selecionado no ComboBox
        status_comboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            status_comboBox.setValue(newValue);
        });

        cnpj_textField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                formatCNPJ(cnpj_textField);
//                statusInfoSave_icon.setStyle("-fx-fill: red;");
//                statusInfoSave_text.setText("Não salvos");
//                statusInfoSave_text.setStyle("-fx-fill: red;");
            }
        });

    }

    static Stage stage;

    static ArrayList<ContactController> listController = new ArrayList<>();

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
    private ComboBox<String> status_comboBox;

    @FXML
    private FontAwesomeIconView statusInfoSave_icon;

    @FXML
    private Label statusInfoSave_text;

    @FXML
    private ComboBox<?> orderRequest_comboBox;


    @FXML
    private VBox vbox;

    @FXML
    protected void findCNPJ() {

        String cnpj = cnpj_textField.getText().replaceAll("[^0-9]", "");

        HTTPRequestCNPJ request = new HTTPRequestCNPJ();
        Empresa empresa = request.getInfo(cnpj);

        fantasyName_textField.setText(empresa.getFantasia());
        realName_extField.setText(empresa.getNome());

        atuationField_textField.setText(empresa.getAtividade_principal().get(0).getText());


        email_textField.setText(empresa.getEmail());

        rua_textField.setText(empresa.getLogradouro());
        bairro_textField.setText(empresa.getBairro());
        numero_textField.setText(empresa.getNumero());
        cidade_textField.setText(empresa.getMunicipio());
        uf_textField.setText(empresa.getUf());
        cep_textField.setText(empresa.getCep());

        status_comboBox.setValue(empresa.getSituacao());

    }

    @FXML
    protected void saveData() throws SQLException {

        ArrayList<CostumerContacts> contactList = new ArrayList<>();

        for (ContactController item : listController) {
            contactList.add(new CostumerContacts(item.getName_textField().getText(),
                    item.getRole_textField().getText(),
                    true,
                    item.getPhone_textField().getText(),
                    item.getCell_textField().getText(),
                    item.getEmail_textField().getText(),
                    item.getZap_textField().getText()));
        }

        String currentYear = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));

        CostumerAdress adress = new CostumerAdress(
                rua_textField.getText(), numero_textField.getText(),
                complemento_textField.getText(), bairro_textField.getText(),
                cidade_textField.getText(), uf_textField.getText(), cep_textField.getText()
        );

        ArrayList<CostumerAdress> addressList = new ArrayList<>();
        addressList.add(adress);

        Costumer costumer = new Costumer(fantasyName_textField.getText(),
                realName_extField.getText(),
                cnpj_textField.getText(),
                true,
                currentYear,
                (Objects.equals(orderRequest_comboBox.getEditor().getText(), "ATIVO")),
                (Objects.equals(status_comboBox.getEditor().getText(), "ATIVO")),
                atuationField_textField.getText(), "NaN", addressList,contactList);


        // Boolean sucess = new AdressDao().setAdress(adress, 1);
        Boolean sucess = new CostumerDAO().setCostumer(costumer);

        System.out.println(sucess);


    }

    @FXML
    protected void newContatic() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(LoginStartAplication.class.getResource("views/costumers/new-contact-item.fxml"));
        Node content = fxmlLoader.load();

        ContactController._vbox = this.vbox;

        vbox.getChildren().add(6, content);

    }

    private void formatCNPJ(TextField cnpjField) {
        String cnpj = cnpjField.getText();

        // Remove todos os caracteres não numéricos
        cnpj = cnpj.replaceAll("\\D", "");

        // Verifica se o CNPJ ultrapassa o limite de caracteres permitidos
        if (cnpj.length() > MAX_CNPJ_LENGTH) {
            cnpj = cnpj.substring(0, MAX_CNPJ_LENGTH);
        }

        // Formata o CNPJ no formato ##.###.###/####-##
        if (cnpj.length() >= 2) {
            cnpj = cnpj.substring(0, 2) + "." + cnpj.substring(2);
        }
        if (cnpj.length() >= 6) {
            cnpj = cnpj.substring(0, 6) + "." + cnpj.substring(6);
        }
        if (cnpj.length() >= 10) {
            cnpj = cnpj.substring(0, 10) + "/" + cnpj.substring(10);
        }
        if (cnpj.length() >= 15) {
            cnpj = cnpj.substring(0, 15) + "-" + cnpj.substring(15);
        }

        // Define o texto formatado no campo de CNPJ
        cnpjField.setText(cnpj);
    }



}
