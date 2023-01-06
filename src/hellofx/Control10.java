
// CHANGE PASSWORD CONTROLLER CLASS

package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Control10 {

    @FXML
    private Label label;

    @FXML
    void Change_Password_BTN(ActionEvent event) {
        label.setTextFill(Color.BLUE);
        label.setText("Password changed successfully");
    }

    @FXML
    void Close_BUTTON(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void Go_Back_BTN(ActionEvent event) throws Exception{
        Control2 objControl2=new Control2();
        objControl2.BUTTON_GoBack(event);
    }

}
