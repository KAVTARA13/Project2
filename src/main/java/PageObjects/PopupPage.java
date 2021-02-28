package PageObjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class PopupPage {
    public SelenideElement popupWindow =  $(".fancybox-outer");
    public SelenideElement friendName =  $("#friend_name");
    public SelenideElement friendEmail =  $("#friend_email");
}
