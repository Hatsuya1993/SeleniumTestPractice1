package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IntegrationPagePOM {

    WebDriver driver;

    public IntegrationPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }



    public WebElement getPageContent() { return driver.findElement(By.cssSelector("div.container.module"));}

    public WebElement getTravelPortLink() { return driver.findElement(By.cssSelector("a[href*='travelport']"));}

    public WebElement getTravelPortDoc() { return driver.findElement(By.cssSelector("a[href*='hotels/travelport']"));}

    public WebElement getTravelPayoutLink() { return driver.findElement(By.cssSelector("a[href*='travelpayouts']"));}

    public WebElement getTravelPayoutDoc() { return driver.findElement(By.cssSelector("a[href*='flights/travelpayouts-flights']"));}

    public List<WebElement> modulesInfo() { return driver.findElements(By.cssSelector(".module h4"));}

    public WebElement getHotelBedsLink() { return driver.findElement(By.cssSelector("a[href*=hotelbeds]"));}

    public WebElement getHotelstonLink() { return driver.findElement(By.cssSelector("a[href*=hotelston]"));}

    public WebElement getHotelstonDoc() { return driver.findElement(By.cssSelector("a[href*='modules/hotels/hotelston']"));}

    public WebElement getEjuniperLink() { return driver.findElement(By.cssSelector("a[href='http://www.ejuniper.com/']"));}

    public WebElement getEjuniperDoc() { return driver.findElement(By.cssSelector("a[href*='hotels/ejuniper-hotels']"));}

    public WebElement getExpediaLink() { return driver.findElement(By.cssSelector("a[href*='https://www.expedia.com/']"));}

    public WebElement getExpediaDoc() { return driver.findElement(By.cssSelector("a[href*='hotels/expedia']")); }

    public WebElement getTravelPayoutsLink() { return driver.findElement(By.cssSelector("a[href*='travelpayouts']")); }

    public WebElement getTravelPayoutsDoc() { return driver.findElement(By.cssSelector("a[href*='flights/travelpayouts-flights']")); }

    public WebElement getViatorsLink() { return driver.findElement(By.cssSelector("a[href*='viator']")); }

    public WebElement getViatorsDoc() { return driver.findElement(By.cssSelector("a[href*='tours/viator']")); }
}
