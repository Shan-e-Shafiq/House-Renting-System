
// ADD/ DELETE USERS CONTROLLER CLASS

package hellofx;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Control9 implements Initializable{

    @FXML
    private TableColumn<UsersData,String> Passwords_Column;

    @FXML
    private TableView<UsersData> Table;

    @FXML
    private TableColumn<UsersData, String> Username_Column;

    @FXML
    void Close_BUTTON(ActionEvent event) {
        System.exit(0);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Username_Column.setCellValueFactory(new PropertyValueFactory<UsersData,String>("Username"));
        Passwords_Column.setCellValueFactory(new PropertyValueFactory<UsersData,String>("Password"));
    }

    @FXML
    void Delete_BTN(ActionEvent event) {
        int selectId=Table.getSelectionModel().getSelectedIndex();
        Table.getItems().remove(selectId);
    }

    @FXML
    void Go_Back_to_Main_BTN(ActionEvent event) throws Exception{
        Control8 object=new Control8();
        object.Go_Back_BTN(event);
    }

    @FXML
    void Show_Users_BTN(ActionEvent event) throws Exception {
        int i=0;
        int j=1;
        String str="";
        String str2="";
        try{
            Scanner s=new Scanner("Users_Data.txt");
            while(s.hasNextLine()){
                str=Files.readAllLines(Paths.get("Users_Data.txt")).get(i);
                str2=Files.readAllLines(Paths.get("Users_Data.txt")).get(j);
                UsersData object=new UsersData(str, str2);
                ObservableList<UsersData> list=Table.getItems();
                list.add(object);
                Table.setItems(list);
                i+=2;
                j+=2;
            }
            s.close();
        }catch(Exception e){

        }

    }

}

