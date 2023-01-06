
// ADMIN POST AD CONTROLLER CLASS

package hellofx;

import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Control8 implements Initializable{
    //GUI ATTRIBUTES
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private TableColumn<HouseData, String> HouseNO_Column;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Label L5;

    @FXML
    private TableColumn<HouseData, String> Location_Column;

    @FXML
    private TableColumn<HouseData, String> Marla_Column;

    @FXML
    private TableColumn<HouseData, String> OwnerName_Column;

    @FXML
    private TableColumn<HouseData, String> Price_Column;

    @FXML
    private TableView<HouseData> Table;

    // METHOD
    void ChangeLabel(String location,String ownerName,String HouseNO,String Marla,String Price){
        L1.setText(location);
        L2.setText(ownerName);
        L3.setText(HouseNO);
        L4.setText(Marla);
        L5.setText(Price);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Location_Column.setCellValueFactory(new PropertyValueFactory<HouseData,String>("Location"));
        OwnerName_Column.setCellValueFactory(new PropertyValueFactory<HouseData,String>("OwnerName"));
        HouseNO_Column.setCellValueFactory(new PropertyValueFactory<HouseData,String>("HouseNO"));
        Marla_Column.setCellValueFactory(new PropertyValueFactory<HouseData,String>("Marla"));
        Price_Column.setCellValueFactory(new PropertyValueFactory<HouseData,String>("Price"));
    }

    @FXML
    void Close_BUTTON(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void Go_Back_BTN(ActionEvent event) throws Exception{
        root=FXMLLoader.load(getClass().getResource("Admin_Module.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void POST_BTN(ActionEvent event) {
        try{
            FileWriter w=new FileWriter("House_Data.txt",true);
            w.write(L1.getText()+"\n");
            w.write(L2.getText()+"\n");
            w.write(L3.getText()+"\n");
            w.write(L4.getText()+"\n");
            w.write(L5.getText()+"\n");
            w.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        HouseData object=new HouseData(L1.getText(), L2.getText(), L3.getText(), L4.getText(), L5.getText());
        ObservableList<HouseData> list=Table.getItems();
        list.add(object);
        Table.setItems(list);
    }

}
