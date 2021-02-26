package StepObjects;

import PageObjects.DressesPage;

public class DressesSteps {
    DressesPage dressesPage;

    public DressesSteps(){
        dressesPage = new DressesPage();
    }
    public void hoverProduct(){
        dressesPage.product.hover();
    }
    public void clickMoreButton(){
        dressesPage.moreButton.click();
    }
}
