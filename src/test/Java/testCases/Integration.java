package testCases;

import helper.helper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
import pageObjects.IntegrationPagePOM;
import helper.available;
import helper.Actions;

public class Integration extends Base{

    @Test
    public void checkTheDefaultContent() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getIntegrationLink());
        Actions actions = new Actions(driver);
        actions.scrollHelper(400);
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if(integrationPagePOM.getPageContent().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Default content for integration is correct");
        }
        else{
            Assert.fail();
            logger.info("Default content for integration is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPort() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getIntegrationLink());
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPortLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel port is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travel port is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPort() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getIntegrationLink());
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPortLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("travelport")){
            Assert.assertTrue(true);
            logger.info("Url for travel port is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the travel port is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPortDoc() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getIntegrationLink());
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPortDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel port doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travel port doc is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPayOut() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getIntegrationLink());
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayout());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travelpayout is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travelpayout is incorrect");
        }
    }
}
