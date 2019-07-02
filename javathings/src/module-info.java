module javathings {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires java.sql;

    exports com.company;
    opens com.company to javafx.fxml;
}