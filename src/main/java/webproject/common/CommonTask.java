package webproject.common;

import org.openqa.selenium.WebDriver;

public class CommonTask
{
    public static void navigateToURL(WebDriver driver, String appURL)
    {
        driver.get(appURL);
    }
}
