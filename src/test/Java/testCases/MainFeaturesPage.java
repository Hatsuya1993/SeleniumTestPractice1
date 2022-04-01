package testCases;

import helper.available;
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
        if(mainFeaturesPagePOM.getBanner().isDisplayed()){
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

    @Test
    public void clickLogoToHomePage() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        available.hoverClick(mainFeaturesPagePOM.getLogo(), driver);
        if(driver.getCurrentUrl().contains("phptravels")){
            Assert.assertTrue(true);
            logger.info("Website is correct");
        }
        else{
            Assert.fail();
            logger.info("Website is incorrect");
        }
    }

    @Test
    public void demonButtonNewPage() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        available.hoverClick(mainFeaturesPagePOM.getDemoButton(), driver);
        if(driver.getCurrentUrl().contains("demo")){
            Assert.assertTrue(true);
            logger.info("Demon button moves to a new page");
        }
        else{
            Assert.fail();
            logger.info("Demo button doesnt move to a new page");
        }
    }

    @Test
    public void sectionTitleDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(available.displayed(mainFeaturesPagePOM.getSectionButton())){
            Assert.assertTrue(true);
            logger.info("Section title is displayed");
        }
        else{
            Assert.fail();
            logger.info("Section title is not displayed");
        }
    }


    @Test
    public void applicationFeaturesDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(available.displayed(mainFeaturesPagePOM.getApplicationFeature())){
            Assert.assertTrue(true);
            logger.info("Application features is displayed");
        }
        else{
            Assert.fail();
            logger.info("Application features is not displayed");
        }
    }

    @Test
    public void maximumSecurityDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM = new MainFeaturesPagePOM(driver);
        if(available.displayed(mainFeaturesPagePOM.getMaximumSecurity())){
            Assert.assertTrue(true);
            logger.info("Maximum security is displayed");
        }
        else{
            Assert.fail();
            logger.info("Maximum security is not displayed");
        }
    }

}
