package by.veremei.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.appium.java_client.MobileBy.AccessibilityId;

public class MainPage {
    private final SelenideElement searchButtonLocator = $(AccessibilityId("Search Wikipedia")),
                                  firstArticleDescriptionLocator = $(id("org.wikipedia.alpha:id/page_list_item_description")),
                                  wikiErrorTextLocator = $(id("org.wikipedia.alpha:id/view_wiki_error_text")),
                                  wikiErrorBtnLocator = $(id("org.wikipedia.alpha:id/view_wiki_error_button"));

    public void clickSearchButton() {
        $(searchButtonLocator).click();
    }

    public void clickFirstArticle() {
        firstArticleDescriptionLocator.click();
    }

    public void verifyErrorAfterOpeningArticle(String error) {
        wikiErrorTextLocator.shouldHave(text(error));
        wikiErrorBtnLocator.click();
    }
}