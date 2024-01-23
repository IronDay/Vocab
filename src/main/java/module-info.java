module org.weller.vocab {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.weller.vocab to javafx.fxml;
    exports org.weller.vocab;
    exports org.weller.vocab.controller;
    opens org.weller.vocab.controller to javafx.fxml;
}