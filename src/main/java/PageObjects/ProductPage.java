package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public SelenideElement redirectProductTitle =  $(byAttribute("itemprop" ,"name"));
    public SelenideElement sendFriendButton =  $("#send_friend_button");
    public SelenideElement plus =  $(".icon-plus");
    public SelenideElement sizeDrop =  $("#group_1");
    public SelenideElement addToCartButton =  $(byName("Submit"));
}
