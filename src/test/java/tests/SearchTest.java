package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends BaseTest {
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void TestSearch() {
        homePage = new HomePage(driver);
        homePage.clickSearch();
        homePage.enterSearchText("java");
        searchPage = new SearchPage(driver);
        //Assert.assertTrue(searchPage.searchResult.getText().contains("#JAVA"));
    }
}
