package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainFeaturesPagePOM;

public class MainFeaturesPage extends Base {

    @Test
    public void checkURL() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(driver.getCurrentUrl().contains("features")){
            Assert.assertTrue(true);
            logger.info("URL is correnct");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect");
        }
    }

    @Test
    public void checkHeaderIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(mainFeaturesPagePOM.getMainFeaturesHeader().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Header is displayed");
        }
        else{
            Assert.fail();
            logger.info("Header is not displayed");
        }
    }

}
