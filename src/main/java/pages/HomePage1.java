package pages;

import org.openqa.selenium.*;

public class HomePage1 extends Page {
    public HomePage1(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://www.booking.com");
    }

    public WebElement registerButton() {
        return driver.findElement(By.xpath(".//li[@id = 'current_account_create']//div[@class = 'sign_in_wrapper']"));
    }
}