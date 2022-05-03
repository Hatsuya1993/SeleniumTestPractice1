package testCases;

import helper.Actions;
import helper.Helper;
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
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(0))) {
            Assert.assertTrue(true);
            logger.info("Security options selector first title displayed");
        } else {
            Assert.fail();
            logger.info("Security options first title is not displayed");
        }
    }

    @Test
    public void securityOptionsFirstCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(0), "Secured")) {
            Assert.assertTrue(true);
            logger.info("Security options selector first title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options first title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsSecondCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(1))) {
            Assert.assertTrue(true);
            logger.info("Security options selector second title displayed");
        } else {
            Assert.fail();
            logger.info("Security options second title is not displayed");
        }
    }

    @Test
    public void securityOptionsSecondCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(1), "Payment Gateways")) {
            Assert.assertTrue(true);
            logger.info("Security options selector second title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options second title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsThirdCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(2))) {
            Assert.assertTrue(true);
            logger.info("Security options selector third title displayed");
        } else {
            Assert.fail();
            logger.info("Security options third title is not displayed");
        }
    }

    @Test
    public void securityOptionsThirdCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(2), "Multi Currency")) {
            Assert.assertTrue(true);
            logger.info("Security options selector third title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options third title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsFourthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(3))) {
            Assert.assertTrue(true);
            logger.info("Security options selector fourth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options fourth title is not displayed");
        }
    }

    @Test
    public void securityOptionsFifthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(3), "Multi Language")) {
            Assert.assertTrue(true);
            logger.info("Security options selector fifth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options fifth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsSixthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(4))) {
            Assert.assertTrue(true);
            logger.info("Security options selector sixth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options sixth title is not displayed");
        }
    }

    @Test
    public void securityOptionsSixthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(4), "CMS Management")) {
            Assert.assertTrue(true);
            logger.info("Security options selector sixth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options sixth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsSeventhCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(5))) {
            Assert.assertTrue(true);
            logger.info("Security options selector seventh title displayed");
        } else {
            Assert.fail();
            logger.info("Security options seventh title is not displayed");
        }
    }

    @Test
    public void securityOptionsSeventhCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(5), "Social Connections")) {
            Assert.assertTrue(true);
            logger.info("Security options selector seventh title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options seventh title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsEighthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(6))) {
            Assert.assertTrue(true);
            logger.info("Security options selector eighth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options eighth title is not displayed");
        }
    }

    @Test
    public void securityOptionsEighthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(6), "Offers Module")) {
            Assert.assertTrue(true);
            logger.info("Security options selector eighth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options eighth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsNinthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(7))) {
            Assert.assertTrue(true);
            logger.info("Security options selector ninth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options ninth title is not displayed");
        }
    }

    @Test
    public void securityOptionsNinthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(7), "Newsletter")) {
            Assert.assertTrue(true);
            logger.info("Security options selector ninth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options ninth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsTenthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(8))) {
            Assert.assertTrue(true);
            logger.info("Security options selector tenth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options tenth title is not displayed");
        }
    }

    @Test
    public void securityOptionsTenthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(8), "Reviews")) {
            Assert.assertTrue(true);
            logger.info("Security options selector Tenth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options Tenth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsEleventhCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(9))) {
            Assert.assertTrue(true);
            logger.info("Security options selector Eleventh title displayed");
        } else {
            Assert.fail();
            logger.info("Security options Eleventh title is not displayed");
        }
    }

    @Test
    public void securityOptionsEleventhCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(9), "Extras")) {
            Assert.assertTrue(true);
            logger.info("Security options selector Eleventh title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options Eleventh title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsTwelvethCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(10))) {
            Assert.assertTrue(true);
            logger.info("Security options selector Twelveth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options Twelveth title is not displayed");
        }
    }

    @Test
    public void securityOptionsTwelvethCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(10), "Theme Engine")) {
            Assert.assertTrue(true);
            logger.info("Security options selector Twelveth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options Twelveth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsThirtenthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(11))) {
            Assert.assertTrue(true);
            logger.info("Security options selector Thirtenth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options Thirtenth title is not displayed");
        }
    }

    @Test
    public void securityOptionsThirtenthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(11), "Full Calendar")) {
            Assert.assertTrue(true);
            logger.info("Security options selector Thirtenth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options Thirtenth title is not correctly " +
                    "populated");
        }
    }

    @Test
    public void securityOptionsFourteenthCheck() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.displayed(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(12))) {
            Assert.assertTrue(true);
            logger.info("Security options selector Fourteenth title displayed");
        } else {
            Assert.fail();
            logger.info("Security options Fourteenth title is not displayed");
        }
    }

    @Test
    public void securityOptionsFourteenthCheckData() throws InterruptedException {
        MainFeaturesPagePOM mainFeaturesPagePOM =
                new MainFeaturesPagePOM(driver);
        Actions.scrollHelperImplicit(500, driver);
        if (Helper.checkText(mainFeaturesPagePOM.getSecurityOptionsSelectorHelper(12), "Blog")) {
            Assert.assertTrue(true);
            logger.info("Security options selector Fourteenth title is correctly " +
                    "populated");
        } else {
            Assert.fail();
            logger.info("Security options Fourteenth title is not correctly " +
                    "populated");
        }
    }
}
