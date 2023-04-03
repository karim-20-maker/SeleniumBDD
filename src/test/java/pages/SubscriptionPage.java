package pages;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SubscriptionPage extends BasePage {

    private WebDriver Driver;

    public SubscriptionPage(WebDriver Driver){
        this.Driver = Driver;
    }

    public void navigateToSelectCountry() {

        click(Driver.findElement(chevronArrow));
    }

    public void selectCountry(String country){
        By countrylocator = By.id(MapCountry(country) + "-contry-lable");
        click(Driver.findElement(countrylocator));
    }
    public void validateHomeSceen() {
        Driver.get("https://subscribe.jawwy.tv/eg-en");
        waitUntilElementIsVisabile(logo);
        Assert.assertTrue(Driver.findElement(logo).isDisplayed());
    }

    public void validateCurrency(String currency){

        Driver.findElement(costlocator).getText();
        Assert.assertTrue(Driver.findElement(costlocator).getText().contains(mapCurrency(currency)));
    }

    public void validateSubscriptionPage(){
        waitUntilElementIsVisabile(title);
        Assert.assertTrue(Driver.findElement(title).isDisplayed());
        Assert.assertTrue(Driver.findElement(lite).isDisplayed());
        Assert.assertTrue(Driver.findElement(premium).isDisplayed());


    }

    public String MapCountry(String country){
        String countryStr;
        switch (country) {
            case "Egypt":
                countryStr = "eg";
                break;
            case "UAE":
                countryStr = "ae";
                break;
            case "Iraq":
                countryStr = "iq";
                break;
            default:
                throw new IllegalArgumentException("Invalid country code: " + country);
        }
        return countryStr;

    }
    public String mapCurrency(String country){
        String currency;
        switch (country) {
            case "Egypt":
                currency = "Egyptian pound";
                break;
            case "UAE":
                currency = "AED";
                break;
            case "Iraq":
                currency = "IQ";
                break;
            default:
                throw new IllegalArgumentException("Invalid currency code: " + country);
        }
        return currency;

    }









}