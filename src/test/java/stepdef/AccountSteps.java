package stepdef;

import cucumber.domain.helpers.DomainHelper;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class AccountSteps
{
    private DomainHelper domainHelper;

    /*public AccountSteps()
    {
        domainHelper = new DomainHelper();
    }*/
    public AccountSteps(DomainHelper domainHelper)
    {
        this.domainHelper = domainHelper;
    }

    @Given("I have a balance of ${int} in my account")
    public void iHaveABalanceOf$100InMyAccount(int amount) {
        domainHelper.getAccount().deposit(amount);
        Assert.assertEquals(amount, domainHelper.getAccount().getBalance());
    }
}
