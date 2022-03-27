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

    private static final By listOfOptions = By.cssSelector(".panel-body");

    private static final By allTitleOfOptions = By.cssSelector(".panel-body .col-md-9 h3 strong");

    private static final By orderNowForMoreInstallation = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=13'] button span");

    private static final By migrageWebsite = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=27'] button span");

    private static final By troubleShoot = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=28'] button span");

    private static final By additionalLicense = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=15'] button span");

    private static final By paymentGateway = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=25'] button span");

    private static final By extendedSupport = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=26'] button span");

    private static final By languagePack = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=24'] button span");

    private static final By personalTheme = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=43'] button span");

    private static final By jsonAPI = By.cssSelector("[action*='phptravels.org/cart.php?a=add&pid=44'] button span");

    public WebElement getTitle() { return title; }

    public List<WebElement> getListOfOptions() { return driver.findElements(listOfOptions); }

    public List<WebElement> getAllTitleOfOptions() { return driver.findElements(allTitleOfOptions); }

    public WebElement getOrderNowForInstallation() { return driver.findElement(orderNowForMoreInstallation); }

    public WebElement getMigrageWebsite() { return driver.findElement(migrageWebsite);}

    public WebElement getTroubleshoot() { return driver.findElement(troubleShoot);}

    public WebElement getAdditionalLicense() { return driver.findElement(additionalLicense);}

    public WebElement getPaymentGateway() { return driver.findElement(paymentGateway); }

    public WebElement getExtendedSupport() { return driver.findElement(extendedSupport);}

    public WebElement getLanguagePack() { return driver.findElement(languagePack); }

    public WebElement getPersonalTheme() { return driver.findElement(personalTheme); }

    public WebElement getJsonAPI() { return driver.findElement(jsonAPI); }
}
