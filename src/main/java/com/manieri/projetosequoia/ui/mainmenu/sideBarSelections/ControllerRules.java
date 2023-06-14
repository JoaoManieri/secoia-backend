package com.manieri.projetosequoia.ui.mainmenu.sideBarSelections;

import com.manieri.projetosequoia.LoginStartAplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;
import java.util.ArrayList;

public class ControllerRules extends ControllerSubMenu implements ModelSubMenu{

    ArrayList<Button> arrayButtons = new ArrayList<Button>();

    public ControllerRules(VBox vboxMainMenu, TabPane tabPane) {
        super(vboxMainMenu, tabPane);
    }

    @Override
    public void actionSubMenu(int relativeIndex) {

        Button newOrder = new Button(" - Nova especificação");
        newOrder.setId("newSpecification_button");
        newOrder.setAlignment(Pos.BASELINE_LEFT);
        newOrder.setOnAction(e -> clickNewOrder());
        newOrder.setPrefHeight(40.0);
        newOrder.setPrefWidth(260.0);
        newOrder.getStylesheets().add(style);
        newOrder.setTextFill(Color.WHITE);
        newOrder.setPadding(new Insets(0, 0, 0, 80.0));
        newOrder.setFont(new Font(14.0));
        arrayButtons.add(newOrder);

        Button editOrder = new Button(" - Nova norma");
        editOrder.setId("editRule_button");
        editOrder.setAlignment(Pos.BASELINE_LEFT);
        editOrder.setOnAction(e -> clickEditOrder());
        editOrder.setPrefHeight(40.0);
        editOrder.setPrefWidth(260.0);
        editOrder.getStylesheets().add(style);
        editOrder.setTextFill(Color.WHITE);
        editOrder.setPadding(new Insets(0, 0, 0, 80.0));
        editOrder.setFont(new Font(14.0));
        arrayButtons.add(editOrder);

        setSubSession(relativeIndex,arrayButtons,StatusSubMenu.subsessionRulesIsOpen);
    }

    @Override
    public void changeStatus() {
        if(!StatusSubMenu.subsessionRulesIsOpen){
            StatusSubMenu.subsessionRulesIsOpen = true;
        } else {
            StatusSubMenu.subsessionRulesIsOpen = false;
        }
    }
}
