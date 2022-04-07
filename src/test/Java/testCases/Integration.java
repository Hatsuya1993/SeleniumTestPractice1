package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IntegrationPagePOM;
import helper.Helper;

import java.util.ArrayList;
import java.util.Arrays;

public class Integration extends Base {

    @Test
    public void checkTheDefaultContent() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if (integrationPagePOM.getPageContent().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Default content for integration is correct");
        } else {
            Assert.fail();
            logger.info("Default content for integration is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPort() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.clickItem(integrationPagePOM.getTravelPort());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel port is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for travel port is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPort() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.clickItem(integrationPagePOM.getTravelPort());
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("travelport")) {
            Assert.assertTrue(true);
            logger.info("Url for travel port is correct");
        } else {
            Assert.fail();
            logger.info("Url for the travel port is incorrect");
        }
    }

    @Test
    public void checkTheTabForAmadeus() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.clickItem(integrationPagePOM.getAmadeus());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Amadeus is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for Amadeus is incorrect");
        }
    }

    @Test
    public void checkTheLinkForAmadeus() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.clickItem(integrationPagePOM.getAmadeus());
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/nevel")) {
            Assert.assertTrue(true);
            logger.info("Url for Amadeus is correct");
        } else {
            Assert.fail();
            logger.info("Url for the Amadeus is incorrect");
        }
    }

    @Test
    public void checkTheTabForAerTicket() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.clickItem(integrationPagePOM.getAerTicket());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for AerTicket is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for AerTicket is incorrect");
        }
    }

    @Test
    public void checkTheLinkForAerTicket() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.clickItem(integrationPagePOM.getAerTicket());
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/aerticket")) {
            Assert.assertTrue(true);
            logger.info("Url for AerTicket is correct");
        } else {
            Assert.fail();
            logger.info("Url for the AerTicket is incorrect");
        }
    }

    @Test
    public void checkTheTabForKiwiFlights() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getKiwiFlights(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for KiwiFlights is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for KiwiFlights is incorrect");
        }
    }

    @Test
    public void checkTheLinkForKiwiFlights() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getKiwiFlights(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/kiwimodule")) {
            Assert.assertTrue(true);
            logger.info("Url for KiwiFlights is correct");
        } else {
            Assert.fail();
            logger.info("Url for the KiwiFlights is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPayouts() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getTravelPayouts(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travelpayouts is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for travelpayouts is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPayouts() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getTravelPayouts(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/travelpayouts")) {
            Assert.assertTrue(true);
            logger.info("Url for travelpayouts is correct");
        } else {
            Assert.fail();
            logger.info("Url for the travelpayouts is incorrect");
        }
    }

    @Test
    public void checkTheTabForViatorTours() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getViatorTours(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for ViatorTours is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for ViatorTours is incorrect");
        }
    }

    @Test
    public void checkTheLinkForViatorTours() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getViatorTours(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/viator")) {
            Assert.assertTrue(true);
            logger.info("Url for ViatorTours is correct");
        } else {
            Assert.fail();
            logger.info("Url for the ViatorTours is incorrect");
        }
    }

    @Test
    public void checkTheTabForHotelbeds () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getHotelBeds(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Hotelbeds is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for Hotelbeds is incorrect");
        }
    }

    @Test
    public void checkTheLinkForHotelbeds () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getHotelBeds(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/hotelbeds")) {
            Assert.assertTrue(true);
            logger.info("Url for Hotelbeds is correct");
        } else {
            Assert.fail();
            logger.info("Url for the Hotelbeds is incorrect");
        }
    }

    @Test
    public void checkTheTabForAgodaHotels () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getAgodaHotels(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for AgodaHotels is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for AgodaHotels is incorrect");
        }
    }

    @Test
    public void checkTheLinkForAgodaHotels () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getAgodaHotels(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/agoda")) {
            Assert.assertTrue(true);
            logger.info("Url for AgodaHotels is correct");
        } else {
            Assert.fail();
            logger.info("Url for the AgodaHotels is incorrect");
        }
    }

    @Test
    public void checkTheTabForRezliveHotel () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getRezliveHotel(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for RezliveHote is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for RezliveHote is incorrect");
        }
    }

    @Test
    public void checkTheLinkForRezliveHotel () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getRezliveHotel(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/rezlive")) {
            Assert.assertTrue(true);
            logger.info("Url for RezliveHote is correct");
        } else {
            Assert.fail();
            logger.info("Url for the RezliveHote is incorrect");
        }
    }

    @Test
    public void checkTheTabForHotelstonHotel () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getHotelstonHotel(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for HotelstonHotel is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for HotelstonHotel is incorrect");
        }
    }

    @Test
    public void checkTheLinkForHotelstonHotel () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getHotelstonHotel(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/hotelston")) {
            Assert.assertTrue(true);
            logger.info("Url for HotelstonHotel is correct");
        } else {
            Assert.fail();
            logger.info("Url for the HotelstonHotel is incorrect");
        }
    }

    @Test
    public void checkTheTabForCRMHubSpot () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getCRMHubSpot(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for getCRMHubSpot is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for getCRMHubSpot is incorrect");
        }
    }

    @Test
    public void checkTheLinkForCRMHubSpot () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getCRMHubSpot(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/hubspot")) {
            Assert.assertTrue(true);
            logger.info("Url for getCRMHubSpot is correct");
        } else {
            Assert.fail();
            logger.info("Url for the getCRMHubSpot is incorrect");
        }
    }

    @Test
    public void checkTheTabForCustomGateways () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getCustomGateways(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for getCustomGateways is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for getCustomGateways is incorrect");
        }
    }

    @Test
    public void checkTheLinkForCustomGateways () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getCustomGateways(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/customegateway")) {
            Assert.assertTrue(true);
            logger.info("Url for getCustomGateways is correct");
        } else {
            Assert.fail();
            logger.info("Url for the getCustomGateways is incorrect");
        }
    }

    @Test
    public void checkTheTabForSetmposYKB () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getSetmposYKB(), driver);
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for SetmposYKB is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for SetmposYKB is incorrect");
        }
    }

    @Test
    public void checkTheLinkForSetmposYKB () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getSetmposYKB(), driver);
        Helper.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/posnet")) {
            Assert.assertTrue(true);
            logger.info("Url for SetmposYKB is correct");
        } else {
            Assert.fail();
            logger.info("Url for the SetmposYKB is incorrect");
        }
    }

    @Test
    public void checkTheLinkForContactUs () throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        Helper.hoverClick(integrationPagePOM.getContactUs(), driver);
        if (driver.getCurrentUrl().contains("contact-us")) {
            Assert.assertTrue(true);
            logger.info("Url for ContactUs is correct");
        } else {
            Assert.fail();
            logger.info("Url for the ContactUs is incorrect");
        }
    }

    @Test
    public void getHeading() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if(integrationPagePOM.getSubHeading().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 sub heading module is displayed");
        }
        else{
            Assert.fail();
            logger.info("2 sub heading module is not displayed");
        }
    }

    @Test
    public void checkHeading() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        ArrayList<String> data = new ArrayList<>(Arrays.asList("Supplier Modules", "Payment Gateways"));
        Boolean available = Helper.checkEachValue(data, integrationPagePOM.getSubHeading());
        if(available){
            Assert.assertTrue(true);
            logger.info("All sub heading values are correctly populated");
        }
        else{
            Assert.fail();
            logger.info("All sub heading values are not correctly populated");
        }
    }

    @Test
    public void checkTitle() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if(integrationPagePOM.getTitle().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Title is displayed");
        }
        else{
            Assert.fail();
            logger.info("Title is not displayed");
        }
    }

    @Test
    public void checkTitleData() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if(integrationPagePOM.getTitle().getText().contains("Integrations Information")){
            Assert.assertTrue(true);
            logger.info("Title is correctly populated");
        }
        else{
            Assert.fail();
            logger.info("Title is not correctly populated");
        }
    }
}