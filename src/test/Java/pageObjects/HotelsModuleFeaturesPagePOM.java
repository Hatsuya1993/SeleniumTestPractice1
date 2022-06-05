package pageObjects;

import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ReadConfig;

import java.util.ArrayList;
import java.util.List;

public class HotelsModuleFeaturesPagePOM {

    ReadConfig readConfig = new ReadConfig();

    public String hotelsModuleFeatures = readConfig.getHotelsModuleFeatures();

    private static final By headerTitle = By.cssSelector("#header-title");

    private static final By headerDescription = By.cssSelector("#header-description");

    private static final By hotelsBookingModuleTitle = By.xpath("//h2[contains(text(),'Complete Hotels Booking Module')]");

    private static final By hotelsBookingModuleDescription = By.xpath("//p[contains(text(),'Dedicated hotels module with multiple features and functionalities such as adding hotels, rooms, images, text and map locations along with managing full calendar from admin and supplier backend.')]");

    private static final By hotelsBookingModuleImage = By.cssSelector("[alt='hotels module']");

    private static final By fullCalendarTitle = By.xpath("//h2[contains(text(),'Full Calendar')]");

    private static final By fullCalendarDescription = By.xpath("//p[contains(text(), 'Full calendar will help you to manage pricing based on dates months weeks, you can also setup availablilty from different dates to days along with half full and partical availability feature offer realtime bookings only on your website and avoid any double booking suppliers hotel')]");

    private static final By fullCalendarImage = By.cssSelector("[alt='hotels calender']");

    private static final By mainFeaturesTitle = By.xpath("//h2[contains(text(), 'Main Features')]");

    private static final By numberOfFeatures = By.cssSelector(".d-inline-flex.flex-column.align-items-center.col-sm-6.col-md-4.mb-5");
    WebDriver driver;

    public HotelsModuleFeaturesPagePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(hotelsModuleFeatures);
    }

    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitle);
    }

    public WebElement getHeaderTitleDescription() {
        return driver.findElement(headerDescription);
    }

    public WebElement getHotelsBookingModuleTitle() {
        return driver.findElement(hotelsBookingModuleTitle);
    }

    public WebElement getHotelsBookingModuleDescription() {
        return driver.findElement(hotelsBookingModuleDescription);
    }

    public WebElement getHotelsBookingModuleImage() {
        return driver.findElement(hotelsBookingModuleImage);
    }

    public WebElement getFullCalendar() {
        return driver.findElement(fullCalendarTitle);
    }

    public WebElement getFullCalendarDescription() {
        return driver.findElement(fullCalendarDescription);
    }

    public WebElement getFullCalendarImage() {
        return driver.findElement(fullCalendarImage);
    }

    public WebElement getMainFeaturesTitle() {
        return driver.findElement(mainFeaturesTitle);
    }

    public List<WebElement> getListOfFeatures() {
        return driver.findElements(numberOfFeatures);
    }

    public boolean checkEachContentIsDisplayedEachFeature(List<WebElement> data, String type) throws Exception {
        List<Boolean> listBoolean = new ArrayList<Boolean>();
        for(WebElement each : data){
            if(type.equalsIgnoreCase("image")){
                if(Helper.displayed(each.findElement(By.cssSelector("span")))){
                    listBoolean.add(true);
                }
                else{
                    listBoolean.add(false);
                }
            }
            else if(type.equalsIgnoreCase("title")){
                if(Helper.displayed(each.findElement(By.cssSelector("div h5")))){
                    listBoolean.add(true);
                }
                else{
                    listBoolean.add(false);
                }
            }
            else if(type.equalsIgnoreCase("description")){
                if(Helper.displayed(each.findElement(By.cssSelector("div p")))){
                    listBoolean.add(true);
                }
                else{
                    listBoolean.add(false);
                }
            }
            else{
                throw new Exception("Type is not specified");
            }
        }
        if(listBoolean.contains(false)){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean checkEachContentIsDisplayedEachFeatureCorrectly(List<WebElement> data, List<String> actual, String type) throws Exception {
        List<Boolean> listBoolean = new ArrayList<Boolean>();
        for(WebElement each : data){
            if(type.equalsIgnoreCase("title")){
                if(Helper.displayed(each.findElement(By.cssSelector("div h5"))) && actual.contains(each.findElement(By.cssSelector("div h5")).getText())){
                    listBoolean.add(true);
                }
                else{
                    listBoolean.add(false);
                }
            }
            else{
                throw new Exception("Type is not specified");
            }
        }
        if(listBoolean.contains(false)){
            return false;
        }
        else{
            return true;
        }
    }
}
