package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Actions {

    WebDriver driver;

    public Actions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void scrollHelper(int scroll) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(0,"+scroll+")");
    }

}
