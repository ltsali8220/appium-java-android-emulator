import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class MyTest {
    public static void main(String[] args) {
        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setDeviceName("emulator-5554") // Replace with your emulator ID
                    .setApp("/path/to/your/app.apk") // Local path to APK
                    .setAutomationName("UiAutomator2");

            AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Add test steps here (e.g., find element, click, etc.)

            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}