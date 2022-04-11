module com.example.morejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morejavafx to javafx.fxml;
    exports com.example.morejavafx;
}