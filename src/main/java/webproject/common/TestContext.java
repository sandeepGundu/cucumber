package webproject.common;

public class TestContext
{
    public DriverManager driverManager;
    public PageObjectManager pageObjectManager;

    public DriverManager getDriverManager()
    {
        if(driverManager == null)
        {
            driverManager = new DriverManager();
        }

        return driverManager;
    }

    public PageObjectManager getPageObjectManager()
    {
        if(pageObjectManager == null)
        {
            pageObjectManager = new PageObjectManager(driverManager.getDriver());
        }

        return pageObjectManager;
    }
}
