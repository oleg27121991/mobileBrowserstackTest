package by.veremei.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;

public class SearchPage {
    private final SelenideElement searchInputLocator = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final ElementsCollection searchResultsLocator = $$(id("org.wikipedia.alpha:id/page_list_item_title"));
    public void enterSearchText(String searchText) {
        searchInputLocator.sendKeys(searchText);
    }

    public ElementsCollection getSearchResultsCount() {
        return searchResultsLocator;
    }
}
