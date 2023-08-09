module com.danial.javadentalfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.danial.javadentalfx to javafx.fxml;
    exports com.danial.javadentalfx;
}