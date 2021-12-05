package testCases;

import helper.available;
import helper.helper;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
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

}
