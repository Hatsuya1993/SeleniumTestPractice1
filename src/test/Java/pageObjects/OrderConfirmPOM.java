package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPOM {

    WebDriver driver;

    public OrderConfirmPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "button")
    @CacheLookup
    WebElement confirmOrder;

    @FindBy(id = "first_name")
    @CacheLookup
    WebElement first_name;

    @FindBy(id = "last_name")
    @CacheLookup
    WebElement last_name;

    @FindBy(id = "bizname")
    @CacheLookup
    WebElement bizname;

    @FindBy(id = "email")
    @CacheLookup
    WebElement email;

    @FindBy(id = "mobile")
    @CacheLookup
    WebElement mobile;

    public WebElement getConfirmOrder() {
        return confirmOrder;
    }
    public WebElement getFirstName() {
        return first_name;
    }
    public WebElement getLastName() {
        return last_name;
    }
    public WebElement getBizName() {
        return bizname;
    }
    public WebElement getEmail() { return email; }
    public WebElement getMobile() { return mobile; }

    public void handleConfirmOrderForm(String firstNameInput, String lastNameInput, String businessNameInput, String emailInput, String mobileInput) {
        if(firstNameInput != null){
            first_name.sendKeys(firstNameInput);
        }
        if(lastNameInput != null){
            last_name.sendKeys(lastNameInput);
        }
        if(businessNameInput != null){
            bizname.sendKeys(businessNameInput);
        }
        if(emailInput != null){
            email.sendKeys(emailInput);
        }
        if(mobileInput != null){
            mobile.sendKeys(mobileInput);
        }
    }

}
