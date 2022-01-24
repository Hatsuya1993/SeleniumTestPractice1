package testCases;

import helper.helper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DemoPagePOM;
import pageObjects.IntegrationPagePOM;
import helper.available;
import helper.Actions;

import java.util.Arrays;
import java.util.List;

public class Integration extends Base{

    @Test
    public void checkTheDefaultContent() {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        if(integrationPagePOM.getPageContent().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Default content for integration is correct");
        }
        else{
            Assert.fail();
            logger.info("Default content for integration is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPort() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPortLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel port is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travel port is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPort() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPortLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("travelport")){
            Assert.assertTrue(true);
            logger.info("Url for travel port is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the travel port is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPortDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPortDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel port doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travel port doc is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPayOut() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travelpayout is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travelpayout is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPayOut() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("travelpayouts")){
            Assert.assertTrue(true);
            logger.info("Url for travelpayouts is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the travelpayouts is incorrect");
        }
    }
    @Test
    public void checkTheTabForTravelPayOutDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travelpayoutdoc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travelpayoutdoc is incorrect");
        }
    }


    @Test
    public void checkTheTitleDataForModules() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        List<String> data = Arrays.asList("Flights Modules", "Hotels Modules", "Tours Modules", "Cars Modules", "Multi-Vendor Manual Modules");
        Boolean results = available.checkEachValue(data, integrationPagePOM.modulesInfo());
        if(results){
            Assert.assertTrue(true);
            logger.info("Modules for integration is correct");
        }
        else{
            Assert.fail();
            logger.info("Modules for integration is incorrect");
        }
    }

    @Test
    public void checkTheLinkForHotelBeds() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getHotelBedsLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("hotelbeds")){
            Assert.assertTrue(true);
            logger.info("Url for hotelbeds is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the hotelbeds is incorrect");
        }
    }

    @Test
    public void checkTheTabForHotelston() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getHotelstonLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Hotelston is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Hotelston is incorrect");
        }
    }

    @Test
    public void checkTheLinkForHotelston() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getHotelstonLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("hotelston")){
            Assert.assertTrue(true);
            logger.info("Url for hotelston is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the hotelston is incorrect");
        }
    }

    @Test
    public void checkTheTabForHotelstonDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getHotelstonDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Hotelston Doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Hotelston Doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForHotelstonDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getHotelstonDoc());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("hotels/hotelston")){
            Assert.assertTrue(true);
            logger.info("Url for hotelston doc is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the hotelston doc is incorrect");
        }
    }

    @Test
    public void checkTheTabForEjuniper() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getEjuniperLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for ejuniper is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for ejuniper is incorrect");
        }
    }

    @Test
    public void checkTheLinkForEjuniper() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getEjuniperLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("ejuniper")){
            Assert.assertTrue(true);
            logger.info("Url for Ejuniper is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the Ejuniper is incorrect");
        }
    }

    @Test
    public void checkTheTabForEjuniperDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getEjuniperDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for ejuniper doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for ejuniper doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForEjuniperDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getEjuniperDoc());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("ejuniper-hotels")){
            Assert.assertTrue(true);
            logger.info("Url for Ejuniper doc is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the Ejuniper doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForExpedia() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getExpediaLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("expedia")){
            Assert.assertTrue(true);
            logger.info("Url for expedia is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the expedia is incorrect");
        }
    }

    @Test
    public void checkTheTabForExpedia() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getExpediaLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Expedia is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Expedia is incorrect");
        }
    }

    @Test
    public void checkTheTabForExpediaDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getExpediaDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Expedia doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Expedia doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForExpediaDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getExpediaDoc());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("docs.phptravels.com")){
            Assert.assertTrue(true);
            logger.info("Url for expedia doc is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the expedia doc is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPayouts() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutsLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel payouts is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travel payouts is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPayouts() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutsLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("travelpayouts")){
            Assert.assertTrue(true);
            logger.info("Url for travelpayouts is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the travelpayouts is incorrect");
        }
    }

    @Test
    public void checkTheTabForTravelPayoutsDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutsDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for travel payouts doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for travel payouts doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTravelPayoutsDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getTravelPayoutsDoc());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("docs.phptravels")){
            Assert.assertTrue(true);
            logger.info("Url for travelpayouts is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the travelpayouts is incorrect");
        }
    }

    @Test
    public void checkTheTabForViators() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getViatorsLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for viators is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for viators is incorrect");
        }
    }

    @Test
    public void checkTheLinkForViators() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getViatorsLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("viator")){
            Assert.assertTrue(true);
            logger.info("Url for viator is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the viator is incorrect");
        }
    }

    @Test
    public void checkTheTabForViatorsDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getViatorsDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for viators doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for viators doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForViatorsDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getViatorsDoc());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("modules/tours/viator")){
            Assert.assertTrue(true);
            logger.info("Url for viator doc is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the viator doc is incorrect");
        }
    }

    @Test
    public void checkTheTabForCartrawler() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getCartrawlerLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Cartrawler is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Cartrawler is incorrect");
        }
    }

    @Test
    public void checkTheLinkForCartrawler() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getCartrawlerLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("cartrawler")){
            Assert.assertTrue(true);
            logger.info("Url for cartrawler is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the cartrawler is incorrect");
        }
    }

    @Test
    public void checkTheTabForKiwitaxi() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getKiwitaxiLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Kiwitaxi is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Kiwitaxi is incorrect");
        }
    }

    @Test
    public void checkTheLinkForKiwitaxi() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getKiwitaxiLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("kiwitaxi")){
            Assert.assertTrue(true);
            logger.info("Url for kiwitaxi is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the kiwitaxi is incorrect");
        }
    }

    @Test
    public void checkTheTabForIway() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getIwayLink());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Iway is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Iway is incorrect");
        }
    }

    @Test
    public void checkTheLinkForIway() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getIwayLink());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("iway")){
            Assert.assertTrue(true);
            logger.info("Url for iway is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the iway is incorrect");
        }
    }

    @Test
    public void checkTheTabForFlightModuleDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getFlightModuleDoc());
        if(driver.getWindowHandles().size() == 2){
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Flight Module Doc is correct");
        }
        else{
            Assert.fail();
            logger.info("2 tabs opened for Flight Module Doc is incorrect");
        }
    }

    @Test
    public void checkTheLinkForFlightModuleDoc() throws InterruptedException {
        IntegrationPagePOM integrationPagePOM = new IntegrationPagePOM(driver);
        available.clickItem(integrationPagePOM.getFlightModuleDoc());
        available.switchTab(1, driver);
        if(driver.getCurrentUrl().contains("standard-flights-module")){
            Assert.assertTrue(true);
            logger.info("Url for FlightModuleDoc is correct");
        }
        else{
            Assert.fail();
            logger.info("Url for the FlightModuleDoc is incorrect");
        }
    }
}
