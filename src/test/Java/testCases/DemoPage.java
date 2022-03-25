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
        if(demoPage.getHeaderTitle().equalsIgnoreCase("Application Test Drive")){
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
            logger.info("Header Desc is incorrect");
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
        available.clickItem(demoPagePOM.getPricingLink());
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

    @Test
    public void checkForDesktopAppUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getDesktopApp());
        if(driver.getCurrentUrl().contains("desktop-application")){
            Assert.assertTrue(true);
            logger.info("URl is correct when desktop application is clicked");
        }
        else{
            Assert.fail();
            logger.info("URl is incorrect when desktop application is clicked");
        }
    }

    @Test
    public void checkForMobileAppUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getMobileApp());
        if(driver.getCurrentUrl().contains("mobile-applications")){
            Assert.assertTrue(true);
            logger.info("URL is correct when mobile apps is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when mobile apps is clicked");
        }
    }

    @Test
    public void checkForFeaturesUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getFeaturesLink());
        if(driver.getCurrentUrl().contains("features")){
            Assert.assertTrue(true);
            logger.info("URL is correct when features is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when features is clicked");
        }
    }

    @Test
    public void checkForRequirementsUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getRequirementsLink());
        if(driver.getCurrentUrl().contains("requirements")){
            Assert.assertTrue(true);
            logger.info("URL is correct when requirements is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when requirements is clicked");
        }
    }

    @Test
    public void checkForTechnologyUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getTechnologyLink());
        if(driver.getCurrentUrl().contains("technology")){
            Assert.assertTrue(true);
            logger.info("URL is correct when technology is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when technology is clicked");
        }
    }

    @Test
    public void checkForChangeLogUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getChangeLogLink());
        if(driver.getCurrentUrl().contains("change-log")){
            Assert.assertTrue(true);
            logger.info("URL is correct when changelog is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when changelog is clicked");
        }
    }

    @Test
    public void checkForUpdatesLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getUpdatesLink());
        if(driver.getCurrentUrl().contains("updates")){
            Assert.assertTrue(true);
            logger.info("URL is correct when updates is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when updates is clicked");
        }
    }

    @Test
    public void checkForProvidersLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getProvidersLink());
        if(driver.getCurrentUrl().contains("providers")){
            Assert.assertTrue(true);
            logger.info("URL is correct when providers is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when providers is clicked");
        }
    }

    @Test
    public void checkForAffiliateLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getAffiliateLink());
        if(driver.getCurrentUrl().contains("affiliate")){
            Assert.assertTrue(true);
            logger.info("URL is correct when affiliate is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when affiliate is clicked");
        }
    }

    @Test
    public void checkForRoadmapLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getRoadMapLink());
        if(driver.getCurrentUrl().contains("roadmap")){
            Assert.assertTrue(true);
            logger.info("URL is correct when roadmap is clicked");
        }
        else {
            Assert.fail();
            logger.info("URL is incorrect when roadmap is clicked");
        }
    }

    @Test
    public void checkForAboutUsLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getAboutUsLink());
        if(driver.getCurrentUrl().contains("about-us")){
            Assert.assertTrue(true);
            logger.info("URL is correct when about us link is clicked");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect when about us page is clicked");
        }
    }

    @Test
    public void checkForContactUs() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getContactUsLink());
        if(driver.getCurrentUrl().contains("contact-us")){
            Assert.assertTrue(true);
            logger.info("URL is correct when contact us is clicked");
        }
        else{
            Assert.fail();
            logger.info("URl is incorrect when contact us is clicked");
        }
    }

    @Test
    public void checkForJobsLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getJobsLink());
        if(driver.getCurrentUrl().contains("jobs")){
            Assert.assertTrue(true);
            logger.info("URL is correct when job is clicked");
        }
        else {
            Assert.fail();
            logger.info("URl is incorrect when jobs is selected");
        }
    }

    @Test
    public void checkForTheTeamsLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getTheTeamLink());
        if(driver.getCurrentUrl().contains("the-team")){
            Assert.assertTrue(true);
            logger.info("URL is correct when teams link is clicked");
        }
        else {
            Assert.fail();
            logger.info("URl is incorrect when team links is selected");
        }
    }

    @Test
    public void checkForTermsOfServiceLink() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getTermsOfService());
        if(driver.getCurrentUrl().contains("terms-and-conditions")){
            Assert.assertTrue(true);
            logger.info("URL is correct when terms and conditions link is clicked");
        }
        else {
            Assert.fail();
            logger.info("URl is incorrect when terms and condition links is selected");
        }
    }

    @Test
    public void getPrivacyPolicy() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPrivacyPolicy());
        if(driver.getCurrentUrl().contains("privacy-statement")){
            Assert.assertTrue(true);
            logger.info("URL is correct when privacy policy link is clicked");
        }
        else {
            Assert.fail();
            logger.info("URl is incorrect when privacy policy links is selected");
        }
    }

    @Test
    public void countTabsForLiveChat() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getLiveChatLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened when live chat is clicked");
        }
        else{
            Assert.fail();
            logger.info("Issues with 2 tabs opened when chat live is clicked");
        }
    }

    @Test
    public void checkLiveChatUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getLiveChatLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("chat")){
            Assert.assertTrue(true);
            logger.info("URL for live chat is correct");
            available.goBackCurrent(0, driver);
        }
        else{
            Assert.fail();
            logger.info("URL for live chat is incorrect");
            available.goBackCurrent(0, driver);
        }
    }

    @Test
    public void getContentProgramUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.contentProgramLink());
        if(driver.getCurrentUrl().contains("earn-with-phptravels")){
            Assert.assertTrue(true);
            logger.info("URL is correct when content program link is clicked");
        }
        else {
            Assert.fail();
            logger.info("URl is incorrect when content program links is selected");
        }
    }

    @Test
    public void getChatUrl() throws InterruptedException {
        DemoPagePOM demoPagePOM = new DemoPagePOM(driver);
        Thread.sleep(helper.shortWait);
        available.clickItem(demoPagePOM.getPublicChatlink());
        if(driver.getCurrentUrl().contains("chat")){
            Assert.assertTrue(true);
            logger.info("URL is correct when public chat link is clicked");
        }
        else {
            Assert.fail();
            logger.info("URl is incorrect when public chat links is selected");
        }
    }
}
