package testCases;

import helper.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HotelsModuleFeaturesPagePOM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelsModuleFeaturesPage extends Base{

    // Check the url is correct
    @Test
    public void checkURL() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(driver.getCurrentUrl().contains("hotels-module-features")){
            Assert.assertTrue(true);
            logger.info("URL is correnct");
        }
        else{
            Assert.fail();
            logger.info("URL is incorrect");
        }
    }

    // Check the title is displayed
    @Test
    public void checkTitleDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHeaderTitle().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Title is displayed");
        }
        else{
            Assert.fail();
            logger.info("Title is not displayed");
        }
    }

    // Check the title is displayed correctly
    @Test
    public void checkTitleCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);
        if(hotelsModuleFeaturesPagePOM.getHeaderTitle().getText().equalsIgnoreCase("Hotels module features")){
            Assert.assertTrue(true);
            logger.info("Title is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("Title is not displayed correctly");
        }
    }

    // Check the title description is displayed
    @Test
    public void checkTitleDescriptionDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHeaderTitleDescription().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("Title description is displayed");
        }
        else{
            Assert.fail();
            logger.info("Title description is not displayed");
        }
    }

    // Check the title description is displayed correctly
    @Test
    public void checkTitleDescriptionCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHeaderTitleDescription().getText().equalsIgnoreCase("Online reservation system - The complete booking system to automate your travel site")){
            Assert.assertTrue(true);
            logger.info("Title description is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("Title description is not displayed correctly");
        }
    }

    // Check the mod 1 title is displayed
    @Test
    public void checkHotelsBookingModuleDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHotelsBookingModuleTitle().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("HotelsBookingModuleTitle is displayed");
        }
        else{
            Assert.fail();
            logger.info("HotelsBookingModuleTitle is not displayed");
        }
    }

    // Check the mod 1 title is  displayed correctly
    @Test
    public void checkHotelsBookingModuleCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHotelsBookingModuleTitle().getText().equalsIgnoreCase("Complete Hotels Booking Module")){
            Assert.assertTrue(true);
            logger.info("HotelsBookingModule is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("HotelsBookingModule is not displayed correctly");
        }
    }

    // Check the mod 1 description is displayed
    @Test
    public void checkHotelsBookingModuleDescriptionDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHotelsBookingModuleDescription().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("HotelsBookingModuleTitle is displayed");
        }
        else{
            Assert.fail();
            logger.info("HotelsBookingModuleTitle is not displayed");
        }
    }

    // Check the mod 1 description is displayed correctly
    @Test
    public void checkHotelsBookingModuleDescriptionCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHotelsBookingModuleDescription().getText().equalsIgnoreCase("Dedicated hotels module with multiple features and functionalities such as adding hotels, rooms, images, text and map locations along with managing full calendar from admin and supplier backend.")){
            Assert.assertTrue(true);
            logger.info("HotelsBookingModule is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("HotelsBookingModule is not displayed correctly");
        }
    }

    // Check the mod 1 image is displayed
    @Test
    public void checkHotelsBookingModuleImageDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getHotelsBookingModuleImage().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("HotelsBookingModuleImage is displayed");
        }
        else{
            Assert.fail();
            logger.info("HotelsBookingModuleImage is not displayed");
        }
    }

    // Check the mod 2 title is displayed
    @Test
    public void checkFullCalendarDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getFullCalendar().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("FullCalendar is displayed");
        }
        else{
            Assert.fail();
            logger.info("FullCalendar is not displayed");
        }
    }

    // Check the mod 2 title is  displayed correctly
    @Test
    public void checkFullCalendarCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getFullCalendar().getText().equalsIgnoreCase("Full Calendar")){
            Assert.assertTrue(true);
            logger.info("FullCalendar is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("FullCalendar is not displayed correctly");
        }
    }

    // Check the mod 2 description is displayed
    @Test
    public void checkFullCalendarDescriptionDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getFullCalendarDescription().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("FullCalendarDescription is displayed");
        }
        else{
            Assert.fail();
            logger.info("FullCalendarDescription is not displayed");
        }
    }

    // Check the mod 2 description is displayed correctly
    @Test
    public void checkFullCalendarDescriptionCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getFullCalendarDescription().getText().equalsIgnoreCase("Full calendar will help you to manage pricing based on dates months weeks, you can also setup availablilty from different dates to days along with half full and partical availability feature offer realtime bookings only on your website and avoid any double booking suppliers hotel")){
            Assert.assertTrue(true);
            logger.info("FullCalendarDescription is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("FullCalendarDescription is not displayed correctly");
        }
    }

    // Check the mod 2 image is displayed
    @Test
    public void checkFullCalendarImageDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getFullCalendarImage().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("FullCalendarImage is displayed");
        }
        else{
            Assert.fail();
            logger.info("FullCalendarImage is not displayed");
        }
    }

    // Check  the main features title is displayed
    @Test
    public void checkMainFeaturesTitleDisplayed() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getMainFeaturesTitle().isDisplayed()){
            Assert.assertTrue(true);
            logger.info("MainFeaturesTitle is displayed");
        }
        else{
            Assert.fail();
            logger.info("MainFeaturesTitle is not displayed");
        }
    }

    // Check the main features title is displayed correctly
    @Test
    public void checkMainFeaturesTitleCorrectly() {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(hotelsModuleFeaturesPagePOM.getMainFeaturesTitle().getText().equalsIgnoreCase("Main Features")){
            Assert.assertTrue(true);
            logger.info("MainFeaturesTitle is displayed correctly");
        }
        else{
            Assert.fail();
            logger.info("MainFeaturesTitle is not displayed correctly");
        }
    }

    //Check the number of features tally
    @Test
    public void checkNumberOfFeatures() throws InterruptedException {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        if(Helper.countCheck(hotelsModuleFeaturesPagePOM.getListOfFeatures(), 9)){
            Assert.assertTrue(true);
            logger.info("NumberOfFeatures is correct");
        }
        else{
            Assert.fail();
            logger.info("NumberOfFeatures is incorrect");
        }
    }

    // Check each feature image is displayed
    @Test
    public void checkEachImageOfFeaturesDisplayed() throws Exception {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        Boolean result = hotelsModuleFeaturesPagePOM.checkEachContentIsDisplayedEachFeature(hotelsModuleFeaturesPagePOM.getListOfFeatures(), "image");
        if(result){
            Assert.assertTrue(true);
            logger.info("All images are displayed");
        }
        else{
            Assert.fail();
            logger.info("An image is not displayed");
        }
    }

    // Check each feature title is displayed
    @Test
    public void checkEacTitleOfFeaturesDisplayed() throws Exception {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);;
        Boolean result = hotelsModuleFeaturesPagePOM.checkEachContentIsDisplayedEachFeature(hotelsModuleFeaturesPagePOM.getListOfFeatures(), "title");
        if(result){
            Assert.assertTrue(true);
            logger.info("All title are displayed");
        }
        else{
            Assert.fail();
            logger.info("A title is not displayed");
        }
    }

    // Check each feature title is displayed correctly
    @Test
    public void checkEacTitleOfFeaturesCorrectly() throws Exception {
        HotelsModuleFeaturesPagePOM hotelsModuleFeaturesPagePOM = new HotelsModuleFeaturesPagePOM(driver);
        List<String> data = new ArrayList<String>(Arrays.asList("Calendar Availability","Hotel Facilities", "Hotel Facilities", "Day wise price", "Seasonal Prices", "Hotel Extranet", "Room wise Settings", "Room Inventory", "Unlimited Member Accounts"));
        Boolean result = hotelsModuleFeaturesPagePOM.checkEachContentIsDisplayedEachFeatureCorrectly(hotelsModuleFeaturesPagePOM.getListOfFeatures(), data, "title");
        if(result){
            Assert.assertTrue(true);
            logger.info("All title are correctly displayed");
        }
        else{
            Assert.fail();
            logger.info("A title incorrectly displayed");
        }
    }

    // Check each feature description is displayed

    // Check each feature description is displayed correctly

    // Check module flow title is displayed

    // Check module flow title is displayed correctly

    // Check module flow description is displayed

    // Check module flow description is displayed correctly

    //Check overview button is displayed

    // Check overview button text is displayed correctly

    // Check click of button move to the demo page by url

    // Check module flow image is displayed

    // Check google map title is displayed

    // Check google map title is displayed correctly

    // Check google map description is displayed

    // Check google map description is displayed correctly

    // Check google map image is displayed

    // Check hotel manage title is displayed

    // Check hotel manage title is displayed correctly

    // Check hotel manage description is displayed

    // Check hotel manage description is displayed correctly

    // Check hotel manage button is displayed

    // Check hotel button text is displayed correctly

    // Check click button move to order page via url

    // Check regions is displayed


}
