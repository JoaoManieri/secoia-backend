module com.manieri.projetosequoia {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires com.calendarfx.view;

    opens com.manieri.projetosequoia to javafx.fxml;
    exports com.manieri.projetosequoia;
    exports com.manieri.projetosequoia.ui.mainmenu;

}