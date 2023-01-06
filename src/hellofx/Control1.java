
// SIGN-IN PAGE CONTROLLER CLASS

package hellofx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Control1 {
    //GUI ATTRIBUTES
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private JFXPasswordField Password_textfield;

    @FXML
    private Label Record_Caution_Label;

    @FXML
    private JFXTextField Username_Textfield;

    @FXML
    void BUTTON_SignIn(ActionEvent event) throws IOException {
        int i=0;
        int j=1;
        String Reading_String="";
        String Username=Username_Textfield.getText();
        String Password=Password_textfield.getText();
        //           Username Check
        try{
            while(true){
                Reading_String=Files.readAllLines(Paths.get("Users_Data.txt")).get(i);
                if(Reading_String.equals(Username)){
                    break;
                }
                i++;
            }
        }catch(IndexOutOfBoundsException e){
            Record_Caution_Label.setTextFill(Color.BLUE);
            Record_Caution_Label.setText("Record not Found :(");
        }
        //          Password check
        try{
            while(true){
                Reading_String=Files.readAllLines(Paths.get("Users_Data.txt")).get(j);
                if(Reading_String.equals(Password)){
                    break;
                }
                j++;
            }
        }catch(IndexOutOfBoundsException e){
            Record_Caution_Label.setTextFill(Color.BLUE);
            Record_Caution_Label.setText("Incorrect Password :(");
        }
        try{
            root=FXMLLoader.load(getClass().getResource("UserOptions.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void BUTTON_SignUp(ActionEvent event) throws Exception {
        root=FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void BUTTON_Admin_SignIn(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("Admin_SignIn.fxml"));
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
