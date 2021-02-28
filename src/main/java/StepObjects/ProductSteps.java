package StepObjects;

import DataObjects.ProductData;
import PageObjects.ProductPage;

public class ProductSteps {

    ProductPage productPage;
    ProductData productData;

    public ProductSteps(){
        productPage = new ProductPage();
        productData = new ProductData();
    }

    public void setProductTitle(){

        productData.setTitle(productPage.redirectProductTitle.text());
    }

    public String getProductTitle(){

        return productData.redirectTitle;
    }

    public void clickSendFriend(){

        productPage.sendFriendButton.click();
    }

    public void addQuantity(){

        productPage.plus.click();
    }

    public void selectSize(String size){

        productPage.sizeDrop.selectOption(size);
    }

    public void addToCart(){

        productPage.addToCartButton.click();
    }
}
