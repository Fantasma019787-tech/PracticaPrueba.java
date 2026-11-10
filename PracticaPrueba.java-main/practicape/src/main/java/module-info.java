module com.fernandomadrid.practicape {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;


    opens com.fernandomadrid.practicape to javafx.fxml;
    exports com.fernandomadrid.practicape;
    opens com.fernandomadrid.practicape.controller to javafx.fxml;
}