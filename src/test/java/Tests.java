import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import model.DataProviders;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(DataProviderRunner.class)
public class Tests extends BaseTest {
    @Test
    @UseDataProvider(value = "validUser", location = DataProviders.class)
    public void registrationNewUser(User user) {
        bookingApp.registrationOfNewUser(user);
        assertEquals("Your account", bookingApp.getTextFromUserAccountMenu(".//span[@id = 'profile-menu-trigger--content']"));

        bookingApp.clickAllNavigationMenuItems();
    }
}