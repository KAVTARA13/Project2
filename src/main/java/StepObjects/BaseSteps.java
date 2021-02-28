package StepObjects;

import com.codeborne.selenide.AssertionMode;
import static com.codeborne.selenide.Configuration.*;

public class BaseSteps {
    public static void initialization() {
        startMaximized = true;
        timeout = 5000;
        assertionMode= AssertionMode.SOFT;
        baseUrl = "http://automationpractice.com";
    }
}
