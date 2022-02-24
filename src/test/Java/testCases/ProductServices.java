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

    @Test
    public void countNumberOfPanel() {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        if(productServicesPOM.getListOfOptions().size() == 9){
            Assert.assertTrue(true);
            logger.info("Number of panels are correctly populated");
        }
        else{
            Assert.fail();
            logger.info("Number of panels are incorrectly populated");
        }
    }

}
