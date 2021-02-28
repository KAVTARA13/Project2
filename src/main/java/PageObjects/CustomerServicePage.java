package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class CustomerServicePage {
    public SelenideElement heading =  $("#id_contact");
    public SelenideElement order =  $(byName("id_order"));
    public SelenideElement message = $("#message");
    public SelenideElement attach = $("#fileUpload");
    public SelenideElement sendBtn = $("#submitMessage");
}
