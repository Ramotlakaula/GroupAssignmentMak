module com.example.groupassignmentmak {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.example.groupassignmentmak to javafx.fxml;
    exports com.example.groupassignmentmak;
}