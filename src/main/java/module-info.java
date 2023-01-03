module com.example.musicmemerygame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.musicmemerygame to javafx.fxml;
    exports com.example.musicmemerygame;
}