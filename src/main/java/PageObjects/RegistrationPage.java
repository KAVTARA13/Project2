package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public SelenideElement firstName = $("#customer_firstname");
    public SelenideElement lastName = $("#customer_lastname");
    public SelenideElement phone = $("#phone_mobile");
    public SelenideElement password = $("#passwd");
    public SelenideElement adress = $("#address1");
    public SelenideElement country = $("#id_country");
    public SelenideElement state = $("#id_state");
    public SelenideElement city = $("#city");
    public SelenideElement zip = $("#postcode");
    public SelenideElement registrationButton = $("#submitAccount");
}
