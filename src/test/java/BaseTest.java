import app.BookingApp;
import org.junit.Before;

public class BaseTest {
    public static ThreadLocal<BookingApp> threadLocalBookingApp = new ThreadLocal<>();
    public BookingApp bookingApp;

    @Before
    public void start() {
        if (threadLocalBookingApp.get() != null) {
            bookingApp = threadLocalBookingApp.get();
            return;
        }

        bookingApp = new BookingApp();
        threadLocalBookingApp.set(bookingApp);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            bookingApp.quit();
            bookingApp = null;
        }));
    }
}