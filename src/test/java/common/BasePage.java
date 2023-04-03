package common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Locators  {
   public static  WebDriver Driver;



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


}
