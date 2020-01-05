import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPasswordPage extends Page {
    public SignUpPasswordPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get("http://account.booking.com/register/password");
    }

    @FindBy(xpath = ".//input[@id = 'password']") public WebElement createPasswordField;
    @FindBy(xpath = ".//input[@id = 'confirmed_password']") public WebElement confirmPasswordField;
    @FindBy(xpath = ".//button[@class = 'bui-button bui-button--large bui-button--wide']") public WebElement createAccountButton;

    public WebElement waitUntilCreatePasswordFieldVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id = 'password']")));
    }

    public WebElement waitUntilYourAccountTextVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[@class = 'user_name_block']")));
    }
}