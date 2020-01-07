package pages.pageblocks;

import org.openqa.selenium.*;
import pages.Page;

public class NavigationMenu extends Page {
    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement accommodationMenu() {
        return driver.findElement(By.xpath(".//a[@data-et-click = 'goal:xpb_accommodation goal:xpb_total_clicks']"));
    }

    public WebElement flightsMenu() {
        return driver.findElement(By.xpath(".//a[@data-decider-header = 'flights']"));
    }

    public WebElement carRentalsMenu() {
        return driver.findElement(By.xpath(".//a[@data-ga-track = 'click|Product Expansion|cars|rentalcars (index)']"));
    }

    public WebElement toursAndActivitiesMenu() {
        return driver.findElement(By.xpath(".//a[@data-decider-header = 'attractions']"));
    }

    public WebElement airportTaxisMenu() {
        return driver.findElement(By.xpath(".//a[@data-decider-header = 'rideways']"));
    }


}