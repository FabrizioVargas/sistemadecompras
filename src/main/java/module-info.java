module vallegrande.sistemadecontrol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens vallegrande.sistemadecontrol to javafx.fxml;
    exports vallegrande.sistemadecontrol;
}