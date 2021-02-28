package StepObjects;

import PageObjects.CartPage;
import io.qameta.allure.Step;

public class CartSteps {

    CartPage cartPage;

    public CartSteps(){
        cartPage = new CartPage();
    }

    @Step("checkout process")
    public void moveCheckout(){

        cartPage.proceedToCheckoutBtn.click();
    }
    public void secondMoveCheckout(){

        cartPage.secondProceedToCheckoutBtn.click();
    }
    public void processAddress(){

        cartPage.proceedAddress.click();
    }
    public void agreeTermsOfService(){

        cartPage.termsOfServiceBtn.click();
    }
    public void processCarrier(){

        cartPage.processCarrier.click();
    }
    public void processPayment(){

        cartPage.payByBankWireBtn.click();
    }
    public void confirmOrder(){

        cartPage.confirmOrderBtn.click();
    }
    @Step("move customer support link")
    public void moveCustomerSupport(){

        cartPage.customerSupportLink.click();
    }
}
