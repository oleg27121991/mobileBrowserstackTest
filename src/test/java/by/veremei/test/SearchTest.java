package by.veremei.test;

import by.veremei.pages.MainPage;
import by.veremei.pages.SearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static io.qameta.allure.Allure.step;

@DisplayName("Mobile tests")
public class SearchTest extends TestBase {
    private final SearchPage searchPage = new SearchPage();
    private final MainPage mainPage = new MainPage();
    private final static String SEARCH_WORD = "Appium",
                                WIKI_ERROR_TEXT = "Error";
    @Test
    @DisplayName("Check search result")
    void successfulSearchTest() {
        step("Type search", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText(SEARCH_WORD);
        });
        step("Verify content found", () ->
            searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Verify error after opening the articles")
    void openPageTest() {
        step("Type search", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText(SEARCH_WORD);
        });
        step("Verify content found", () ->
            searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
        step("Open page with article", mainPage::clickFirstArticle
        );
        step("Verify error after opening the articles", () ->
            mainPage.verifyErrorAfterOpeningArticle(WIKI_ERROR_TEXT)
        );
    }
}
