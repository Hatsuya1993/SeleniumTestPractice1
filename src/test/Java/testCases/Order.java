package testCases;

import helper.available;
import helper.helper;
import helper.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
import pageObjects.OrderConfirmPOM;
import pageObjects.OrderPOM;

public class Order extends Base{

    @Test
    public void checkDefaultButtonBuyNow() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getpricingLink());
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
        available.clickItem(demoPagePOM.getpricingLink());
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
        available.clickItem(demoPagePOM.getpricingLink());
        OrderPOM order = new OrderPOM(driver);
        Actions actions = new Actions(driver);
        if(order.selectCheckBox("1")){
            if(available.checkEnabled(order.getBuyNowButton(), driver) == true) {
                actions.scrollHelper(200);
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
        available.clickItem(demoPagePOM.getpricingLink());
        OrderPOM order = new OrderPOM(driver);
        Actions actions = new Actions(driver);
        OrderConfirmPOM orderConfirmPOM = new OrderConfirmPOM(driver);
        if(order.selectCheckBox("1")){
            if(available.checkEnabled(order.getBuyNowButton(), driver) == true) {
                actions.scrollHelper(200);
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


}
