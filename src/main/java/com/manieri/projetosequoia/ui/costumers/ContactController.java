package com.manieri.projetosequoia.ui.costumers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ContactController extends NewCostumerController implements Initializable {

    static VBox _vbox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listController.add(this);
    }

    @FXML
    private Label indexMark;

    @FXML
    private AnchorPane root_anchorPane;

    @FXML
    private TextField cell_textField;

    @FXML
    private TextField email_textField;

    @FXML
    private TextField name_textField;

    @FXML
    private TextField phone_textField;

    @FXML
    private TextField role_textField;

    @FXML
    private ComboBox<?> status_comboBox1;

    @FXML
    private TextField zap_textField;

    @FXML
    protected void erasedContact(){
        _vbox.getChildren().remove(root_anchorPane);
        listController.remove(this);
    }


    public TextField getCell_textField() {
        return cell_textField;
    }

    public TextField getEmail_textField() {
        return email_textField;
    }

    public TextField getName_textField() {
        return name_textField;
    }

    public TextField getPhone_textField() {
        return phone_textField;
    }

    public TextField getRole_textField() {
        return role_textField;
    }

    public ComboBox<?> getStatus_comboBox1() {
        return status_comboBox1;
    }

    public TextField getZap_textField() {
        return zap_textField;
    }
}
