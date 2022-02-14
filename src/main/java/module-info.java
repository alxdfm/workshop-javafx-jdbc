module com.application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application to javafx.fxml;
    exports com.application;
    exports com.gui;
    opens com.gui to javafx.fxml;
}