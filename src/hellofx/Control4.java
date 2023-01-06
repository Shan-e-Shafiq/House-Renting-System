
// ADMIN-SIGN-up PAGE CONTROLLER CLASS

package hellofx;

import java.io.FileWriter;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Control4 {

    @FXML
    private JFXTextField SignUp_Name_Textfield;

    @FXML
    private JFXTextField SignUp_Password_Textfield2;

    @FXML
    private Label label;

    @FXML
    void BUTTON_Create_acc(ActionEvent event) {
        String name=SignUp_Name_Textfield.getText();
        String password=SignUp_Password_Textfield2.getText();
        try{
            FileWriter w=new FileWriter("Admin_Data.txt",true);
            w.write(name+"@gmail.com"+"\n");
            w.write(password+"\n");
            w.close();
            label.setTextFill(Color.BLUE);
            label.setText("Account Created Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void BUTTON_GoBack(ActionEvent event) throws Exception{
        Control2 object=new Control2();
        object.BUTTON_GoBack(event);
    }

    @FXML
    void Close_BUTTON(ActionEvent event) {
        System.exit(0);
    }

}
