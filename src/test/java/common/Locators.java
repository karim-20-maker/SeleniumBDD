package common;

import org.openqa.selenium.By;

public class Locators  {
    public By chevronArrow =By.id("country-btn");
    public By logo = By.id("jawwy-logo-web");
    public By costlocator = By.xpath("//div[contains(@class, 'trial-cost') and text() = 'week']");
    public By title = By.xpath("//h4[normalize-space()='CLASSIC']");
    public By lite = By.id("name-lite");
    public By premium = By.id("name-premium");

}
