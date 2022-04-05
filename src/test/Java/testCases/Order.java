package testCases;

import helper.available;
import helper.helper;
import helper.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
import pageObjects.OrderConfirmPOM;
import pageObjects.OrderPOM;

import java.util.HashMap;

public class Order extends Base{

    @Test
    public void checkDefaultDataDisplayed()throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPricingLink());
        OrderPOM order = new OrderPOM(driver);
        if(order.getOrderPage().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Default order page is displayed");
        }
        else{
            Assert.fail();
            logger.info("Default order page is not displayed");
        }
    }

    @Test
    public void checkDefaultButtonBuyNow() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPricingLink());
        OrderPOM order = new OrderPOM(driver);
        if(available.checkEnabled(order.getBuyNowButton(), driver) == false){
            Assert.assertTrue(true);
            logger.info("Order page by default buy now button is disabled");
        }
        else{
            Assert.fail();
            logger.info("Order page by default buy now button is not disabled");
        }
    }

    @Test
    public void checkButtonActive() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPricingLink());
        OrderPOM order = new OrderPOM(driver);
        if(order.selectCheckBox("1")){
            if(available.checkEnabled(order.getBuyNowButton(), driver) == true){
                Assert.assertTrue(true);
                logger.info("Order page buy now button is active");
            }
            else{
                Assert.fail();
                logger.info("Order page by default buy now button is not active");
            }
        }
        else{
            Assert.fail();
            logger.info("No checkbox found");
        }
    }

    @Test
    public void checkURLForConfirmOrder() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPricingLink());
        OrderPOM order = new OrderPOM(driver);
        if(order.selectCheckBox("1")){
            if(available.checkEnabled(order.getBuyNowButton(), driver) == true) {
                Actions.scrollHelper(order.getBuyNowButton(), driver);
                available.clickItem(order.getBuyNowButton());
                if(driver.getCurrentUrl().contains("order-confirm")){
                    Assert.assertTrue(true);
                    logger.info("URl is correct for confirm order");
                }
                else{
                    Assert.fail();
                    logger.info("URL is incorrect for confirm order");
                }
            }
            }

    }

    @Test
    public void checkButtonDisabledDefaultForOrder() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPricingLink());
        OrderPOM order = new OrderPOM(driver);
        OrderConfirmPOM orderConfirmPOM = new OrderConfirmPOM(driver);
        if(order.selectCheckBox("1")){
            if(available.checkEnabled(order.getBuyNowButton(), driver) == true) {
                Actions.scrollHelper(order.getBuyNowButton(), driver);
                available.clickItem(order.getBuyNowButton());
                if(available.checkEnabled(orderConfirmPOM.getConfirmOrder(), driver) == false){
                    Assert.assertTrue(true);
                    logger.info("Confirm order button is false by default");
                }
                else{
                    Assert.fail();
                    logger.info("Confirm order button is not false by default");
                }
            }
        }

    }

    @Test
    public void checkTheInputsAfterDataAdded() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPricingLink());
        OrderPOM order = new OrderPOM(driver);
        OrderConfirmPOM orderConfirmPOM = new OrderConfirmPOM(driver);
        if(order.selectCheckBox("1")){
            if(available.checkEnabled(order.getBuyNowButton(), driver) == true) {
                Actions.scrollHelper(order.getBuyNowButton(), driver);
                available.clickItem(order.getBuyNowButton());
                HashMap<String, String> testData = new HashMap<String, String>();
                testData.put("firstNameInput","testName");
                testData.put("lastNameInput","testLast");
                testData.put("businessNameInput","testBusiness");
                testData.put("emailInput","testEmail");
                testData.put("mobileInput","123456");
                orderConfirmPOM.handleConfirmOrderForm(testData.get("firstNameInput"), testData.get("lastNameInput"), testData.get("businessNameInput"), testData.get("emailInput"), testData.get("mobileInput"));
                if(orderConfirmPOM.getFirstName().getAttribute("value").contains(testData.get("firstNameInput"))){
                    Assert.assertTrue(true);
                    logger.info("firstName input received");
                }
                else{
                    Assert.fail();
                    logger.info("firstName input not received");
                }
                if(orderConfirmPOM.getLastName().getAttribute("value").contains(testData.get("lastNameInput"))){
                    Assert.assertTrue(true);
                    logger.info("lastName input received");
                }
                else{
                    Assert.fail();
                    logger.info("lastName input not received");
                }
                if(orderConfirmPOM.getBizName().getAttribute("value").contains(testData.get("businessNameInput"))){
                    Assert.assertTrue(true);
                    logger.info("business name input received");
                }
                else{
                    Assert.fail();
                    logger.info("business name input not received");
                }
                if(orderConfirmPOM.getEmail().getAttribute("value").contains(testData.get("emailInput"))){
                    Assert.assertTrue(true);
                    logger.info("email input received");
                }
                else{
                    Assert.fail();
                    logger.info("email input not received");
                }
                if(orderConfirmPOM.getMobile().getAttribute("value").contains(testData.get("mobileInput"))){
                    Assert.assertTrue(true);
                    logger.info("mobile input received");
                }
                else{
                    Assert.fail();
                    logger.info("mobile input not received");
                }
            }
        }

    }


}
