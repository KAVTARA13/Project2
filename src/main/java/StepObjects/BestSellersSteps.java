package StepObjects;

import DataObjects.BestSellersData;
import PageObjects.BestSellersPage;

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
