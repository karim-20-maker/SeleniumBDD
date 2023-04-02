package stepdefinitions;
import io.cucumber.java.en.And;
import hooks.BasePage;
import pages.SubscriptionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SubscriptionSteps extends BasePage {

    private SubscriptionPage subscriptionPage = new SubscriptionPage(Driver);





    @Given("the user is on the subscription page")
    public void user_is_on_subscription_page() {
        subscriptionPage.validateHomeSceen();

    }

    @When("the user selects the country {string}")
    public void user_selects_country(String country) {
        subscriptionPage.navigateToSelectCountry();
        subscriptionPage.selectCountry(country);

    }

    @Then("the subscription packages are displayed")
    public void subscription_packages_displayed() {
        subscriptionPage.validateSubscriptionPage();

    }



//    @And("the packages contain valid Type & Price and {string}")
//    public void thePackagesContainValidTypePriceAnd(String currency) {
//        subscriptionPage.validateCurrency(currency);
//    }

    @And("the packages contain valid Type & Price and {string} currency")
    public void thePackagesContainValidTypePriceAndCurrncy(String cuntry) {
        subscriptionPage.validateCurrency(cuntry);
    }
}