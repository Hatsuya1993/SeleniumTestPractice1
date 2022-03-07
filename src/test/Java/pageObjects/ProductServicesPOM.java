package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadConfig;

import java.util.List;

public class ProductServicesPOM {

    ReadConfig readConfig = new ReadConfig();

    public String productServices = readConfig.getProductServices();

    WebDriver driver;

    public ProductServicesPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(productServices);
    }

    @FindBy(id = "header-title")
    @CacheLookup
    WebElement title;

    public WebElement getTitle() { return title; }

    public List<WebElement> getListOfOptions() { return driver.findElements(By.cssSelector(".panel-body")); }

    public List<WebElement> getAllTitleOfOptions() { return driver.findElements(By.cssSelector(".panel-body .col-md-9 h3 strong")); }

    public WebElement getOrderNowForInstallation() { return driver.findElement(By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=13'] button span")); }

    public WebElement getMigrageWebsite() { return driver.findElement(By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=27'] button span"));}

    public WebElement getTroubleshoot() { return driver.findElement(By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=28'] button span"));}

    public WebElement getAdditionalLicense() { return driver.findElement(By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=15'] button span"));}

    public WebElement getPaymentGateway() { return driver.findElement(By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=25'] button span")); }
}
