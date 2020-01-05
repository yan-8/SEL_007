import org.openqa.selenium.*;

public class SignUpEmailPage extends Page {
    public SignUpEmailPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("http://account.booking.com/register");
    }

    public WebElement emailField() {
        return driver.findElement(By.xpath(".//input[@id = 'login_name_register']"));
    }

    public WebElement getStartedButton() {
        return driver.findElement(By.xpath(".//button[@class = 'bui-button bui-button--large bui-button--wide']"));
    }
}