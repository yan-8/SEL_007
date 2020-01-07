package pages.pageblocks;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Page;

public class NavigationMenu extends Page {
    public NavigationMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//a[@data-et-click = 'goal:xpb_accommodation goal:xpb_total_clicks']") public WebElement accommodation;
    @FindBy(xpath = ".//a[@data-decider-header = 'flights']") public WebElement flights;
    @FindBy(xpath = ".//a[@data-ga-track = 'click|Product Expansion|cars|rentalcars (index)']") public WebElement carRentals;
    @FindBy(xpath = ".//a[@data-decider-header = 'attractions']") public WebElement toursAndActivities;
    @FindBy(xpath = ".//a[@data-decider-header = 'rideways']") public WebElement airportTaxis;
}