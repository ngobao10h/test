module com.mycompany.abc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.abc to javafx.fxml;
    exports com.mycompany.abc;
}
