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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Control12 implements Initializable{

    @FXML
    private TextField City_Textfield;

    @FXML
    private TableColumn<HouseData, String> HouseNO_Column;

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
    void Go_Back_to_Main_BTN(ActionEvent event) throws Exception{
        Control7 object=new Control7();
        object.Go_Back_BTN(event);
    }

    @FXML
    void SEARCH_BTN(ActionEvent event) {
        int i=0;
        String Reading_String=City_Textfield.getText();
        String str1="";
        String str2="";
        String str3="";
        String str4="";
        String str5="";
        try{
            Scanner s=new Scanner("House_Data.txt");
            while(s.hasNextLine()){
                str1=Files.readAllLines(Paths.get("House_Data.txt")).get(i);
                if(str1.equals(Reading_String)){
                    str2=Files.readAllLines(Paths.get("House_Data.txt")).get(i+1);
                    str3=Files.readAllLines(Paths.get("House_Data.txt")).get(i+2);
                    str4=Files.readAllLines(Paths.get("House_Data.txt")).get(i+3);
                    str5=Files.readAllLines(Paths.get("House_Data.txt")).get(i+4);
                    HouseData object=new HouseData(str1, str2, str3, str4, str5);
                    ObservableList<HouseData> list=Table.getItems();
                    list.add(object);
                    Table.setItems(list);
                }
                i+=5;
            }
            s.close();
        }catch(Exception e){

        }


    }

}
