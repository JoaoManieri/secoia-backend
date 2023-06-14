package com.manieri.projetosequoia.ui.mainmenu.sideBarSelections;

import com.manieri.projetosequoia.LoginStartAplication;
import com.manieri.projetosequoia.ui.mainmenu.MainMenuController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static com.manieri.projetosequoia.ui.mainmenu.sideBarSelections.ControllerSubMenu.StatusSubMenu.*;

public class ControllerSubMenu extends MainMenuController {

    private VBox vboxMainMenu;

    public ControllerSubMenu(VBox vboxMainMenu, TabPane tabPane) {
        super();
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

        int finalIndex = 0;

        if (!subsessionOrderIsOpen && relativeIndex > 2) {
            finalIndex = finalIndex + 1;
        }
        if (!subsessionCostumersIsOpen && relativeIndex > 3) {
            finalIndex = finalIndex + 1;
        }
        if (!subsessionRulesIsOpen && relativeIndex > 4) {
            finalIndex = finalIndex + 1;
        }
        finalIndex = finalIndex + relativeIndex;

        if (!subsessionIsOpen) {

            vboxMainMenu.getChildren().add(finalIndex, subSessionVBox);
            subSessionVBox.setPadding(new Insets(0));
            subSessionVBox.getChildren().addAll(listbuttons);

        } else {
            vboxMainMenu.getChildren().remove(finalIndex);

        }

        finalIndex = 0;
    }
}
