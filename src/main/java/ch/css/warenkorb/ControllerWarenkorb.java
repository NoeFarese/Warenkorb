package ch.css.warenkorb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.LinkedList;

public class ControllerWarenkorb {
    private LinkedList<OrderItem> items;

    @FXML
    private ListView cartListView;

    @FXML
    private Stage stage;

    @FXML
    private void onButtonCancelClick() {
        stage.close();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setItems(LinkedList<OrderItem> items) {
        this.items = items;

        for (OrderItem item : this.items) {
            cartListView.getItems().add(item.getAmount() + "\t" + item.getProductName());
        }
    }

    public void onButtonWarenkorbHinzufuegen(ActionEvent actionEvent) {
    }

    public void onHyperlinkWarenkorb(ActionEvent actionEvent) {
    }
}
