package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpEmailPage extends Page {
    public SignUpEmailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@id = 'login_name_register']") public WebElement emailField;
    @FindBy(xpath = ".//button[@class = 'bui-button bui-button--large bui-button--wide']") public WebElement getStartedButton;

    public void openPage() {
        driver.get("http://account.booking.com/register");
    }

    public WebElement waitUntilEmailFieldVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id = 'login_name_register']")));
    }

}