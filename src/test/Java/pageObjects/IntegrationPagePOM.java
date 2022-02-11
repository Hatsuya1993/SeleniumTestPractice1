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

    public WebElement getAerticket() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/ocyro']"));}

    public WebElement getKiwiFlights() { return driver.findElement(By.cssSelector(".item_id_Kiwi a[href*='phptravels.gumroad.com/l/bplom']"));}

    public WebElement getTravelPayouts() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/vurcy']"));}

    public WebElement getViatorTours() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/fxaax']"));}

    public WebElement getHotelBeds() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/yqgbc']"));}

    public WebElement getAgodaHotels() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/xyznu']"));}
}
