module com.manieri.projetosequoia {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    exports com.manieri.projetosequoia;
    exports com.manieri.projetosequoia.ui.mainmenu;


    //Open files to acess framwrok
    opens com.manieri.projetosequoia to javafx.fxml;
    opens com.manieri.projetosequoia.ui.mainmenu to javafx.fxml;

}