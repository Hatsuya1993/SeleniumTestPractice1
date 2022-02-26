package testCases;

import helper.available;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ProductServicesPOM;

import java.util.Arrays;
import java.util.List;

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
    public void checkTheTitleData() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.displayed(productServicesPOM.getTitle());
        if (productServicesPOM.getTitle().getText().contains("Product Services")) {
            Assert.assertTrue(true);
            logger.info("Title is correctly populated for product services");
        } else {
            Assert.fail();
            logger.info("Title is not correctly populated for product services");
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

    @Test
    public void checkEachTitleForPanel() {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        List<String> data = Arrays.asList("Installation Web App", "Migrage Website / Upgrade Version", "Troubleshoot", "Additional License", "Payment Gateway Integration", "Extended Support", "Language Pack", "Personal Theme Integration", "XML or Json API Integration", "$100", "$200", "$100", "$100", "$1000", "$100", "$2000", "$2500", "$100");
        Boolean results = available.checkEachValue(data, productServicesPOM.getAllTitleOfOptions());
        if(results){
            Assert.assertTrue(true);
            logger.info("All titles are correctly populated");
        }
        else{
            Assert.fail();
            logger.info("All titles are incorrectly populated");
        }
    }

}