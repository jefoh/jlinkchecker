module jefoh.jlinkchecker {
    requires javafx.controls;
    requires javafx.fxml;

    opens jefoh.jlinkchecker to javafx.fxml;
    exports jefoh.jlinkchecker;
}
