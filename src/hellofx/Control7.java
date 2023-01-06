
// HOUSE AD REQUEST CONTROLLER CLASS

package hellofx;

import java.io.FileWriter;

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

public class Control7 {
    //GUI ATTRIBUTES
    Parent root;
    Stage stage;
    Scene scene;
    
    @FXML
    private Label label;

    @FXML
    private JFXTextField HouseNO_textfield;

    @FXML
    private JFXTextField Location_textfield;

    @FXML
    private JFXTextField Marla_textfield;

    @FXML
    private JFXTextField OwnerName_textfield;

    @FXML
    private JFXTextField Price_textfield;

    @FXML
    void Close_BUTTON(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void Go_Back_BTN(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("UserOptions.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Post_Req_BTN(ActionEvent event) {
        try{
            FileWriter w=new FileWriter("Requests.txt");
            w.write(Location_textfield.getText()+"\n");
            w.write(OwnerName_textfield.getText()+"\n");
            w.write(HouseNO_textfield.getText()+"\n");
            w.write(Marla_textfield.getText()+"\n");
            w.write(Price_textfield.getText()+"\n");
            w.close();
            label.setTextFill(Color.BLUE);
            label.setText("Ad Request Send to Admin");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
