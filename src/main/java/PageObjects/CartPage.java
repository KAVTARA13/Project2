package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement proceedToCheckoutBtn =  $(byTitle("Proceed to checkout"));
    public SelenideElement secondProceedToCheckoutBtn =  $("#columns").$(byTitle("Proceed to checkout"));
    public SelenideElement proceedAddress =  $(byName("processAddress"));
    public SelenideElement termsOfServiceBtn =  $("#cgv");
    public SelenideElement processCarrier =  $(byName("processCarrier"));
    public SelenideElement payByBankWireBtn =  $(byTitle("Pay by bank wire"));
    public SelenideElement confirmOrderBtn =  $(byText("I confirm my order"));
    public SelenideElement customerSupportLink =  $(byText("expert customer support team."));
}
