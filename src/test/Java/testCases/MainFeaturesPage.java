package testCases;

import helper.Actions;
import helper.Helper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainFeaturesPagePOM;

public class MainFeaturesPage extends Base {

    @Test
    public void checkURL() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (driver.getCurrentUrl().contains("features")) {
            Assert.assertTrue(true);
            logger.info("URL is correnct");
        } else {
            Assert.fail();
            logger.info("URL is incorrect");
        }
    }

    @Test
    public void checkHeaderIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (mainFeaturesPagePOM.getMainFeaturesHeader().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Header is displayed");
        } else {
            Assert.fail();
            logger.info("Header is not displayed");
        }
    }

    @Test
    public void checkBannerIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (mainFeaturesPagePOM.getBanner().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Banner is displayed");
        } else {
            Assert.fail();
            logger.info("Banner is not displayed");
        }
    }

    @Test
    public void checkSectionIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (mainFeaturesPagePOM.getMainFeaturesSection().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Section is displayed");
        } else {
            Assert.fail();
            logger.info("Section is not displayed");
        }
    }

    @Test
    public void checkProcessIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (mainFeaturesPagePOM.getProcess().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Process is displayed");
        } else {
            Assert.fail();
            logger.info("Process is not displayed");
        }
    }

    @Test
    public void checkRegionIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (mainFeaturesPagePOM.getRegions().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Region is displayed");
        } else {
            Assert.fail();
            logger.info("Region is not displayed");
        }
    }

    @Test
    public void checkFooterIsDisplayed() {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (mainFeaturesPagePOM.getFooter().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Footer is displayed");
        } else {
            Assert.fail();
            logger.info("Footer is not displayed");
        }
    }

    @Test
    public void clickLogoToHomePage() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Helper.hoverClick(mainFeaturesPagePOM.getLogo(), driver);
        if (driver.getCurrentUrl().contains("phptravels")) {
            Assert.assertTrue(true);
            logger.info("Website is correct");
        } else {
            Assert.fail();
            logger.info("Website is incorrect");
        }
    }

    @Test
    public void demonButtonNewPage() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Helper.hoverClick(mainFeaturesPagePOM.getDemoButton(), driver);
        if (driver.getCurrentUrl().contains("demo")) {
            Assert.assertTrue(true);
            logger.info("Demon button moves to a new page");
        } else {
            Assert.fail();
            logger.info("Demo button doesnt move to a new page");
        }
    }

    @Test
    public void sectionTitleDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSectionButton())) {
            Assert.assertTrue(true);
            logger.info("Section title is displayed");
        } else {
            Assert.fail();
            logger.info("Section title is not displayed");
        }
    }


    @Test
    public void applicationFeaturesDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (Helper.displayed(mainFeaturesPagePOM.getApplicationFeature())) {
            Assert.assertTrue(true);
            logger.info("Application features is displayed");
        } else {
            Assert.fail();
            logger.info("Application features is not displayed");
        }
    }

    @Test
    public void maximumSecurityDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (Helper.displayed(mainFeaturesPagePOM.getMaximumSecurity())) {
            Assert.assertTrue(true);
            logger.info("Maximum security is displayed");
        } else {
            Assert.fail();
            logger.info("Maximum security is not displayed");
        }
    }

    @Test
    public void maximumSecurityTextShouldBeCorrect() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (Helper.checkText(mainFeaturesPagePOM.getMaximumSecurity(),
                "Maximum Security and Reliability")) {
            Assert.assertTrue(true);
            logger.info("Maximum security is displaying the right data");
        } else {
            Assert.fail();
            logger.info("Maximum security is not displaying the correct data");
        }
    }

    @Test
    public void guaranteedByOurTopDevelopersIsDisplayed() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (Helper.displayed(mainFeaturesPagePOM.getGuaranteedByOurTopDevelopers())) {
            Assert.assertTrue(true);
            logger.info("Guaranteed by our top developers is displayed");
        } else {
            Assert.fail();
            logger.info("Guaranteed by our top developers is not displayed");
        }
    }

    @Test
    public void guaranteedByOurTopDevelopersTextIsCorrect() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelper(mainFeaturesPagePOM.getGuaranteedByOurTopDevelopers(), driver);
        if (Helper.checkText(mainFeaturesPagePOM.getGuaranteedByOurTopDevelopers(), "Guaranteed by our top developers")) {
            Assert.assertTrue(true);
            logger.info("Guaranteed by our top developers text is correct");
        } else {
            Assert.fail();
            logger.info("Guaranteed by our top developers text is incorrect");
        }
    }

    @Test
    public void securityOptionsCount() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptions())) {
            Assert.assertTrue(true);
            logger.info("Security options is displayed");
        } else {
            Assert.fail();
            logger.info("Security options is not displayed");
        }
    }

    @Test
    public void securityOptionsCountCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.countCheck(mainFeaturesPagePOM.getSecurityOptionsSelector(), 15)) {
            Assert.assertTrue(true);
            logger.info("Security options selector displayed all 15 options");
        } else {
            Assert.fail();
            logger.info("Security options is not displayed all 15 options");
        }
    }

    @Test
    public void securityOptionsFirstCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if(Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(0))){
            Assert.assertTrue(true);
            logger.info("Security options selector first title displayed");
        }
        else{
            Assert.fail();
            logger.info("Security options first title is not displayed");
        }
    }

    @Test
    public void securityOptionsFirstCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if(Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(0),"Secured")){
            Assert.assertTrue(true);
            logger.info("Security options selector first title is correctly populated");
        }
        else{
            Assert.fail();
            logger.info("Security options first title is not correctly populated");
        }
    }
}
