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

    @FindBy(id = "header-title")
    @CacheLookup
    WebElement headerTitle;

    @FindBy(id = "header-description")
    @CacheLookup
    WebElement headerDesc;

    @FindBy(className = "main-title")
    @CacheLookup
    WebElement mainTitle;

    @FindBy(css = "nav.clearfix")
    @CacheLookup
    WebElement navOption;

    @FindBy(css = ".row")
    @CacheLookup
    WebElement rowOfItems;

    @FindBy(linkText = "Demo")
    @CacheLookup
    WebElement demoLink;

    @FindBy(linkText = "Pricing")
    @CacheLookup
    WebElement pricingLink;

    @FindBy(linkText = "Integrations")
    @CacheLookup
    WebElement integrationLink;

    @FindBy(linkText = "Docs")
    @CacheLookup
    WebElement docsLink;

    public String getTitle(){
        return title.getText();
    }

    public String getSubTitle() { return subTitle.getText(); }

    public String getheaderTitle() { return headerTitle.getText(); }

    public String getHeaderDesc() { return headerDesc.getText(); }

    public String getMainTitle() { return mainTitle.getText(); }

    public WebElement getNavOption() { return navOption; }

    public WebElement getRowOfItems() { return rowOfItems; }

    public WebElement getDemoLink() { return demoLink; }

    public WebElement getpricingLink() { return pricingLink; }

    public WebElement getIntegrationLink() { return integrationLink; }

    public WebElement getDocsLink() { return docsLink; }

}
