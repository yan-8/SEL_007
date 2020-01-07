package app;

import model.User;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import pages.pageblocks.NavigationMenu;

public class BookingApp {
    private WebDriver driver;
    private HomePage1 homePage1; // option 1
    private HomePage2 homePage2; // option 2
    private SignUpEmailPage signUpEmailPage;
    private SignUpPasswordPage signUpPasswordPage;
    private NavigationMenu navigationMenu;

    public BookingApp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));

        homePage1 = new HomePage1(driver); // option 1
        homePage2 = new HomePage2(driver); // option 2
        signUpEmailPage = new SignUpEmailPage(driver);
        signUpPasswordPage = new SignUpPasswordPage(driver);
        navigationMenu = new NavigationMenu(driver);
    }

    // option 1
//    public void registrationOfNewUser(User user) {
//        homePage1.openPage();
//        // выполнить проверку, на "залогинен ли юзер?"
//        homePage1.registerButton().click();
//
//        // ...
//    }

    // option 2
    public void registrationOfNewUser(User user) {
        homePage2.openPage();
//         выполнить проверку, на "залогинен ли юзер?"
        homePage2.registerButton.click();
        signUpEmailPage.waitUntilEmailFieldVisible();
        signUpEmailPage.emailField.sendKeys(user.getEmail());
        signUpEmailPage.getStartedButton.click();
        signUpPasswordPage.waitUntilCreatePasswordFieldVisible();
        signUpPasswordPage.createPasswordField.sendKeys(user.getPassword());
        signUpPasswordPage.confirmPasswordField.sendKeys(user.getPassword());
        signUpPasswordPage.createAccountButton.click();
        signUpPasswordPage.waitUntilYourAccountTextVisible();
        closePopUpWindowIfItIs();
    }

    private void closePopUpWindowIfItIs() {
        if (homePage2.popUpWindow().isDisplayed()) {
            homePage2.closePopUpWindow().click();
        }
    }

    public String getTextFromUserAccountMenu(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }

    public void clickAllNavigationMenuItems() {
        navigationMenu.carRentalsMenu().click();

        // ...
    }

    public void quit() {
        driver.quit();
    }
}