package pageObjects;

import helper.Helper;
import org.openqa.selenium.By;
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

    @FindBy(id = "order")
    @CacheLookup
    WebElement orderPage;

    public WebElement getBuyNowButton() {
        return buyNowButton;
    }

    public WebElement getOrderPage() {
        return orderPage;
    }

    public boolean selectCheckBox(String idNum) throws InterruptedException {
        if (Helper.displayed(driver.findElement(By.id((idNum))))){
            Helper.clickItem(driver.findElement(By.id(idNum)));
            return true;
        }
        else{
            return false;
        }
    }
}
