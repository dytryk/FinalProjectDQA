module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.FinalProjectDQA to javafx.fxml;
    exports com.example.FinalProjectDQA;
}