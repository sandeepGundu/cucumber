package webproject.common;

import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebDriver;
import webproject.pages.MainPage;

public class PageObjectManager
{
    private WebDriver driver;
    private MainPage mainPage;

    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public MainPage getMainPage()
    {
        if(mainPage == null)
        {
            mainPage = new MainPage(driver);
        }

        return mainPage;
    }
}
