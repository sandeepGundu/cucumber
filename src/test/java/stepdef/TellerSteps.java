package stepdef;

import cucumber.domain.helpers.DomainHelper;
import io.cucumber.java.en.When;

public class TellerSteps
{
    private DomainHelper domainHelper;

    /*public TellerSteps()
    {
        domainHelper = new DomainHelper();
    }*/

    public TellerSteps(DomainHelper domainHelper)
    {
        this.domainHelper = domainHelper;
    }

    @When("I request ${int}")
    public void iRequest$(int requestedAmount) {
        domainHelper.getTeller().withdrawCash(domainHelper.getAccount(), requestedAmount);

    }
}
