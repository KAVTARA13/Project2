package StepObjects;

import PageObjects.AuthenticationPage;
import io.qameta.allure.Step;

public class AuthenticationSteps {
    AuthenticationPage authenticationObjects;

    public AuthenticationSteps(){
        authenticationObjects = new AuthenticationPage();
    }

    @Step("register with email: {0}")
    public void enterEmailToCreate(String email){
        authenticationObjects.emailCreateField.sendKeys(email);
    }

    public void clickCreateAccount(){
        authenticationObjects.emailCreateButton.click();
    }
}
