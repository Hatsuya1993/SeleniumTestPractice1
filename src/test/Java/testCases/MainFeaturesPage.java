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

    @Test
    public void checkBannerIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(mainFeaturesPagePOM.getbanner().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Banner is displayed");
        }
        else{
            Assert.fail();
            logger.info("Banner is not displayed");
        }
    }

    @Test
    public void checkSectionIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(mainFeaturesPagePOM.getMainFeaturesSection().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Section is displayed");
        }
        else{
            Assert.fail();
            logger.info("Section is not displayed");
        }
    }

    @Test
    public void checkProcessIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(mainFeaturesPagePOM.getProcess().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Process is displayed");
        }
        else{
            Assert.fail();
            logger.info("Process is not displayed");
        }
    }

    @Test
    public void checkRegionIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(mainFeaturesPagePOM.getRegions().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Region is displayed");
        }
        else{
            Assert.fail();
            logger.info("Region is not displayed");
        }
    }

    @Test
    public void checkFooterIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(mainFeaturesPagePOM.getFooter().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Footer is displayed");
        }
        else{
            Assert.fail();
            logger.info("Footer is not displayed");
        }
    }

}
