package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

}
