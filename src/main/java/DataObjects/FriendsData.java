package DataObjects;

import org.testng.annotations.DataProvider;

public class FriendsData {
    @DataProvider(name = "Friends")
    public Object[][] getData() {
        Object[][] data = {{"Luka", "luka.Kavtaradze@gmail.com"}, {"Vika", "vika.Avalishvili@gmail.com"}};
        return data;
    }
}
