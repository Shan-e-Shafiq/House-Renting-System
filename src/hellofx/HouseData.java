package hellofx;

public class HouseData {
    private String Location;
    private String OwnerName;
    private String HouseNO;
    private String Marla;
    private String Price;
    //constructor
    public HouseData(String Location,String OwnerName,String HouseNO,String Marla,String Price){
        this.Location=Location;
        this.OwnerName=OwnerName;
        this.HouseNO=HouseNO;
        this.Marla=Marla;
        this.Price=Price;
    }
    //getters
    public String getHouseNO() {
        return HouseNO;
    }public String getLocation() {
        return Location;
    }public String getMarla() {
        return Marla;
    }public String getOwnerName() {
        return OwnerName;
    }public String getPrice() {
        return Price;
    }
}
