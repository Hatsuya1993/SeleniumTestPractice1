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

}
