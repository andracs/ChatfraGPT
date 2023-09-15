module com.example.chatfragpt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chatfragpt to javafx.fxml;
    exports com.example.chatfragpt;
}