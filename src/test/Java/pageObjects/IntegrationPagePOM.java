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

    private static final By pageContent = By.cssSelector("div.container.module");

    private static final By travelPort = By.cssSelector("a[href*='phptravels.gumroad.com/l/utzhq']");

    private static final By amadeus = By.cssSelector("a[href*='phptravels.gumroad.com/l/nevel'");

    private static final By aerTicket = By.cssSelector("a[href*='phptravels.gumroad.com/l/ocyro']");

    private static final By kiwiFlights = By.cssSelector(".item_id_Kiwi a[href*='phptravels.gumroad.com/l/bplom']");

    private static final By travelPayouts = By.cssSelector("a[href*='phptravels.gumroad.com/l/vurcy']");

    private static final By viatorTours = By.cssSelector("a[href*='phptravels.gumroad.com/l/fxaax']");

    private static final By hotelBeds = By.cssSelector("a[href*='phptravels.gumroad.com/l/yqgbc']");

    private static final By agodaHotels = By.cssSelector("a[href*='phptravels.gumroad.com/l/xyznu']");

    private static final By resliveHotels = By.cssSelector("a[href*='phptravels.gumroad.com/l/xgles']");

    private static final By hotelstonHotel = By.cssSelector("a[href*='phptravels.gumroad.com/l/dqajx']");

    private static final By cRMHubSpot = By.cssSelector("a[href*='phptravels.gumroad.com/l/fljug']");

    private static final By customGateways = By.cssSelector("a[href*='phptravels.gumroad.com/l/kblry']");

    private static final By setmposYKB = By.cssSelector("a[href*='phptravels.gumroad.com/l/hdrpv']");

    private static final By contactUs = By.linkText("CONTACT US");

    private static final By subheading = By.cssSelector("h2.heading");

    private static final By title = By.cssSelector("h2.title.strong");

    public WebElement getPageContent() { return driver.findElement(pageContent);}

    public WebElement getTravelPort() { return driver.findElement(travelPort);}

    public WebElement getAmadeus() { return driver.findElement(amadeus);}

    public WebElement getAerTicket() { return driver.findElement(aerTicket);}

    public WebElement getKiwiFlights() { return driver.findElement(kiwiFlights);}

    public WebElement getTravelPayouts() { return driver.findElement(travelPayouts);}

    public WebElement getViatorTours() { return driver.findElement(viatorTours);}

    public WebElement getHotelBeds() { return driver.findElement(hotelBeds);}

    public WebElement getAgodaHotels() { return driver.findElement(agodaHotels);}

    public WebElement getRezliveHotel() { return driver.findElement(resliveHotels);}

    public WebElement getHotelstonHotel() { return driver.findElement(hotelstonHotel);}

    public WebElement getCRMHubSpot() { return driver.findElement(cRMHubSpot);}

    public WebElement getCustomGateways() { return driver.findElement(customGateways);}

    public WebElement getSetmposYKB() { return driver.findElement(setmposYKB);}

    public WebElement getContactUs() { return driver.findElement(contactUs);}

    public List<WebElement> getSubHeading() { return driver.findElements(subheading);}

    public WebElement getTitle() { return driver.findElement(title);}
}
