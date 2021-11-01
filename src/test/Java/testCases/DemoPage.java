package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
import helper.helper;

public class DemoPage extends Base {


    @Test
    public void checkURL() {
        if(driver.getCurrentUrl().contains("demo")){
            Assert.assertTrue(true);
            logger.info("URL is correnct");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect");
        }
    }

    @Test
    public void checkTitle() {
        DemoPagePOM demoPage = new DemoPagePOM(driver);
        if(demoPage.getTitle().equalsIgnoreCase("PHPTRAVELS")){
            Assert.assertTrue(true);
            logger.info("Title is correct");
        }
        else{
            Assert.fail();
            logger.info("Title is incorrect");
        }
    }

    @Test
    public void checkSubTitle() {
        DemoPagePOM demoPage = new DemoPagePOM(driver);
        if(demoPage.getSubTitle().equalsIgnoreCase("TRAVEL TECHNOLOGY PARTNER")){
            Assert.assertTrue(true);
            logger.info("Subtitle is correct");
        }
        else{
            Assert.fail();
            logger.info("Subtitle is incorrect");
        }
    }

    @Test
    public void checkHeaderTitle() throws InterruptedException {
        DemoPagePOM demoPage = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        if(demoPage.getheaderTitle().equalsIgnoreCase("Application Test Drive")){
            Assert.assertTrue(true);
            logger.info("HeaderTitle is correct");
        }
        else{
            Assert.fail();
            logger.info("HeaderTitle is incorrect");
        }
    }
}
