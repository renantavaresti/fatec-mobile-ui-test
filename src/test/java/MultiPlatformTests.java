import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import screens.LoginScreen;
import screens.WelcomeScreen;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class MultiPlatformTests {

    @Nested
    class TestAndroid {

        private AppiumDriver<?> androidDriver;

        @BeforeEach
        public void tearUp() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName","Android" );
            caps.setCapability("automationName", "uiautomator2");
            caps.setCapability("app", new File("apps/dummy.apk").getAbsolutePath());
            androidDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        }

        @Test
        public void should_show_welcome_message_to_user(){
            String username = "Lully";
            new LoginScreen(androidDriver).login(username, "123456789");
            Assertions.assertEquals("Hello, ".concat(username), new WelcomeScreen(androidDriver).getWelcomeMessage());
        }

        public void tearDown(){
            androidDriver.quit();
        }
    }


    @Nested
    class TestIOS {

        private AppiumDriver<?> iosDriver;

        @BeforeEach
        public void tearUp() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName","iOS" );
            caps.setCapability("deviceName", "iPhone 8");
            caps.setCapability("automationName" , "XCUITest");
            caps.setCapability("platformVersion", "13.3");
            caps.setCapability("app", new File("apps/dummy.app").getAbsolutePath());
            iosDriver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        }

        @Test
        public void should_show_welcome_message_to_user(){
            String username = "Meiko";
            new LoginScreen(iosDriver).login(username, "123456789");
            Assertions.assertEquals("Hello, ".concat(username), new WelcomeScreen(iosDriver).getWelcomeMessage());
        }

        public void tearDown(){
            iosDriver.quit();
        }
    }
}
