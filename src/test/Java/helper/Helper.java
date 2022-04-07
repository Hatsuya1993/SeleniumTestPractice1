package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class Helper {

     public static Boolean displayed(WebElement item) throws InterruptedException {
        Thread.sleep(Constants.shortWait);
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
         Thread.sleep(Constants.shortWait);
             if(displayed(item)){
                 item.click();
                 Thread.sleep(Constants.shortWait);
             }
             else{
                 System.out.println("clickItem Failed");
             }
    }

    public static void switchTab(int tab, WebDriver driver) throws InterruptedException {
         Thread.sleep(Constants.shortWait);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(tab));
    }

    public static void goBackCurrent(int tab, WebDriver driver) throws InterruptedException {
        Thread.sleep(Constants.shortWait);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs2.get(tab));
    }

    public static boolean checkEnabled (WebElement item, WebDriver driver) throws InterruptedException {
        Thread.sleep(Constants.shortWait);
        if(item.isEnabled()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkEachValue (List<String> data, List<WebElement> dataEl) {
         if(data.size() != dataEl.size()) return false;
         for(WebElement i : dataEl){
             System.out.println(i.getText());
             if(!data.contains(i.getText())) return false;
         }
         return true;
    }

    public static void hoverElement (WebElement data, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(data);
    }

    public static void hoverClick(WebElement data, WebDriver driver) throws InterruptedException {
        Thread.sleep(Constants.shortWait);
         Actions actions = new Actions(driver);
        if(displayed(data)){
            actions.moveToElement(data).click(data).perform();
            Thread.sleep(Constants.shortWait);
        }
        else{
            System.out.println("clickItem Failed");
        }
    }

    public static boolean checkText(WebElement expect, String actual) throws InterruptedException {
         if(displayed(expect)){
             if(expect.getText().equalsIgnoreCase(actual)){
                 return true;
             }
         }
         return false;
    }

    public static boolean countCheck(List<WebElement> expect, int actual) throws InterruptedException {
        System.out.println(expect.size());
        System.out.println(actual);
        if(displayed(expect.get(1))){
            if(expect.size() == actual){
                return true;
            }
        }
        return false;
    }

}
