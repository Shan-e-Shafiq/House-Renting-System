
// User Module MAIN MENU CONTROLLER CLASS

package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Control5 {
    //GUI ATTRIBUTES
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    void Change_password_BTN(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("Change_Password.fxml"));
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

    @FXML
    void Go_Back_BTN(ActionEvent event) throws Exception{
        Control2 object=new Control2();
        object.BUTTON_GoBack(event);
    }

    @FXML
    void Search_House_BTN(ActionEvent event) throws Exception {
        root=FXMLLoader.load(getClass().getResource("Search_Houses.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Upload_House_Ad_BTN(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("Post_Ad.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void View_Houses_info_BTN(ActionEvent event) throws Exception {
        root=FXMLLoader.load(getClass().getResource("View_Houses.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}

