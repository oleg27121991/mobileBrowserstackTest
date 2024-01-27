package by.veremei.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.MobileBy.AccessibilityId;

public class MainPage {
    private final SelenideElement searchButtonLocator = $(AccessibilityId("Search Wikipedia"));

    public void clickSearchButton() {
        $(searchButtonLocator).click();
    }
}