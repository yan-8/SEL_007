import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPasswordPage extends Page {
    public SignUpPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("http://account.booking.com/register/password");
    }

    public WebElement createPasswordField() {
        return driver.findElement(By.xpath(".//input[@id = 'password']"));
    }

    public WebElement confirmPasswordField() {
        return driver.findElement(By.xpath(".//input[@id = 'confirmed_password']"));
    }

    public WebElement createAccountButton() {
        return driver.findElement(By.xpath(".//button[@class = 'bui-button bui-button--large bui-button--wide']"));
    }

    public WebElement waitUntilCreatePasswordFieldVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id = 'password']")));
    }

    public WebElement waitUntilYourAccountTextVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[@class = 'user_name_block']")));
    }
}