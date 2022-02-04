package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IntegrationPagePOM;
import helper.available;

public class Integration extends Base {

    @Test
    public void checkTheDefaultContent() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if (integrationPagePOM.getPageContent().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Default content for integration is correct");
        } else {
            Assert.fail();
            logger.info("Default content for integration is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPort() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPort());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel port is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for travel port is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPort() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPort());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("travelport")) {
            Assert.assertTrue(true);
            logger.info("Url for travel port is correct");
        } else {
            Assert.fail();
            logger.info("Url for the travel port is incorrect");
        }
    }
}