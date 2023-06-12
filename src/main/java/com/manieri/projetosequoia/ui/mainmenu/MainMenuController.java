package com.manieri.projetosequoia.ui.mainmenu;

import com.manieri.projetosequoia.LoginStartAplication;
import com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerCostumers;
import com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerOrders;
import com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerRules;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private AnchorPane fragment_clientes;

    @FXML
    private AnchorPane fragment_configuracoes;

    @FXML
    private AnchorPane fragment_normas;

    @FXML
    private AnchorPane fragment_orcamento;

    @FXML
    private TabPane tabtext;

    @FXML
    private VBox mainMenu_vbox;


    @FXML
    void clic_orders() {
        fragment_orcamento.toFront();
        ControllerOrders cm = new ControllerOrders(mainMenu_vbox);
        cm.changeStatus();
        cm.actionSubMenu(2);

    }

    @FXML
    void clic_costumers() {
        fragment_clientes.toFront();
        ControllerCostumers cm = new ControllerCostumers(mainMenu_vbox);
        cm.changeStatus();
        cm.actionSubMenu(3);
    }

    @FXML
    void clic_rules() {
        fragment_normas.toFront();
        ControllerRules cm = new ControllerRules(mainMenu_vbox);
        cm.changeStatus();
        cm.actionSubMenu(4);
    }

    @FXML
    void clic_settings() {
        fragment_configuracoes.toFront();
    }


    @FXML
    void newQuery() {
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
