
// SIGN-UP PAGE CONTROLLER CLASS

package hellofx;

import java.io.FileWriter;
import java.io.IOException;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Control2 {
    //GUI ATTRIBUTES
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private JFXTextField SignUp_Name_Textfield;
    
    @FXML
    private Label label;

    @FXML
    private JFXTextField SignUp_Password_Textfield2;

    @FXML
    void BUTTON_Create_acc(ActionEvent event) {
        String name=SignUp_Name_Textfield.getText();
        String password=SignUp_Password_Textfield2.getText();
        try{
            FileWriter w=new FileWriter("Users_Data.txt",true);
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
    void BUTTON_GoBack(ActionEvent event) throws IOException {
        root=FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void BUTTON_Admin_SignUp(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("Admin_SignUp.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void Close_BUTTON(ActionEvent event) {
        System.exit(0);
    }

}
