package testCases;

import helper.available;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IntegrationPagePOM;
import pageObjects.ProductServicesPOM;

import java.util.Arrays;
import java.util.List;

public class ProductServices extends Base {

    @Test
    public void checkTheTitle() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.displayed(productServicesPOM.getTitle());
        if (productServicesPOM.getTitle().isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Title is displayed for product services");
        } else {
            Assert.fail();
            logger.info("Title is not displayed for product services");
        }
    }

    @Test
    public void checkTheTitleData() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.displayed(productServicesPOM.getTitle());
        if (productServicesPOM.getTitle().getText().contains("Product Services")) {
            Assert.assertTrue(true);
            logger.info("Title is correctly populated for product services");
        } else {
            Assert.fail();
            logger.info("Title is not correctly populated for product services");
        }
    }

    @Test
    public void countNumberOfPanel() {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        if(productServicesPOM.getListOfOptions().size() == 9){
            Assert.assertTrue(true);
            logger.info("Number of panels are correctly populated");
        }
        else{
            Assert.fail();
            logger.info("Number of panels are incorrectly populated");
        }
    }

    @Test
    public void checkEachTitleForPanel() {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        List<String> data = Arrays.asList("Installation Web App", "Migrage Website / Upgrade Version", "Troubleshoot", "Additional License", "Payment Gateway Integration", "Extended Support", "Language Pack", "Personal Theme Integration", "XML or Json API Integration", "$100", "$200", "$100", "$100", "$1000", "$100", "$2000", "$2500", "$100");
        Boolean results = available.checkEachValue(data, productServicesPOM.getAllTitleOfOptions());
        if(results){
            Assert.assertTrue(true);
            logger.info("All titles are correctly populated");
        }
        else{
            Assert.fail();
            logger.info("All titles are incorrectly populated");
        }
    }

    @Test
    public void checkTheTabForInstallationWebApp() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getOrderNowForInstallation());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for InstallationWebApp is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for InstallationWebApp is incorrect");
        }
    }

    @Test
    public void checkTheLinkForInstallationWebApp() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getOrderNowForInstallation());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=checkout")) {
            Assert.assertTrue(true);
            logger.info("Url for InstallationWebApp is correct");
        } else {
            Assert.fail();
            logger.info("Url for InstallationWebApp is incorrect");
        }
    }

    @Test
    public void checkTheTabForMigrageWebsite() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getMigrageWebsite());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for MigrageWebsite is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for MigrageWebsite is incorrect");
        }
    }

    @Test
    public void checkTheLinkForMigrageWebsite() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getMigrageWebsite());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=checkout")) {
            Assert.assertTrue(true);
            logger.info("Url for MigrageWebsite is correct");
        } else {
            Assert.fail();
            logger.info("Url for MigrageWebsite is incorrect");
        }
    }

    @Test
    public void checkTheTabTroubleshoot() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getTroubleshoot());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for Troubleshoot is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for Troubleshoot is incorrect");
        }
    }

    @Test
    public void checkTheLinkForTroubleshoot() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getTroubleshoot());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=confproduct&i=0")) {
            Assert.assertTrue(true);
            logger.info("Url for Troubleshoot is correct");
        } else {
            Assert.fail();
            logger.info("Url for Troubleshoot is incorrect");
        }
    }

    @Test
    public void checkTheTabAdditionalLicense() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getAdditionalLicense());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for AdditionalLicense is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for AdditionalLicense is incorrect");
        }
    }

    @Test
    public void checkTheLinkForAdditionalLicense() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getAdditionalLicense());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=confproduct&i=0")) {
            Assert.assertTrue(true);
            logger.info("Url for AdditionalLicense is correct");
        } else {
            Assert.fail();
            logger.info("Url for AdditionalLicense is incorrect");
        }
    }

    @Test
    public void checkTheTabPaymentGateway() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getPaymentGateway());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for PaymentGateway is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for PaymentGateway is incorrect");
        }
    }

    @Test
    public void checkTheLinkForPaymentGateway() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getPaymentGateway());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=confproduct&i=0")) {
            Assert.assertTrue(true);
            logger.info("Url for PaymentGateway is correct");
        } else {
            Assert.fail();
            logger.info("Url for PaymentGateway is incorrect");
        }
    }

    @Test
    public void checkTheTabExtendedSupport() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getExtendedSupport());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for getExtendedSupport is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for getExtendedSupport is incorrect");
        }
    }

    @Test
    public void checkTheLinkForExtendedSupport() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getExtendedSupport());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=checkout")) {
            Assert.assertTrue(true);
            logger.info("Url for ExtendedSupport is correct");
        } else {
            Assert.fail();
            logger.info("Url for ExtendedSupport is incorrect");
        }
    }

    @Test
    public void checkTheTabLanguagePack() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getLanguagePack());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for LanguagePack is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for LanguagePack is incorrect");
        }
    }

    @Test
    public void checkTheLinkForLanguagePack() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getLanguagePack());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=confproduct&i=0")) {
            Assert.assertTrue(true);
            logger.info("Url for LanguagePack is correct");
        } else {
            Assert.fail();
            logger.info("Url for LanguagePack is incorrect");
        }
    }

    @Test
    public void checkTheTabPersonalTheme() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getPersonalTheme());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for PersonalTheme is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for PersonalTheme is incorrect");
        }
    }

    @Test
    public void checkTheLinkForPersonalTheme() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getPersonalTheme());
        available.switchTab(1, driver);
        if (driver.getCurrentUrl().contains("cart.php?a=checkout")) {
            Assert.assertTrue(true);
            logger.info("Url for PersonalTheme is correct");
        } else {
            Assert.fail();
            logger.info("Url for PersonalTheme is incorrect");
        }
    }

    @Test
    public void checkTheTabJsonAPI() throws InterruptedException {
        ProductServicesPOM productServicesPOM = new ProductServicesPOM(driver);
        available.clickItem(productServicesPOM.getJsonAPI());
        if (driver.getWindowHandles().size() == 2) {
            Assert.assertTrue(true);
            logger.info("2 tabs opened for JsonAPI is correct");
        } else {
            Assert.fail();
            logger.info("2 tabs opened for JsonAPI is incorrect");
        }
    }

}
