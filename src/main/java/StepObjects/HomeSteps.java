package StepObjects;

import PageObjects.HomePage;

public class HomeSteps {

    HomePage homeObjects;

    public HomeSteps(){
        homeObjects = new HomePage();
    }

    public void clickSignIn(){
        homeObjects.signIN.click();
    }

    public void clickBestSellers(){
        homeObjects.bestSellers.click();
    }

    public void hoverDresses(){
        homeObjects.dresses.hover();
    }
    public void clickEveningDresses(){
        homeObjects.eveningDresses.click();
    }
}
