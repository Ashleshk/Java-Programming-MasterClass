module MusicUI.Application {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    opens sample.model;
    opens sample;
}