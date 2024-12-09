package webproject.steps;

import org.junit.After;
import org.junit.Before;
import webproject.common.TestContext;

public class SetupSteps
{
    private TestContext testContext;

    public SetupSteps(TestContext testContext)
    {
        this.testContext = testContext;
    }

    @Before
    public void setUp()
    {
        testContext.getDriverManager().setupDriver();
    }

    @After
    public void tearDown()
    {
        testContext.getDriverManager().tearDown();
    }
}
