package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actionTarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actionTarget.setText("Sign in button pressed");
        actionTarget.setFill(Color.RED);
    }
}
