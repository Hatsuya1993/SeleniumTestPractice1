package testCases;

import helper.available;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ProductServicesPOM;

public class ProductServices extends Base {

    @Test
    public void checkTheTitle() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.displayed(productServicesPOM.getTitle());
        if (productServicesPOM.getTitle().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Title is displayed for product services");
        } else {
            Assert.fail();
            logger.info("Title is not displayed for product services");
        }
    }

}
