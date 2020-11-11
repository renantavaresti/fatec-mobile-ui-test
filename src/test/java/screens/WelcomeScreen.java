package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WelcomeScreen extends BaseScreen {

    @AndroidFindBy(id = "welcome_message")
    @iOSXCUITFindBy(id = "labelHello")
    private MobileElement welcomeLabel;

    public WelcomeScreen(RemoteWebDriver driver) {
        super(driver);
    }

    public String getWelcomeMessage(){
        return this.welcomeLabel.getText().trim();
    }
}
