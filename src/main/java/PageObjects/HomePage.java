package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public SelenideElement signIN = $(".login");
    public SelenideElement bestSellers = $(".blockbestsellers");
    public SelenideElement dresses = $$(byTitle("Dresses")).get(1);
    public SelenideElement eveningDresses = $$(byTitle("Evening Dresses")).get(1);
}
