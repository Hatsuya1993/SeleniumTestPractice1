package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadConfig;

public class MainFeaturesPagePOM {

    ReadConfig readConfig = new ReadConfig();

    public String mainFeaturesURL = readConfig.getMainFeatures();

    WebDriver driver;

    public MainFeaturesPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(mainFeaturesURL);
    }

    public WebElement getMainFeaturesHeader() {
        return driver.findElement(By.cssSelector(".BS-header"));
    }

    public WebElement getMainFeaturesSection() { return driver.findElement(By.cssSelector(".is-highlighted")); }

    public WebElement getProcess() { return driver.findElement(By.cssSelector("#process")); }

    public WebElement getRegions() { return driver.findElement(By.cssSelector(".regions")); }
}
