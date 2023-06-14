package com.manieri.projetosequoia.ui.mainmenu;

import com.manieri.projetosequoia.LoginStartAplication;
import com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerCostumers;
import com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerOrders;
import com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerRules;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
//import javafx.scene.web.WebView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainMenuController {
    @FXML
    public TabPane tabPaneMain;

    @FXML
    private VBox mainMenu_vbox;

    //@FXML
   // private WebView  webView;


    @FXML
    void clickOrders() {
        ControllerOrders cm = new ControllerOrders(mainMenu_vbox, tabPaneMain);
        cm.changeStatus();
        cm.actionSubMenu(2);

    }

    @FXML
    void clickCostumers() {
        ControllerCostumers cm = new ControllerCostumers(mainMenu_vbox, tabPaneMain);
        cm.changeStatus();
        cm.actionSubMenu(3);

    }

    @FXML
    void clickRules() {
        ControllerRules cm = new ControllerRules(mainMenu_vbox, tabPaneMain);
        cm.changeStatus();
        cm.actionSubMenu(4);

    }

    @FXML
    void clickSettings() {

    }
}
