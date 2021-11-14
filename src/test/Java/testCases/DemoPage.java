package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
import helper.helper;
import helper.available;

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

    @Test
    public void checkHeaderDesc() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        if(demoPagePOM.getHeaderDesc().equalsIgnoreCase("Test drive online the demo product available with complete features")){
            Assert.assertTrue(true);
            logger.info("Header Desc is correct");
        }
        else{
            Assert.fail();
            logger.info("Heaer Desc is incorrect");
        }
    }

    @Test
    public void checkMainTitle() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        if(demoPagePOM.getMainTitle().equalsIgnoreCase("Demo Credentials for Frontend and Backend")){
            Assert.assertTrue(true);
            logger.info("Main title is correct");
        }
        else{
            Assert.fail();
            logger.info("Main title is incorrect");
        }
    }

    @Test
    public void checkNavOption() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        if(available.displayed(demoPagePOM.getNavOption())){
            Assert.assertTrue(true);
            logger.info("Nav option is available");
        }
        else{
            Assert.fail();
            logger.info("Nav option is not available");
        }
    }

    @Test
    public void checkRowofItems() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        if(available.displayed(demoPagePOM.getRowOfItems())){
            int countRow = driver.findElements(By.cssSelector("div.resource-box")).size();
            System.out.println(countRow);
            Assert.assertEquals(countRow, 6);
            logger.info("Correct number of rows");
        }
        else{
            Assert.fail();
            logger.info("Incorrect number of rows");
        }
    }

    @Test
    public void checkDemoLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getDemoLink());
        logger.info("clicked on Demo");
        if(driver.getCurrentUrl().contains("demo")){
            Assert.assertTrue(true);
            logger.info("Demo page url is correct");
        }
        else{
            Assert.fail();
            logger.info("Demo page url is incorrect");
        }
    }

    @Test
    public void checkPricingLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getpricingLink());
        logger.info("clicked on Pricing");
        if(driver.getCurrentUrl().contains("order")){
            Assert.assertTrue(true);
            logger.info("Pricing page url is correct");
        }
        else{
            Assert.fail();
            logger.info("Pricing page url is incorrect");
        }
    }

    @Test
    public void checkIntegrationLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getIntegrationLink());
        if(driver.getCurrentUrl().contains("integrations")){
            Assert.assertTrue(true);
            logger.info("Integration link is correct");
        }
        else{
            Assert.fail();
            logger.info("Integration link is incorrect");
        }
    }

    @Test
    public void countTabsForDocs() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getDocsLink());
        if(driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened when docs is clicked");
        }
        else{
            Assert.fail();
            logger.info("Issues with 2 tabs opened when docs is clicked");
        }
    }

    @Test
    public void checkDocTabUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getDocsLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("docs")){
            Assert.assertTrue(true);
            logger.info("URL for docs tab is correct");
            available.goBackCurrent(0, driver);
        }
        else{
            Assert.fail();
            logger.info("URL for docs tab is incorrect");
            available.goBackCurrent(0, driver);
        }
    }

    @Test
    public void countTabsForBlog() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getBlogLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened when blog is clicked");
        }
        else{
            Assert.fail();
            logger.info("Issues with 2 tabs opened when blog is clicked");
        }
    }

    @Test
    public void checkBlogUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getBlogLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("blog")){
            Assert.assertTrue(true);
            logger.info("URL for blog tab is correct");
            available.goBackCurrent(0, driver);
        }
        else{
            Assert.fail();
            logger.info("URL for blog is incorrect");
            available.goBackCurrent(0, driver);
        }
    }

    @Test
    public void countTabsForLogin() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getBlogLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened when login is clicked");
        }
        else{
            Assert.fail();
            logger.info("Issues with 2 tabs opened when login is clicked");
        }
    }

    @Test
    public void checkLoginUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getLoginLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("login")){
            Assert.assertTrue(true);
            logger.info("URL for login is correct");
            available.goBackCurrent(0, driver);
        }
        else{
            Assert.fail();
            logger.info("URL for login is incorrect");
            available.goBackCurrent(0, driver);
        }
    }

}
