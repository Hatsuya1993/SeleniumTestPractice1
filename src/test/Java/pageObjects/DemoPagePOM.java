package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPagePOM {

    WebDriver driver;

    public DemoPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "PHPTRAVELS")
    @CacheLookup
    WebElement title;

    @FindBy(id = "TRAVEL_TECHNOLOGY_PARTNER")
    @CacheLookup
    WebElement subTitle;

    public String getTitle(){
        return title.getText();
    }

    public String getSubTitle() { return subTitle.getText(); }

}
