package StepObjects;

import PageObjects.DressesPage;
import io.qameta.allure.Step;

public class DressesSteps {
    DressesPage dressesPage;

    public DressesSteps(){
        dressesPage = new DressesPage();
    }
    public void hoverProduct(){
        dressesPage.product.hover();
    }
    @Step("show dress")
    public void clickMoreButton(){
        dressesPage.moreButton.click();
    }
}
