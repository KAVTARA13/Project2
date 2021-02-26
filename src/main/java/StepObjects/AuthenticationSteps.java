package StepObjects;

import PageObjects.AuthenticationPage;

public class AuthenticationSteps {
    AuthenticationPage authenticationObjects;

    public AuthenticationSteps(){
        authenticationObjects = new AuthenticationPage();
    }

    public void enterEmailToCreate(String email){
        authenticationObjects.emailCreateField.sendKeys(email);
    }

    public void clickCreateAccount(){
        authenticationObjects.emailCreateButton.click();
    }
}
