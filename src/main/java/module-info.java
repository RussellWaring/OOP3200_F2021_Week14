module ca.durhamcollege.oop3200_f2021_week14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ca.durhamcollege.oop3200_f2021_week14 to javafx.fxml;
    exports ca.durhamcollege.oop3200_f2021_week14;
}