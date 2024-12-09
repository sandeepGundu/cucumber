package webproject.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverManager
{
    private WebDriver driver;
    //static final org.apache.logging.log4j.Logger
    //static final Logger logger = LogManager.getLogManager(DriverManager.class);

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setupDriver()
    {
        String browser = "LOCAL_CHROME";
        String gridHubUrl = System.getProperty("browser");
        DesiredCapabilities dc = null;

        BrowserType browserType = BrowserType.valueOf(browser);
        switch (browserType)
        {
            case LOCAL_CHROME:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case LOCAL_FIREFOX:
                System.setProperty("webdriver.firefox.driver", "src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            default:
                driver = new ChromeDriver();
                break;

        }
    }

    public void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}
