package StepObjects;

import PageObjects.RegistrationPage;

public class RegistrationSteps {

    RegistrationPage registrationPage;

    public RegistrationSteps(){
        registrationPage = new RegistrationPage();
    }

    public void enterFirstName(String firstName){

        registrationPage.firstName.sendKeys(firstName);
    }
    public void enterLastName(String lastName){

        registrationPage.lastName.sendKeys(lastName);
    }
    public void enterPhone(String phone){

        registrationPage.phone.sendKeys(phone);
    }
    public void enterPassword(String password){

        registrationPage.password.sendKeys(password);
    }
    public void enterAdress(String adress){

        registrationPage.adress.sendKeys(adress);
    }
    public void enterCity(String city){

        registrationPage.city.sendKeys(city);
    }
    public void enterCountry(String country){

        registrationPage.country.selectOptionContainingText(country);
    }
    public void enterState(String state){

        registrationPage.state.selectOptionContainingText(state);
    }
    public void enterZip(String zip){

        registrationPage.zip.sendKeys(zip);
    }
    public void clickRegister(){

        registrationPage.registrationButton.click();
    }
}
