package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class IntegrationPagePOM {

    WebDriver driver;

    public IntegrationPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public WebElement getPageContent() {
        return driver.findElement(By.cssSelector("div.container.module"));
    }

}
