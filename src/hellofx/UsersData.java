package hellofx;

public class UsersData {
    private String Username;
    private String Password;
    //constructor
    public UsersData(String Username,String Password){
        this.Username=Username;
        this.Password=Password;
    }
    //getters
    public String getPassword() {
        return Password;
    }public String getUsername() {
        return Username;
    }
}
