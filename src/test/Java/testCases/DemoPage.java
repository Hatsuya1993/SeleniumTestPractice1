package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;

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
}
