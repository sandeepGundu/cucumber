package stepdef;

import cucumber.domain.helpers.DomainHelper;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WithdrawalSteps
{
    private DomainHelper domainHelper;

    /*public WithdrawalSteps()
    {
        domainHelper = new DomainHelper();
    }*/

    public WithdrawalSteps(DomainHelper domainHelper)
    {
        this.domainHelper = domainHelper;
    }

    @Then("${int} should be dispensed")
    public void $ShouldBeDispensed(int dispensedAmount) {
        Assert.assertEquals(dispensedAmount, domainHelper.getCashSlot().getContents());
    }

}
