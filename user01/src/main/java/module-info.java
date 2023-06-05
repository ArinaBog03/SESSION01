module com.example.user01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.user01 to javafx.fxml;
    exports com.example.user01;
}