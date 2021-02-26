package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;

public class DressesPage {
    public SelenideElement product =  $(".product-container");
    public SelenideElement moreButton = $(byTitle("View"));
}
