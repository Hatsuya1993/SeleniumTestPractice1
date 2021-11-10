package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class available {

     public static Boolean displayed(WebElement item) throws InterruptedException {
        Thread.sleep(helper.shortWait);
        try{
            ExpectedConditions.visibilityOf(item);
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public static void clickItem(WebElement item) throws InterruptedException {
         Thread.sleep(helper.shortWait);
             if(displayed(item)){
                 item.click();
             }
             else{
                 System.out.println("clickItem Failed");
             }
    }

    public static void switchTab(int tab, WebDriver driver) throws InterruptedException {
         Thread.sleep(helper.shortWait);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(tab));
    }

    public static void goBackCurrent(int tab, WebDriver driver) throws InterruptedException {
        Thread.sleep(helper.shortWait);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs2.get(tab));
    }

}
