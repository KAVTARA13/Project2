package DataObjects;

public class RegistrationData {
    int min = 1;
    int max = 10000;
    public String UserID =""+(int)(Math.random() * (max - min + 1) + min);
    public String email = "User"+UserID+"@gamil.com";
    public String firstName = "Luka";
    public String lastName = "Userlastname";
    public String password = "12345678";
    public String country = "United States";
    public String address = "test123";
    public String city = "testcity";
    public String state = "New York";
    public int zip = 10020;
    public String phone = "1234561234";
}
