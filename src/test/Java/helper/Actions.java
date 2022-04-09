package helper;

import org.openqa.selenium.*;

public class Actions {

    public static void scrollHelper(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void scrollHelperImplicit(int value, WebDriver driver) {
        for (int i = 0; i < value; i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10)"
                    , "");
        }
    }

    public static void zoom(int amount, WebDriver driver) {
        assert amount != 0 && amount > 0;
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.body.style.zoom='" + amount + "%'");
    }

    public static void defaultView(WebDriver driver) {
        WebElement html = driver.findElement(By.tagName("html"));
        html.sendKeys(Keys.chord(Keys.CONTROL, "0"));
    }

}
