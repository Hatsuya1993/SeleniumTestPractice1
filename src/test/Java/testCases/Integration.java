package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IntegrationPagePOM;
import helper.available;

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
        available.clickItem(integrationPagePOM.getTravelPort());
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
        available.clickItem(integrationPagePOM.getTravelPort());
        available.switchTab(1, driver);
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
        available.clickItem(integrationPagePOM.getAmadeus());
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
        available.clickItem(integrationPagePOM.getAmadeus());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/nevel")) {
            Assert.assertTrue(true);
            logger.info("Url for Amadeus is correct");
        } else {
            Assert.fail();
            logger.info("Url for the Amadeus is incorrect");
        }
    }

    @Test
    public void checkTheTabForAerticket() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getAerticket());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Aerticket is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for Aerticket is incorrect");
        }
    }

    @Test
    public void checkTheLinkForAerticket() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getAerticket());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/aerticket")) {
            Assert.assertTrue(true);
            logger.info("Url for Aerticket is correct");
        } else {
            Assert.fail();
            logger.info("Url for the Aerticket is incorrect");
        }
    }

    @Test
    public void checkTheTabForKiwiFlights() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.hoverClick(integrationPagePOM.getKiwiFlights(), driver);
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
        available.hoverClick(integrationPagePOM.getKiwiFlights(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getTravelPayouts(), driver);
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
        available.hoverClick(integrationPagePOM.getTravelPayouts(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getViatorTours(), driver);
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
        available.hoverClick(integrationPagePOM.getViatorTours(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getHotelBeds(), driver);
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
        available.hoverClick(integrationPagePOM.getHotelBeds(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getAgodaHotels(), driver);
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
        available.hoverClick(integrationPagePOM.getAgodaHotels(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getRezliveHotel(), driver);
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
        available.hoverClick(integrationPagePOM.getRezliveHotel(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getHotelstonHotel(), driver);
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
        available.hoverClick(integrationPagePOM.getHotelstonHotel(), driver);
        available.switchTab(1, driver);
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
        available.hoverClick(integrationPagePOM.getCRMHubSpot(), driver);
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
        available.hoverClick(integrationPagePOM.getCRMHubSpot(), driver);
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("phptravels.gumroad.com/l/hubspot")) {
            Assert.assertTrue(true);
            logger.info("Url for getCRMHubSpot is correct");
        } else {
            Assert.fail();
            logger.info("Url for the getCRMHubSpot is incorrect");
        }
    }

}