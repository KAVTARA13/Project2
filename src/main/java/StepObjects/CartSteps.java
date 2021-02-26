package StepObjects;

import PageObjects.CartPage;

public class CartSteps {

    CartPage cartPage;

    public CartSteps(){
        cartPage = new CartPage();
    }

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
    public void moveCustomerSupport(){

        cartPage.customerSupportLink.click();
    }
}
