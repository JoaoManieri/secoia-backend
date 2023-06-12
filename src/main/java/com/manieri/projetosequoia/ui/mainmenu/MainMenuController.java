package com.manieri.projetosequoia.ui.mainmenu;

import com.manieri.projetosequoia.LoginStartAplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button button_normas;

    @FXML
    private Button button_orcaments;

    @FXML
    private Button button_settings;

    @FXML
    private Button button_users;

    @FXML
    private AnchorPane fragment_clientes;

    @FXML
    private AnchorPane fragment_configuracoes;

    @FXML
    private AnchorPane fragment_normas;

    @FXML
    private AnchorPane fragment_orcamento;

    @FXML
    private AnchorPane root_view;

    @FXML
    private TabPane tabtext;

    @FXML
    private AnchorPane tabplane;


    @FXML
    void clic_costumers(){
        fragment_clientes.toFront();
    }
    @FXML
    void clic_settings(){
        fragment_configuracoes.toFront();
    }
    @FXML
    void clic_rules(){
        fragment_normas.toFront();
    }
    @FXML
    void clic_orders(){
        fragment_orcamento.toFront();
    }

    @FXML
    void newQuery(){
        try {
            FXMLLoader loader = new FXMLLoader(LoginStartAplication.class.getResource("main-menu-view.fxml"));
            Node conteudo = loader.load();

            Tab novaAba = new Tab("Nova Aba");
            novaAba.setContent(conteudo);
            tabtext.getTabs().add(novaAba);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
