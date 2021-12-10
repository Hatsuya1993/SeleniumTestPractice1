package pageObjects;

import helper.available;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPOM {

    WebDriver driver;

    public OrderConfirmPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "button")
    @CacheLookup
    WebElement confirmOrder;

    public WebElement getConfirmOrder() {
        return confirmOrder;
    }
}
