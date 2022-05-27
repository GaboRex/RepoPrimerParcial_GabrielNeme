module com.example.repoprimerparcial_gabrielneme {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repoprimerparcial_gabrielneme to javafx.fxml;
    exports com.example.repoprimerparcial_gabrielneme;
}