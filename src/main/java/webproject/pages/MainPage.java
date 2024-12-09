package webproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage
{
    private WebDriver driver;

    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public String getFeaturedArticleHeader()
    {
        WebElement header = driver.findElement(By.id("From_today's_featured_article"));
        return header.getText();
    }
}
