package com.manieri.projetosequoia.ui.mainmenu.sideBarSelections;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Objects;

import static com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerSubMenu.StatusSubMenu.subsessionCostumersIsOpen;
import static com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerSubMenu.StatusSubMenu.subsessionOrderIsOpen;

public class ControllerSubMenu {

    private VBox vboxMainMenu;

    public ControllerSubMenu(VBox vboxMainMenu) {
        this.vboxMainMenu = vboxMainMenu;
    }

    String style = Objects.requireNonNull(getClass().getResource("/com/manieri/projetosequoia/css/fullpackstyling.css")).toExternalForm();

    private final VBox subSessionVBox = new VBox(0);

    static class StatusSubMenu {

        static Boolean subsessionOrderIsOpen = true;
        static Boolean subsessionCostumersIsOpen = true;
        static Boolean subsessionRulesIsOpen = true;
        static Boolean subsessionSettingsIsOpen = false;

    }

    void setSubSession(int relativeIndex, ArrayList<Button> listbuttons, Boolean subsessionIsOpen) {

        if (!subsessionOrderIsOpen && relativeIndex > 3){
            relativeIndex = relativeIndex + 1;
            System.out.println("passou pelo primeiro if");
            System.out.println(relativeIndex);
        }
        if(!subsessionCostumersIsOpen && relativeIndex > 3){
            relativeIndex = relativeIndex + 1;
            System.out.println("passou pelo segundo if");
            System.out.println(relativeIndex);
        } else if (!subsessionCostumersIsOpen && !subsessionOrderIsOpen){
            relativeIndex = relativeIndex + 3;
            System.out.println("passou pelo terceiro if");
            System.out.println(relativeIndex);
        } else if (!subsessionCostumersIsOpen && relativeIndex > 4) {
            relativeIndex = relativeIndex + 2;
            System.out.println("passou pelo quarto if");
            System.out.println(relativeIndex);
        }

        if (!subsessionIsOpen) {

            vboxMainMenu.getChildren().add(relativeIndex, subSessionVBox);
            subSessionVBox.setPadding(new Insets(0));
            subSessionVBox.getChildren().addAll(listbuttons);

        } else {
            vboxMainMenu.getChildren().remove(relativeIndex);

        }

        relativeIndex = 0;
    }

    @FXML
    protected void clic_new_order() {
        System.out.println("New order");
    }

    @FXML
    void clic_edit_order() {
        System.out.println("Edit order");
    }

}
