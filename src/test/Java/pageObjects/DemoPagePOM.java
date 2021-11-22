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

    @FindBy(linkText = "Blog")
    @CacheLookup
    WebElement blogLink;

    @FindBy(linkText = "Login")
    @CacheLookup
    WebElement loginLink;

    @FindBy(linkText = "Desktop App")
    @CacheLookup
    WebElement desktopApp;

    @FindBy(linkText = "Mobile Apps")
    @CacheLookup
    WebElement mobileApps;

    @FindBy(linkText = "Features")
    @CacheLookup
    WebElement featuresLink;

    @FindBy(linkText = "Requirements")
    @CacheLookup
    WebElement requirementsLink;

    @FindBy(linkText = "Technology")
    @CacheLookup
    WebElement technologyLink;

    @FindBy(linkText = "Changelog")
    @CacheLookup
    WebElement changeLogLink;

    @FindBy(linkText = "Updates")
    @CacheLookup
    WebElement updateLink;

    @FindBy(linkText = "Providers")
    @CacheLookup
    WebElement providersLink;

    @FindBy(linkText = "Affiliate")
    @CacheLookup
    WebElement affiliateLink;

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

    public WebElement getBlogLink() { return blogLink; }

    public WebElement getLoginLink() { return loginLink; }

    public WebElement getDesktopApp() { return desktopApp; }

    public WebElement getMobileApp() { return mobileApps; }

    public WebElement getFeaturesLink() { return featuresLink; }

    public WebElement getRequirementsLink() { return requirementsLink; }

    public WebElement getTechnologyLink() { return technologyLink; }

    public WebElement getChangeLogLink() { return changeLogLink; }

    public WebElement getUpdatesLink() { return updateLink; }

    public WebElement getProvidersLink() { return providersLink; }

    public WebElement getAffiliateLink() { return affiliateLink; }
}
