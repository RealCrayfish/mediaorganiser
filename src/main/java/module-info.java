module com.skathieastrid.mediaorganiser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.skathieastrid.mediaorganiser to javafx.fxml;
    exports com.skathieastrid.mediaorganiser;
}