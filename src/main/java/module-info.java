module com.manieri.projetosequoia {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires com.fasterxml.jackson.databind;

    exports com.manieri.projetosequoia;
    exports com.manieri.projetosequoia.ui.mainmenu;
    exports com.manieri.projetosequoia.ui.costumers;
    exports com.manieri.projetosequoia.model;


    //Open files to acess framwrok
    opens com.manieri.projetosequoia.model to com.fasterxml.jackson.databind;

    opens com.manieri.projetosequoia to javafx.fxml;
    opens com.manieri.projetosequoia.ui.mainmenu to javafx.fxml;
    opens com.manieri.projetosequoia.ui.costumers to javafx.fxml;

}