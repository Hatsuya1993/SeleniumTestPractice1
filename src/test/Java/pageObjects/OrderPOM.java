package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPOM {

    WebDriver driver;

    public OrderPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "order_button")
    @CacheLookup
    WebElement buyNowButton;

    public WebElement getBuyNowButton() { return buyNowButton; }


}
