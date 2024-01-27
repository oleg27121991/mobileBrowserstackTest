package by.veremei.test;

import by.veremei.pages.MainPage;
import by.veremei.pages.SearchPage;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchTest extends TestBase {
    private final SearchPage searchPage = new SearchPage();
    private final MainPage mainPage = new MainPage();
    @Test
    void successfulSearchTest() {
        step("Type search", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText("Appium");
        });
        step("Verify content found", () ->
            searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
    }
}
