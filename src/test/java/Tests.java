import DataObjects.BestSellersData;
import DataObjects.FriendsData;
import DataObjects.MessageData;
import DataObjects.RegistrationData;
import PageObjects.PopupPage;
import StepObjects.*;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.codeborne.selenide.Selenide.open;

@Listeners({AllureListener.class})
@Epic("insert/register user, buy discount product, send product friend, send report")
public class Tests extends BaseSteps {
    RegistrationData registrationData;
    BestSellersData bestSellersData;
    HomeSteps homeSteps;
    AuthenticationSteps authenticationSteps;
    RegistrationSteps registrationSteps;
    Database database;
    BestSellersSteps bestSellersSteps;
    ProductSteps productSteps;
    PopupPage popupPage;
    PopupSteps popupSteps;
    CartSteps cartSteps;
    DressesSteps dressesSteps;
    CustomerServiceSteps customerServiceSteps;
    MessageData messageData;

    public Tests(){
        super();
        initialization();
        homeSteps = new HomeSteps();
        authenticationSteps = new AuthenticationSteps();
        registrationData = new RegistrationData();
        bestSellersData = new BestSellersData();
        registrationSteps = new RegistrationSteps();
        database = new Database();
        bestSellersSteps = new BestSellersSteps();
        productSteps = new ProductSteps();
        popupPage = new PopupPage();
        popupSteps = new PopupSteps();
        cartSteps = new CartSteps();
        dressesSteps = new DressesSteps();
        customerServiceSteps = new CustomerServiceSteps();
        messageData = new MessageData();
    }

    @Story("User registration")
    @Test(description = "User registration")
    @Description("User registration")
    public void userRegistration() throws SQLException {
        database.insertUser(registrationData.firstName,registrationData.lastName,registrationData.phone,registrationData.password,registrationData.address,registrationData.email,registrationData.state,registrationData.city,registrationData.zip);
        open("/index.php");
        homeSteps.clickSignIn();
        ResultSet user = database.selectUser();
        while (user.next()) {
            authenticationSteps.enterEmailToCreate(user.getString("email"));
            authenticationSteps.clickCreateAccount();
            registrationSteps.enterFirstName(user.getString("firstName"));
            registrationSteps.enterLastName(user.getString("lastName"));
            registrationSteps.enterPassword(user.getString("password"));
            registrationSteps.enterPhone(user.getString("phone"));
            registrationSteps.enterAdress(user.getString("address"));
            registrationSteps.enterCity(user.getString("city"));
            registrationSteps.enterCountry(registrationData.country);
            registrationSteps.enterState(user.getString("state"));
            registrationSteps.enterZip(user.getString("zip"));
            registrationSteps.clickRegister();
        }
    }

    @Feature("test from Resgression1 group")
    @Story("Send friends discount product")
    @Description("Send friends discount product")
    @Test(dataProviderClass = FriendsData.class, dataProvider = "Friends",groups = {"Resgression1"},description = "Send friends product")
    public void sendFriends(String name,String email){
        open("/index.php");
        homeSteps.clickBestSellers();
        bestSellersSteps.scrollDiscountProducts();
        bestSellersSteps.hoverDiscountProducts();
        bestSellersSteps.setProductTitle();
        bestSellersSteps.clickMoreButton();
        productSteps.setProductTitle();
        Assert.assertEquals(bestSellersSteps.getProductTitle(),productSteps.getProductTitle());
        productSteps.clickSendFriend();
        Assert.assertTrue(popupPage.popupWindow.isDisplayed());
        popupSteps.enterName(name);
        popupSteps.enterEmail(email);
        }

    @Feature("test from Regression2 group")
    @Story("Buy 2 M size discount product")
    @Description("Buy 2 M size discount product")
    @Test(dependsOnMethods = "userRegistration" ,groups = {"Regression2"},description = "Buy discount products")
    public void buyProduct(){
        open("/index.php");
        homeSteps.clickBestSellers();
        bestSellersSteps.scrollDiscountProducts();
        bestSellersSteps.hoverDiscountProducts();
        bestSellersSteps.setProductTitle();
        bestSellersSteps.clickMoreButton();
        productSteps.setProductTitle();
        Assert.assertEquals(bestSellersSteps.getProductTitle(),productSteps.getProductTitle());
        productSteps.addQuantity();
        productSteps.selectSize("M");
        productSteps.addToCart();
        cartSteps.moveCheckout();
        cartSteps.secondMoveCheckout();
        cartSteps.processAddress();
        cartSteps.agreeTermsOfService();
        cartSteps.processCarrier();
        cartSteps.processPayment();
        cartSteps.confirmOrder();
    }

    @Feature("test from Regression2 group")
    @Feature("add product tests")
    @Story("Buy dress and send report")
    @Description("Buy dress and send report")
    @Test(dependsOnMethods = "userRegistration",retryAnalyzer = MyRetry.class,groups = {"Regression2"},description = "Buy dress and send report")
    public void sendReport(){
        open("/index.php");
        homeSteps.hoverDresses();
        homeSteps.clickEveningDresses();
        dressesSteps.hoverProduct();
        dressesSteps.clickMoreButton();
        productSteps.addToCart();
        cartSteps.moveCheckout();
        cartSteps.secondMoveCheckout();
        cartSteps.processAddress();
        cartSteps.agreeTermsOfService();
        cartSteps.processCarrier();
        cartSteps.processPayment();
        cartSteps.confirmOrder();
        cartSteps.moveCustomerSupport();
        customerServiceSteps.selectHeading();
        customerServiceSteps.selectOrder();
        customerServiceSteps.sendMessage(messageData.message);
        customerServiceSteps.attachFile();
        customerServiceSteps.sendReport();
    }

}