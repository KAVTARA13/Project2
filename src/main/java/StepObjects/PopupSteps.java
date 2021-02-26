package StepObjects;

import PageObjects.PopupPage;

public class PopupSteps {
    PopupPage popupPage;

    public PopupSteps(){
        popupPage = new PopupPage();
    }

    public void enterName(String name){
        popupPage.friendName.sendKeys(name);
    }
    public void enterEmail(String email){
        popupPage.friendEmail.sendKeys(email);
    }
}
