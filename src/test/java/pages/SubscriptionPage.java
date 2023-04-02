package pages;

import hooks.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SubscriptionPage extends BasePage {

    private WebDriver Driver;

    public SubscriptionPage(WebDriver Driver){
        this.Driver = Driver;
    }

   public  By chevronArrow =By.id("country-btn");
   public  By logo = By.id("jawwy-logo-web");
   public  By costlocator = By.xpath("//div[contains(@class, 'trial-cost') and text() = 'week']");

   public By title = By.xpath("//h4[normalize-space()='CLASSIC']");

    // methods

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


    }
    /**
     * This method is to click on an element
     * @param element to be clicked
     */
    public void click(WebElement element) {
        element.click();
    }


    /**
     * This method is to explicitly wait for an element to be visible
     * @param by locator of the element that we're waiting to be visible
     */
    public void waitUntilElementIsVisabile(By by) {
        WebDriverWait wait = new WebDriverWait(Driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
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