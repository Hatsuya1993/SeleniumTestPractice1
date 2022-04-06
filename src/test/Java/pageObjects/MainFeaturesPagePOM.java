package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadConfig;

import java.util.List;

public class MainFeaturesPagePOM {

    ReadConfig readConfig = new ReadConfig();

    public String mainFeaturesURL = readConfig.getMainFeatures();

    WebDriver driver;

    public MainFeaturesPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(mainFeaturesURL);
    }

    private static final By header = By.cssSelector(".BS-header");

    private static final By banner = By.cssSelector(".templates-page");

    private static final By mainFeaturesSection = By.cssSelector(".is" +
            "-highlighted");

    private static final By process = By.cssSelector("#process");

    private static final By regions = By.cssSelector(".regions");

    private static final By footer = By.cssSelector(".BS-footer");

    private static final By logo = By.cssSelector("#PHPTRAVELS");

    private static final By demoButton = By.cssSelector("[href*='phptravels" +
            ".com/demo']");

    private static final By sectionTitle = By.cssSelector(".section-title");

    private static final By applicationFeatures = By.cssSelector(".section" +
            "-title span");

    private static final By maximumSecurity = By.cssSelector(".section-title " +
            "h2");

    public static final By guaranteedByOurTopDevelopers = By.cssSelector(
            ".section-title p");

    public static final By securityOptions = By.cssSelector(".row.row-10");

    public WebElement getMainFeaturesHeader() {
        return driver.findElement(header);
    }

    public WebElement getBanner() {
        return driver.findElement(banner);
    }

    public WebElement getMainFeaturesSection() {
        return driver.findElement(mainFeaturesSection);
    }

    public WebElement getProcess() {
        return driver.findElement(process);
    }

    public WebElement getRegions() {
        return driver.findElement(regions);
    }

    public WebElement getFooter() {
        return driver.findElement(footer);
    }

    public WebElement getLogo() {
        return driver.findElement(logo);
    }

    public WebElement getDemoButton() {
        return driver.findElement(demoButton);
    }

    public WebElement getSectionButton() {
        return driver.findElement(sectionTitle);
    }

    public WebElement getApplicationFeature() {
        return driver.findElement(applicationFeatures);
    }

    public WebElement getMaximumSecurity() {
        return driver.findElement(maximumSecurity);
    }

    public WebElement getGuaranteedByOurTopDevelopers() {
        return driver.findElement(guaranteedByOurTopDevelopers);
    }

    public WebElement getSecurityOptions() {
        return driver.findElement(securityOptions);
    }
}
