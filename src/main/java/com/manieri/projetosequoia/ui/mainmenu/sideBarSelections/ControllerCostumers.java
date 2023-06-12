package com.manieri.projetosequoia.ui.mainmenu.sideBarSelections;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class ControllerCostumers extends ControllerSubMenu implements ModelSubMenu{
    public ControllerCostumers(VBox vboxMainMenu) {
        super(vboxMainMenu);
    }

    ArrayList<Button> arrayButtons = new ArrayList<Button>();


    @Override
    public void actionSubMenu(int relativeIndex) {
        Button newOrder = new Button(" - Novo orçamento");
        newOrder.setId("newOrder_button");
        newOrder.setAlignment(Pos.BASELINE_LEFT);
        newOrder.setOnAction(e -> clic_new_order());
        newOrder.setPrefHeight(40.0);
        newOrder.setPrefWidth(260.0);
        newOrder.getStylesheets().add(style);
        newOrder.setTextFill(Color.WHITE);
        newOrder.setPadding(new Insets(0, 0, 0, 80.0));
        newOrder.setFont(new Font(14.0));
        arrayButtons.add(newOrder);

        Button editOrder = new Button(" - Editar orçamento");
        editOrder.setId("editOrder_button");
        editOrder.setAlignment(Pos.BASELINE_LEFT);
        editOrder.setOnAction(e -> clic_edit_order());
        editOrder.setPrefHeight(40.0);
        editOrder.setPrefWidth(260.0);
        editOrder.getStylesheets().add(style);
        editOrder.setTextFill(Color.WHITE);
        editOrder.setPadding(new Insets(0, 0, 0, 80.0));
        editOrder.setFont(new Font(14.0));
        arrayButtons.add(editOrder);

        setSubSession(relativeIndex,arrayButtons,StatusSubMenu.subsessionCostumersIsOpen);
    }

    public void changeStatus() {
        if(StatusSubMenu.subsessionCostumersIsOpen){
            StatusSubMenu.subsessionCostumersIsOpen = false;
        } else {
            StatusSubMenu.subsessionCostumersIsOpen = true;
        }
    }
}
