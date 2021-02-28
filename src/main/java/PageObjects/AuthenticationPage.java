package PageObjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage {
    public SelenideElement emailCreateField = $("#email_create");
    public SelenideElement emailCreateButton = $("#SubmitCreate");
}
