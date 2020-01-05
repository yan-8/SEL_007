import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

// все технические подробности спрятаны в этом классе, создаётся Driver и здесь он используется
public class BookingApp {
    private WebDriver driver;
    private HomePage homePage;
    private SignUpEmailPage signUpEmailPage;
    private SignUpPasswordPage signUpPasswordPage;

    public BookingApp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));

        homePage = new HomePage(driver);
        signUpEmailPage = new SignUpEmailPage(driver);
        signUpPasswordPage = new SignUpPasswordPage(driver);
    }

    public void registration(User user) {
        homePage.openPage();
        homePage.registerButton.click();
        signUpEmailPage.emailField.sendKeys(user.getEmail());
        signUpEmailPage.getStartedButton.click();
        signUpPasswordPage.waitUntilCreatePasswordFieldVisible();
        signUpPasswordPage.createPasswordField.sendKeys(user.getPassword());
        signUpPasswordPage.confirmPasswordField.sendKeys(user.getPassword());
        signUpPasswordPage.createAccountButton.click();
        signUpPasswordPage.waitUntilYourAccountTextVisible();
    }

    public String getTextFromElement(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }

    public void quit() {
        driver.quit();
    }
}