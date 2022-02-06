package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadConfig;

public class IntegrationPagePOM {

    ReadConfig readConfig = new ReadConfig();

    public String integrationURL = readConfig.getIntegrationURL();

    WebDriver driver;

    public IntegrationPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(integrationURL);
    }



    public WebElement getPageContent() { return driver.findElement(By.cssSelector("div.container.module"));}

    public WebElement getTravelPort() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/utzhq']"));}

    public WebElement getAmadeus() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/nevel'"));}
}
