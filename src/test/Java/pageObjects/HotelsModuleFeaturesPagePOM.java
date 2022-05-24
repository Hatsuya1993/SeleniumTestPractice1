package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadConfig;

public class HotelsModuleFeaturesPagePOM {

    ReadConfig readConfig = new ReadConfig();

    public String hotelsModuleFeatures = readConfig.getIntegrationURL();

    WebDriver driver;
    public HotelsModuleFeaturesPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(hotelsModuleFeatures);
    }





}
