module ch.css.warenkorb {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.css.warenkorb to javafx.fxml;
    exports ch.css.warenkorb;
}