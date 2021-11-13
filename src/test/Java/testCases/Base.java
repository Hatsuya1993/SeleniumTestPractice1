package testCases;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import utilities.ReadConfig;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {

    ReadConfig readConfig = new ReadConfig();

    public String baseURL = readConfig.getApplicationURL();
    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String br) {
        logger = Logger.getLogger("TestPhpTravels");
        PropertyConfigurator.configure("log4j.properties");
        if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            driver = new ChromeDriver();
        } else if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", readConfig.getFireFoxPath());
            driver = new FirefoxDriver();
        } else if (br.equals("IE")) {
            System.setProperty("Webdriver.ir.driver", readConfig.getIEPath());
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        logger.info("URL opened");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String name) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + name + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }


}
