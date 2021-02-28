package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BestSellersPage {
    public SelenideElement discountProducts = $("#blockbestsellers").$(".price-percent-reduction").parent().parent().parent().parent();
    public SelenideElement moreButton = discountProducts.find(byTitle("View"));
    public SelenideElement productTitle = discountProducts.find(byClassName("product-name"));
}