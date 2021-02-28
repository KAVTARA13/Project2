package StepObjects;

import PageObjects.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationSteps {

    RegistrationPage registrationPage;

    public RegistrationSteps(){
        registrationPage = new RegistrationPage();
    }

    @Step("register with firstname: {0}")
    public void enterFirstName(String firstName){

        registrationPage.firstName.sendKeys(firstName);
    }
    @Step("register with lastname: {0}")
    public void enterLastName(String lastName){

        registrationPage.lastName.sendKeys(lastName);
    }
    @Step("register with phone: {0}")
    public void enterPhone(String phone){

        registrationPage.phone.sendKeys(phone);
    }
    @Step("register with password: {0}")
    public void enterPassword(String password){

        registrationPage.password.sendKeys(password);
    }
    @Step("register with address: {0}")
    public void enterAdress(String adress){

        registrationPage.adress.sendKeys(adress);
    }
    @Step("register with city: {0}")
    public void enterCity(String city){

        registrationPage.city.sendKeys(city);
    }
    @Step("register with country: {0}")
    public void enterCountry(String country){

        registrationPage.country.selectOptionContainingText(country);
    }
    @Step("register with state: {0}")
    public void enterState(String state){

        registrationPage.state.selectOptionContainingText(state);
    }
    @Step("register with zip: {0}")
    public void enterZip(String zip){

        registrationPage.zip.sendKeys(zip);
    }
    public void clickRegister(){

        registrationPage.registrationButton.click();
    }
}
