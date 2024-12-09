package webproject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import webproject.common.CommonTask;
import webproject.common.TestContext;
import webproject.pages.MainPage;

public class MainPageSteps
{
    private TestContext testContext;

    public MainPageSteps(TestContext testContext)
    {
        this.testContext = testContext;
    }

    @Given("I am on Wikipedia main page")
    public void iAmOnWikipediaMainPage() {
        CommonTask.navigateToURL(testContext.getDriverManager().getDriver(), "https://en.wikipedia.org/wiki/Main_Page");
        MainPage mainPage = testContext.getPageObjectManager().getMainPage();
        Assert.assertEquals("Wikipedia, the free encyclopedia", mainPage.getTitle());
    }
    @Then("today's featured article displayed")
    public void todaySFeaturedArticleDisplayed() {
        MainPage mainPage = testContext.getPageObjectManager().getMainPage();
        Assert.assertEquals("From today's featured article", mainPage.getFeaturedArticleHeader());
    }


}
