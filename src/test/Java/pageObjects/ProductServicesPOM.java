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
}
