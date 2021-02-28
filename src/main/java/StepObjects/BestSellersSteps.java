package StepObjects;

import DataObjects.BestSellersData;
import PageObjects.BestSellersPage;
import io.qameta.allure.Step;

public class BestSellersSteps {
    BestSellersPage bestSellersPage;
    BestSellersData bestSellersData;

    public BestSellersSteps(){
        bestSellersPage = new BestSellersPage();
        bestSellersData = new BestSellersData();
    }

    public void scrollDiscountProducts(){
        bestSellersPage.discountProducts.scrollTo();
    }

    public void hoverDiscountProducts(){
        bestSellersPage.discountProducts.hover();
    }

    @Step("show discount product")
    public void clickMoreButton(){
        bestSellersPage.moreButton.click();
    }

    public void setProductTitle(){

        bestSellersData.setTitle(bestSellersPage.productTitle.text());
    }

    public String getProductTitle(){

        return bestSellersData.title;
    }
}
