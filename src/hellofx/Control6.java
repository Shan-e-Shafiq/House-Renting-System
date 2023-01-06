
// ADMIN-MODULE CONTROLLER CLASS

package hellofx;

import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Control6{
    //GUI ATTRIBUTES
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    void Change_Password_BTN(ActionEvent event) throws Exception{
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
    void View_House_Ad_BTN(ActionEvent event) throws Exception{
        String str1=Files.readAllLines(Paths.get("Requests.txt")).get(0);
        String str2=Files.readAllLines(Paths.get("Requests.txt")).get(1);
        String str3=Files.readAllLines(Paths.get("Requests.txt")).get(2);
        String str4=Files.readAllLines(Paths.get("Requests.txt")).get(3);
        String str5=Files.readAllLines(Paths.get("Requests.txt")).get(4);
        FXMLLoader loader=new FXMLLoader(getClass().getResource("Admin_Post_Ad.fxml"));
        root=loader.load();
        Control8 object=loader.getController();
        object.ChangeLabel(str1, str2, str3, str4, str5);
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void View_Users_BTN(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("Admin_users.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

}
