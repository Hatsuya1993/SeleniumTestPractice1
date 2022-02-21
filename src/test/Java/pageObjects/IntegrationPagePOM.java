package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadConfig;

import java.util.List;

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

    public WebElement getRezliveHotel() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/xgles']"));}

    public WebElement getHotelstonHotel() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/dqajx']"));}

    public WebElement getCRMHubSpot() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/fljug']"));}

    public WebElement getCustomGateways() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/kblry']"));}

    public WebElement getSetmposYKB() { return driver.findElement(By.cssSelector("a[href*='phptravels.gumroad.com/l/hdrpv']"));}

    public WebElement getContactUs() { return driver.findElement(By.linkText("CONTACT US"));}

    public List<WebElement> getSubHeading() { return driver.findElements(By.cssSelector("h2.heading"));}

    public WebElement getTitle() { return driver.findElement(By.cssSelector("h2.title.strong"));}
}
