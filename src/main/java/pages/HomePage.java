package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//li[@id = 'current_account_create']//div[@class = 'sign_in_wrapper']") public WebElement registerButton;

    public void openPage() {
        driver.get("https://www.booking.com");
    }
}